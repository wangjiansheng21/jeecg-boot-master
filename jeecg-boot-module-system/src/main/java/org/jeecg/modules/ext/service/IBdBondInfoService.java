package org.jeecg.modules.ext.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.jeecg.common.api.vo.Result;
import org.jeecg.modules.ext.entity.BdBondInfo;
import org.jeecg.modules.ext.query.BondInfoQuery;
import org.jeecg.modules.ext.query.SpInfoStaticsQuery;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author jiansheng.wang
 * @Date 2021/3/17 20:44
 */
public interface IBdBondInfoService extends IService<BdBondInfo> {

    Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) throws IOException;

    /**
     * 企业维度统计债券信息
     *
     * @param spInfoStaticsQuery
     * @return
     */
    Result<?> getSpInfoStaticsList(SpInfoStaticsQuery spInfoStaticsQuery);


    /**
     * 债券明细列表查询
     *
     * @param bondInfoQuery
     * @return
     */
    Result<?> getBondInfoList(BondInfoQuery bondInfoQuery);

}
