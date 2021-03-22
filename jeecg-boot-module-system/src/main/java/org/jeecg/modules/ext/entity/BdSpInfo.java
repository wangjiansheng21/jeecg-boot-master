package org.jeecg.modules.ext.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.io.Serializable;

/**
 * (BdSpInfo)表实体类
 *
 * @author jiansheng.wang
 * @since 2021-03-17 20:35:50
 */
@SuppressWarnings("serial")
@Data
public class BdSpInfo extends Model<BdSpInfo> {
    
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
    @Excel(name = "最新发债日", width = 15)
    private Date latestIssuanceDate;
    //最新发行债券代码
    @Excel(name = "最新发行债券代码", width = 15)
    private String latestBondIssueCode;
    //最新评级
    @Excel(name = "最新评级", width = 15)
    private String latestRating;
    //评级日
    @Excel(name = "评级日", width = 15)
    private Date ratingDate;
    //主营业务收入(万元)
    @Excel(name = "主营业务收入(万元)", width = 15)
    private String mainBusinessIncome;
    //主营报告期
    @Excel(name = "主营报告期", width = 15)
    private Date reportingPeriod;
    //净资产(万元)
    @Excel(name = "净资产(万元)", width = 15)
    private String netWorth;
    //净资产报告期
    @Excel(name = "净资产报告期", width = 15)
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
    private String  websiteAddress;
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

    
    private Date createdTime;
    
    private Date updatedTime;

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }
    
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
    
    public String getEnterpriseNature() {
        return enterpriseNature;
    }

    public void setEnterpriseNature(String enterpriseNature) {
        this.enterpriseNature = enterpriseNature;
    }
    
    public String getBondBalance() {
        return bondBalance;
    }

    public void setBondBalance(String bondBalance) {
        this.bondBalance = bondBalance;
    }
    
    public Date getLatestIssuanceDate() {
        return latestIssuanceDate;
    }

    public void setLatestIssuanceDate(Date latestIssuanceDate) {
        this.latestIssuanceDate = latestIssuanceDate;
    }
    
    public String getLatestBondIssueCode() {
        return latestBondIssueCode;
    }

    public void setLatestBondIssueCode(String latestBondIssueCode) {
        this.latestBondIssueCode = latestBondIssueCode;
    }
    
    public String getLatestRating() {
        return latestRating;
    }

    public void setLatestRating(String latestRating) {
        this.latestRating = latestRating;
    }
    
    public Date getRatingDate() {
        return ratingDate;
    }

    public void setRatingDate(Date ratingDate) {
        this.ratingDate = ratingDate;
    }
    
    public String getMainBusinessIncome() {
        return mainBusinessIncome;
    }

    public void setMainBusinessIncome(String mainBusinessIncome) {
        this.mainBusinessIncome = mainBusinessIncome;
    }
    
    public Date getReportingPeriod() {
        return reportingPeriod;
    }

    public void setReportingPeriod(Date reportingPeriod) {
        this.reportingPeriod = reportingPeriod;
    }
    
    public String getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(String netWorth) {
        this.netWorth = netWorth;
    }
    
    public Date getNetWorthReportingPeriod() {
        return netWorthReportingPeriod;
    }

    public void setNetWorthReportingPeriod(Date netWorthReportingPeriod) {
        this.netWorthReportingPeriod = netWorthReportingPeriod;
    }
    
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public String getListed() {
        return listed;
    }

    public void setListed(String listed) {
        this.listed = listed;
    }

    
    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }
    
    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }
    
    public String getCompanyProfile() {
        return companyProfile;
    }

    public void setCompanyProfile(String companyProfile) {
        this.companyProfile = companyProfile;
    }
    
    public String getLargestStockholder() {
        return largestStockholder;
    }

    public void setLargestStockholder(String largestStockholder) {
        this.largestStockholder = largestStockholder;
    }
    
    public String getNatureShareholders() {
        return natureShareholders;
    }

    public void setNatureShareholders(String natureShareholders) {
        this.natureShareholders = natureShareholders;
    }
    
    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }
    
    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }
    
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
    
    public String getWebsiteAddress() {
        return  websiteAddress;
    }

    public void setWebsiteAddress(String  websiteAddress) {
        this. websiteAddress =  websiteAddress;
    }
    
    public String getIndustry1() {
        return industry1;
    }

    public void setIndustry1(String industry1) {
        this.industry1 = industry1;
    }
    
    public String getIndustry2() {
        return industry2;
    }

    public void setIndustry2(String industry2) {
        this.industry2 = industry2;
    }
    
    public String getIndustry3() {
        return industry3;
    }

    public void setIndustry3(String industry3) {
        this.industry3 = industry3;
    }
    
    public String getIndustry4() {
        return industry4;
    }

    public void setIndustry4(String industry4) {
        this.industry4 = industry4;
    }
    
    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
    
    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    }