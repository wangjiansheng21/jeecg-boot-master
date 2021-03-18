package org.jeecg.modules.ext.controller;

import org.jeecg.common.api.vo.Result;
import org.jeecg.modules.ext.service.IBdBondInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
}
