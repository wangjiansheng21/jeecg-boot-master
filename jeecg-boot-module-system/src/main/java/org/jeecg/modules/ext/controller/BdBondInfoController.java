package org.jeecg.modules.ext.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.shiro.SecurityUtils;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.common.system.vo.LoginUser;
import org.jeecg.common.util.oConvertUtils;
import org.jeecg.modules.ext.entity.BdSpInfo;
import org.jeecg.modules.ext.query.BondInfoQuery;
import org.jeecg.modules.ext.query.SpInfoStaticsQuery;
import org.jeecg.modules.ext.service.IBdBondInfoService;
import org.jeecg.modules.ext.vo.BondInfoVO;
import org.jeecg.modules.ext.vo.SpInfoStaticsVO;
import org.jeecg.modules.system.entity.SysUser;
import org.jeecgframework.poi.excel.def.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.view.JeecgEntityExcelView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author jiansheng.wang
 * @Date 2021/3/17 20:39
 */
@RestController
@RequestMapping("/bondInfo")
public class BdBondInfoController {

    @Autowired
    IBdBondInfoService bdBondInfoService;

    /**
     * 通过excel导入数据
     *
     * @param request
     * @param response
     * @return
     */
    //@RequiresRoles({"admin"})
    //@RequiresPermissions("user:import")
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return bdBondInfoService.importExcel(request, response);
    }

    /**
     * 企业维度统计债券信息
     *
     * @param spInfoStaticsQuery
     * @return
     */
    @RequestMapping(value = "/getSpInfoStaticsList", method = RequestMethod.POST)
    public Result<?> getSpInfoStaticsList(@RequestBody SpInfoStaticsQuery spInfoStaticsQuery) {
        return bdBondInfoService.getSpInfoStaticsList(spInfoStaticsQuery);
    }


    /**
     * 债券明细列表查询
     *
     * @param bondInfoQuery
     * @return
     */
    @RequestMapping(value = "/getBondInfoList", method = RequestMethod.POST)
    public Result<?> getBondInfoList(@RequestBody BondInfoQuery bondInfoQuery) {
        return bdBondInfoService.getBondInfoList(bondInfoQuery);
    }

    /**
     * 导出企业债券统计
     *
     * @param spInfoStaticsQuery
     */
    @RequestMapping(value = "/exportSpInfoStaticsList")
    public ModelAndView exportSpInfoStaticsList(@RequestBody SpInfoStaticsQuery spInfoStaticsQuery) {
        //查询企业债券统计
        spInfoStaticsQuery.setPageSize(10000);
        spInfoStaticsQuery.setPageNo(1);
        Result<?> result = this.getSpInfoStaticsList(spInfoStaticsQuery);
        IPage page = null;
        if (result != null) {
            page = (IPage) result.getResult();
        }
        // 导出Excel
        ModelAndView mv = new ModelAndView(new JeecgEntityExcelView());
        //导出文件名称
        String sheetName = "企业债券统计";
        mv.addObject(NormalExcelConstants.FILE_NAME, sheetName);
        mv.addObject(NormalExcelConstants.CLASS, SpInfoStaticsVO.class);
        ExportParams exportParams = new ExportParams(sheetName, null, sheetName);
        mv.addObject(NormalExcelConstants.PARAMS, exportParams);
        mv.addObject(NormalExcelConstants.DATA_LIST, page.getRecords());
        return mv;
    }

    @RequestMapping(value = "/exportBondInfoList")
    public ModelAndView exportBondInfoList(@RequestBody BondInfoQuery bondInfoQuery) {
        //查询企业债券明细
        bondInfoQuery.setPageSize(10000);
        bondInfoQuery.setPageNo(1);
        Result<?> result = this.getBondInfoList(bondInfoQuery);
        IPage page = null;
        if (result != null) {
            page = (IPage) result.getResult();
        }
        // 导出Excel
        ModelAndView mv = new ModelAndView(new JeecgEntityExcelView());
        //导出文件名称
        String sheetName = "客户续存明细";
        mv.addObject(NormalExcelConstants.FILE_NAME, sheetName);
        mv.addObject(NormalExcelConstants.CLASS, BondInfoVO.class);
        ExportParams exportParams = new ExportParams(sheetName, null, sheetName);
        mv.addObject(NormalExcelConstants.PARAMS, exportParams);
        mv.addObject(NormalExcelConstants.DATA_LIST, page.getRecords());
        return mv;
    }
}
