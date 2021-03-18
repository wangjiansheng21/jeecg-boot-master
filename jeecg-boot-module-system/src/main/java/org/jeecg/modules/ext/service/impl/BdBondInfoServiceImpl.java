package org.jeecg.modules.ext.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.api.client.json.Json;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.util.ImportExcelUtil;
import org.jeecg.modules.ext.entity.BdBondInfo;
import org.jeecg.modules.ext.entity.BdSpInfo;
import org.jeecg.modules.ext.mapper.BdBondInfoMapper;
import org.jeecg.modules.ext.mapper.BdSpInfoMapper;
import org.jeecg.modules.ext.query.BondInfoQuery;
import org.jeecg.modules.ext.query.SpInfoStaticsQuery;
import org.jeecg.modules.ext.service.IBdBondInfoService;
import org.jeecg.modules.ext.vo.BondInfoVO;
import org.jeecg.modules.ext.vo.SpInfoStaticsVO;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * @Author jiansheng.wang
 * @Date 2021/3/17 20:45
 */
@Service
@Slf4j
public class BdBondInfoServiceImpl extends ServiceImpl<BdBondInfoMapper, BdBondInfo> implements IBdBondInfoService {

    @Autowired
    BdSpInfoMapper bdSpInfoMapper;

    @Autowired
    BdBondInfoMapper bdBondInfoMapper;


    @Override
    public synchronized Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) throws IOException {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
        // 错误信息
        List<String> errorMessage = new ArrayList<>();
        int successLines = 0, errorLines = 0;
        for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
            MultipartFile file = entity.getValue();// 获取上传文件对象
            ImportParams params = new ImportParams();
            params.setNeedSave(false);
            try {
                Map<String, Integer> spName2spId = new HashMap<>();
                Wrapper<BdSpInfo> bdSpInfoQueryWrapper = new QueryWrapper<>();
                //导入企业客户
                List<BdSpInfo> bdSpInfos = ExcelImportUtil.importExcel(file.getInputStream(), BdSpInfo.class, params);

                for (int i = 0; i < bdSpInfos.size(); i++) {
                    bdSpInfoQueryWrapper.clear();
                    successLines++;
                    BdSpInfo bdSpInfo = bdSpInfos.get(i);
                    ((QueryWrapper<BdSpInfo>) bdSpInfoQueryWrapper)
                            .eq("sp_name", bdSpInfo.getSpName())
                            .select("id");
                    BdSpInfo spInfo = bdSpInfoMapper.selectOne(bdSpInfoQueryWrapper);
                    if (spInfo == null) {
                        bdSpInfoMapper.insert(bdSpInfo);
                    } else {
                        bdSpInfo.setId(spInfo.getId());
                        bdSpInfo.setUpdatedTime(new Date());
                        bdSpInfoMapper.updateById(bdSpInfo);
                    }
                    spName2spId.put(bdSpInfo.getSpName(), bdSpInfo.getId());
                }
                params.setSheetNum(2);
                List<BdBondInfo> bdBondInfoList = ExcelImportUtil.importExcel(file.getInputStream(), BdBondInfo.class, params);
                Wrapper<BdBondInfo> bdBondInfoWrapper = new QueryWrapper<>();
                for (BdBondInfo bdBondInfo : bdBondInfoList) {
                    if (StringUtils.isEmpty(bdBondInfo.getTransactionCode())) {
                        continue;
                    }
                    bdBondInfoWrapper.clear();
                    bdSpInfoQueryWrapper.clear();
                    ((QueryWrapper<BdBondInfo>) bdBondInfoWrapper).eq("transaction_code", bdBondInfo.getTransactionCode())
                            .select("id");
                    BdBondInfo bdBondInfoTmp = bdBondInfoMapper.selectOne(bdBondInfoWrapper);
                    Integer spId = spName2spId.get(bdBondInfo.getPublisher());
                    if (spId == null) {
                        ((QueryWrapper<BdSpInfo>) bdSpInfoQueryWrapper)
                                .eq("sp_name", bdBondInfo.getPublisher())
                                .select("id");
                        BdSpInfo spInfo = bdSpInfoMapper.selectOne(bdSpInfoQueryWrapper);
                        if (spInfo != null) {
                            spName2spId.put(spInfo.getSpName(), spInfo.getId());
                            spId = spInfo.getId();
                        }
                    }
                    if (bdBondInfoTmp == null) {
                        //插入
                        bdBondInfo.setSpId(spId);
                        bdBondInfoMapper.insert(bdBondInfo);
                    } else {
                        //更新
                        bdBondInfo.setId(bdBondInfoTmp.getId());
                        bdBondInfo.setUpdatedTime(new Date());
                        bdBondInfo.setSpId(spId);
                        bdBondInfoMapper.updateById(bdBondInfo);
                    }
                }
            } catch (Exception e) {
                errorMessage.add("发生异常：" + e.getMessage());
                log.error(e.getMessage(), e);
            } finally {
                try {
                    file.getInputStream().close();
                } catch (IOException e) {
                    log.error(e.getMessage(), e);
                }
            }
        }
        return Result.OK();
    }

    @Override
    public Result<?> getSpInfoStaticsList(SpInfoStaticsQuery spInfoStaticsQuery) {
        log.info("getSpInfoStaticsList:{}", spInfoStaticsQuery.toString());
        Result result = new Result();
        IPage page = new Page(spInfoStaticsQuery.getPageNo(), spInfoStaticsQuery.getPageSize());
        Long count = bdBondInfoMapper.getSpInfoStaticsCount(spInfoStaticsQuery);
        page.setTotal(count);
        //分页查询
        List<SpInfoStaticsVO> spInfoStaticsList = bdBondInfoMapper.getSpInfoStaticsList(spInfoStaticsQuery);
        page.setRecords(spInfoStaticsList);
        page.setCurrent(spInfoStaticsQuery.getPageNo());
        result.setResult(page);
        return result;
    }

    @Override
    public Result<?> getBondInfoList(BondInfoQuery bondInfoQuery) {
        log.info("getBondInfoList:{}", bondInfoQuery.toString());
        Result result = new Result();
        IPage page = new Page(bondInfoQuery.getPageNo(), bondInfoQuery.getPageSize());
        Long count = bdBondInfoMapper.getBondInfoCount(bondInfoQuery);
        //分页查询
        List<BondInfoVO> bdBondInfoMapperBondInfoList = bdBondInfoMapper.getBondInfoList(bondInfoQuery);
        page.setRecords(bdBondInfoMapperBondInfoList);
        page.setCurrent(bondInfoQuery.getPageNo());
        page.setTotal(count);
        result.setResult(page);
        return result;
    }
}
