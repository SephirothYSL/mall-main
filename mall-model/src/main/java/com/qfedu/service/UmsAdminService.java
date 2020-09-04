package com.qfedu.service;

import com.qfedu.pojo.UmsAdmin;

/**
 * @author Buffer
 * @date 2020/9/4 13:20
 * @description
 */
public interface UmsAdminService {
    UmsAdmin login(String username, String password);
}
