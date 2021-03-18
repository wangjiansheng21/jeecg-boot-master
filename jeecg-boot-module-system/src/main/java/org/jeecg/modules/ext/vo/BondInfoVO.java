package org.jeecg.modules.ext.vo;

import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.util.Date;

/**
 * @Author jiansheng.wang
 * @Date 2021/3/18 12:28
 */
@Data
public class BondInfoVO {
    private Integer id;
    //企业客户id
    private Integer spId;
    //企业名称
    @Excel(name = "企业名称", width = 15)
    private String spName;
    //所属行业
    @Excel(name = "所属行业", width = 15)
    private String industry;
    //企业性质
    @Excel(name = "企业性质", width = 15)
    private String enterpriseNature;

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
    @Excel(name = "发行日期", width = 15, format = "yyyy-MM-dd")
    private Date publishDate;
    //气息日
    @Excel(name = "起息日", width = 15, format = "yyyy-MM-dd")
    private Date valueDate;
    //到期日
    @Excel(name = "到期日期", width = 15, format = "yyyy-MM-dd")
    private Date expireDate;
    //发行期限
    @Excel(name = "发行期限", width = 15, format = "yyyy-MM-dd")
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

    @Excel(name = "更新时间", width = 15, format = "yyyy-MM-dd HH:mm:ss")
    private Date updatedTime;

}
