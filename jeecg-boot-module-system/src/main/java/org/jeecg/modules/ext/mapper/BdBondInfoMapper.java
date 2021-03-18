package org.jeecg.modules.ext.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.jeecg.modules.ext.entity.BdBondInfo;
import org.jeecg.modules.ext.query.BondInfoQuery;
import org.jeecg.modules.ext.query.SpInfoStaticsQuery;
import org.jeecg.modules.ext.vo.BondInfoVO;
import org.jeecg.modules.ext.vo.SpInfoStaticsVO;

import java.util.List;

/**
 * @Author jiansheng.wang
 * @Date 2021/3/17 20:40
 */
public interface BdBondInfoMapper extends BaseMapper<BdBondInfo> {
    /**
     * 企业维度汇总统计债券信息
     *
     * @param spInfoStaticsQuery
     * @return
     */
    List<SpInfoStaticsVO> getSpInfoStaticsList(SpInfoStaticsQuery spInfoStaticsQuery);

    Long getSpInfoStaticsCount(SpInfoStaticsQuery spInfoStaticsQuery);

    Long getBondInfoCount(BondInfoQuery bondInfoQuery);

    List<BondInfoVO> getBondInfoList(BondInfoQuery bondInfoQuery);
}
