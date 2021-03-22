package org.jeecg.modules.ext.vo;

import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.util.Date;

/**
 * @Author jiansheng.wang
 * @Date 2021/3/18 11:36
 */
@Data
public class SpInfoStaticsVO {

    private Integer id;
    //企业名称
    @Excel(name = "企业名称", width = 15)
    private String spName;
    //所属行业
    @Excel(name = "所属行业", width = 15)
    private String industry;

    @Excel(name = "风险程度", width = 15)
    private String riskLevel;
    //企业性质
    @Excel(name = "企业性质", width = 15)
    private String enterpriseNature;

    @Excel(name = "债券余额(亿元)", width = 15)
    //债券余额(亿元)
    private String bondBalance;
    //最新发债日
    @Excel(name = "最新发债日", width = 15, format = "yyyy-MM-dd")
    private Date latestIssuanceDate;
    //最新发行债券代码
    @Excel(name = "最新发行债券代码", width = 15)
    private String latestBondIssueCode;
    //最新评级
    @Excel(name = "最新评级", width = 15)
    private String latestRating;
    //评级日
    @Excel(name = "评级日", width = 15, format = "yyyy-MM-dd")
    private Date ratingDate;
    //主营业务收入(万元)
    @Excel(name = "主营业务收入(万元)", width = 15)
    private String mainBusinessIncome;
    //主营报告期
    @Excel(name = "主营报告期", width = 15, format = "yyyy-MM-dd")
    private Date reportingPeriod;
    //净资产(万元)
    @Excel(name = "净资产(万元)", width = 15)
    private String netWorth;
    //净资产报告期
    @Excel(name = "净资产报告期", width = 15, format = "yyyy-MM-dd")
    private Date netWorthReportingPeriod;
    //所属省市
    @Excel(name = "所属省市", width = 15)
    private String province;
    //所属县市
    @Excel(name = "所属县市", width = 15)
    private String city;
    //是否上市
    @Excel(name = "是否上市", width = 15)
    private String listed;
    //成立日期
    @Excel(name = "成立日期", width = 15, format = "yyyy-MM-dd")
    private Date buildDate;
    //注册资本(万元)
    @Excel(name = "注册资本(万元)", width = 15)
    private String registeredCapital;

    @Excel(name = "员工人数", width = 15)
    //员工人数
    private Integer numberEmployees;
    @Excel(name = "公司简介", width = 15)
    //公司简介
    private String companyProfile;
    @Excel(name = "第一大股东", width = 15)
    //第一大股东
    private String largestStockholder;

    @Excel(name = "股东性质", width = 15)
    //股东性质
    private String natureShareholders;
    @Excel(name = "注册地址", width = 15)
    //注册地址
    private String registeredAddress;
    @Excel(name = "办公地址", width = 15)
    //办公地址
    private String businessAddress;
    @Excel(name = "电话", width = 15)
    //电话
    private String mobile;
    @Excel(name = "传真", width = 15)
    //传真
    private String fax;
    @Excel(name = "公司网址", width = 15)
    //公司网址
    private String websiteAddress;
    @Excel(name = "所属行业一级", width = 15)
    //所属行业一级
    private String industry1;
    @Excel(name = "所属行业二级", width = 15)
    //所属行业二级
    private String industry2;
    @Excel(name = "所属行业三级", width = 15)
    //所属行业三级
    private String industry3;
    @Excel(name = "所属行业四级", width = 15)
    //所属行业四级
    private String industry4;

    //债券只数
    @Excel(name = "债券只数", width = 15)
    private Integer bondNum;

    //当前总余额(亿)
    @Excel(name = "当前总余额(亿)", width = 15)
    private Double currentBalance;

    private Date createdTime;

    @Excel(name = "更新时间", width = 15, format = "yyyy-MM-dd HH:mm:ss")
    private Date updatedTime;

}
