package com.qfedu.service.impl;

import com.qfedu.dao.UmsAdminMapper;
import com.qfedu.pojo.UmsAdmin;
import com.qfedu.pojo.UmsAdminExample;
import com.qfedu.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Buffer
 * @date 2020/9/4 13:20
 * @description
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {

    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Override
    public UmsAdmin login(String username, String password) {

        UmsAdminExample umsAdminExample = new UmsAdminExample();

        UmsAdminExample.Criteria criteria = umsAdminExample.createCriteria();

        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);

        List<UmsAdmin> umsAdmins = umsAdminMapper.selectByExample(umsAdminExample);

        if (umsAdmins.size() > 0) {
            return umsAdmins.get(0);
        }

        return null;
    }
}