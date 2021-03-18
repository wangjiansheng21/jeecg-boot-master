package org.jeecg.modules.ext.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.jeecg.common.api.vo.Result;
import org.jeecg.modules.ext.entity.BdBondInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author jiansheng.wang
 * @Date 2021/3/17 20:44
 */
public interface IBdBondInfoService extends IService<BdBondInfo> {

    Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
