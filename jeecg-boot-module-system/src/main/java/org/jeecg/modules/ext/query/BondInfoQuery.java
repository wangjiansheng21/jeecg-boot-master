package org.jeecg.modules.ext.query;

import lombok.Data;

import java.util.Date;

/**
 * @Author jiansheng.wang
 * @Date 2021/3/18 12:25
 */
@Data
public class BondInfoQuery extends BaseQuery {
    //企业名称
    private String spName;

    //所属行业
    private String industry;

    //截止日期
    private Date untilDate;

}
