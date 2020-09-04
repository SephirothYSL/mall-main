package com.qfedu.controller;

import com.qfedu.pojo.UmsAdmin;
import com.qfedu.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Buffer
 * @date 2020/9/4 13:12
 * @description
 */
@RestController
@RequestMapping("admin")
@Api(tags = "UmsAdminController", description = "后台用户管理")
public class UmsAdminController {

    @Autowired
    private UmsAdminService umsAdminService;

    @PostMapping("login")
    @ApiOperation(value = "用户注册")
    public UmsAdmin login(String username, String password) {
        return umsAdminService.login(username, password);
    }
}