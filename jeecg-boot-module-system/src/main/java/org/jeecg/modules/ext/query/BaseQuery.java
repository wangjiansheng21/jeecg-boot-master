package org.jeecg.modules.ext.query;

import lombok.Data;

/**
 * @Author jiansheng.wang
 * @Date 2021/3/18 12:25
 */
@Data
public class BaseQuery {
    //
    private Integer pageSize = 10;

    //
    private Integer pageNo = 1;

    private Integer offSet;

    private Integer getOffSet() {
        return (pageNo - 1) * pageSize;
    }
}
