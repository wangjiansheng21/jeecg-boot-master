package org.jeecg.modules.ext.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.io.Serializable;

/**
 * 债券存续情况(BdBondInfo)表实体类
 *
 * @author jiansheng.wang
 * @since 2021-03-17 20:36:54
 */
@SuppressWarnings("serial")
public class BdBondInfo extends Model<BdBondInfo> {
    
    private Integer id;
    @Excel(name = "交易代码", width = 15)
    private String transactionCode;
    //债券简称
    @Excel(name = "债券简称", width = 15)
    private String bondShortName;
    //债券全称
    @Excel(name = "债券全称", width = 15)
    private String bondFullName;
    //发行人
    @Excel(name = "发行人", width = 15)
    private String publisher;
    //ccxi行业
    @Excel(name = "ccxi行业", width = 15)
    private String ccxiIndustry;
    //发行日期
    @Excel(name = "发行日期", width = 15,format = "yyyy-MM-dd")
    private Date publishDate;
    //气息日
    @Excel(name = "起息日", width = 15,format = "yyyy-MM-dd")
    private Date valueDate;
    //到期日
    @Excel(name = "到期日期", width = 15,format = "yyyy-MM-dd")
    private Date expireDate;
    //发行期限
    @Excel(name = "发行期限", width = 15,format = "yyyy-MM-dd")
    private Double releaseDeadline;
    //发行总额
    @Excel(name = "发行总额", width = 15)
    private Double offerAmount;
    //当前余额(亿)
    @Excel(name = "当前余额(亿)", width = 15)
    private Double currentBalance;
    //票面利率(当期)%
    @Excel(name = "票面利率(当期)%", width = 15)
    private Double couponRate;
    //利率品种
    @Excel(name = "利率品种", width = 15)
    private String varietiesRates;
    //担保人
    @Excel(name = "担保人", width = 15)
    private String bondsman;
    //特殊条款
    @Excel(name = "特殊条款", width = 15)
    private String specificItems;
    //回售日
    @Excel(name = "回售日", width = 15)
    private String backDate;
    //下一行权日
    @Excel(name = "下一行权日", width = 15)
    private String nextRowRightDay;
    //债券品种
    @Excel(name = "债券品种", width = 15)
    private String varietiesBonds;
    //上市地点
    @Excel(name = "上市地点", width = 15)
    private String listingLocation;
    //主承销商
    @Excel(name = "主承销商", width = 15)
    private String leadUnderwriter;
    //评级公司
    @Excel(name = "评级公司", width = 15)
    private String ratingFirms;
    //发行主体信用等级(发行时)
    @Excel(name = "发行主体信用等级(发行时)", width = 15)
    private String creditLevel;
    //主体最新
    @Excel(name = "主体最新", width = 15)
    private String latestBody;
    //最新评级展望
    @Excel(name = "最新评级展望", width = 15)
    private String latestRatingOutlook;
    //发行时债项等级
    @Excel(name = "发行时债项等级", width = 15)
    private String publishLevel;
    //最新债项等级
    @Excel(name = "最新债项等级", width = 15)
    private String latestLevel;
    //偿付顺序
    @Excel(name = "偿付顺序", width = 15)
    private String payOrder;
    
    private Date createdTime;
    
    private Date updatedTime;
    //企业客户id
    private Integer spId;

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }
    
    public String getBondShortName() {
        return bondShortName;
    }

    public void setBondShortName(String bondShortName) {
        this.bondShortName = bondShortName;
    }
    
    public String getBondFullName() {
        return bondFullName;
    }

    public void setBondFullName(String bondFullName) {
        this.bondFullName = bondFullName;
    }
    
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public String getCcxiIndustry() {
        return ccxiIndustry;
    }

    public void setCcxiIndustry(String ccxiIndustry) {
        this.ccxiIndustry = ccxiIndustry;
    }
    
    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
    
    public Date getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }
    
    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
    
    public Double getReleaseDeadline() {
        return releaseDeadline;
    }

    public void setReleaseDeadline(Double releaseDeadline) {
        this.releaseDeadline = releaseDeadline;
    }
    
    public Double getOfferAmount() {
        return offerAmount;
    }

    public void setOfferAmount(Double offerAmount) {
        this.offerAmount = offerAmount;
    }
    
    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }
    
    public Double getCouponRate() {
        return couponRate;
    }

    public void setCouponRate(Double couponRate) {
        this.couponRate = couponRate;
    }
    
    public String getVarietiesRates() {
        return varietiesRates;
    }

    public void setVarietiesRates(String varietiesRates) {
        this.varietiesRates = varietiesRates;
    }
    
    public String getBondsman() {
        return bondsman;
    }

    public void setBondsman(String bondsman) {
        this.bondsman = bondsman;
    }
    
    public String getSpecificItems() {
        return specificItems;
    }

    public void setSpecificItems(String specificItems) {
        this.specificItems = specificItems;
    }
    
    public String getBackDate() {
        return backDate;
    }

    public void setBackDate(String backDate) {
        this.backDate = backDate;
    }
    
    public String getNextRowRightDay() {
        return nextRowRightDay;
    }

    public void setNextRowRightDay(String nextRowRightDay) {
        this.nextRowRightDay = nextRowRightDay;
    }
    
    public String getVarietiesBonds() {
        return varietiesBonds;
    }

    public void setVarietiesBonds(String varietiesBonds) {
        this.varietiesBonds = varietiesBonds;
    }
    
    public String getListingLocation() {
        return listingLocation;
    }

    public void setListingLocation(String listingLocation) {
        this.listingLocation = listingLocation;
    }
    
    public String getLeadUnderwriter() {
        return leadUnderwriter;
    }

    public void setLeadUnderwriter(String leadUnderwriter) {
        this.leadUnderwriter = leadUnderwriter;
    }
    
    public String getRatingFirms() {
        return ratingFirms;
    }

    public void setRatingFirms(String ratingFirms) {
        this.ratingFirms = ratingFirms;
    }
    
    public String getCreditLevel() {
        return creditLevel;
    }

    public void setCreditLevel(String creditLevel) {
        this.creditLevel = creditLevel;
    }
    
    public String getLatestBody() {
        return latestBody;
    }

    public void setLatestBody(String latestBody) {
        this.latestBody = latestBody;
    }
    
    public String getLatestRatingOutlook() {
        return latestRatingOutlook;
    }

    public void setLatestRatingOutlook(String latestRatingOutlook) {
        this.latestRatingOutlook = latestRatingOutlook;
    }
    
    public String getPublishLevel() {
        return publishLevel;
    }

    public void setPublishLevel(String publishLevel) {
        this.publishLevel = publishLevel;
    }
    
    public String getLatestLevel() {
        return latestLevel;
    }

    public void setLatestLevel(String latestLevel) {
        this.latestLevel = latestLevel;
    }
    
    public String getPayOrder() {
        return payOrder;
    }

    public void setPayOrder(String payOrder) {
        this.payOrder = payOrder;
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
    
    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
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