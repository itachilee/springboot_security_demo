package com.reason.gsny.service;

import com.reason.gsny.entity.SysUser;


public interface UserService {

    /**
     * 根据用户名获取系统用户
     */
    SysUser getUserByName(String username);

}
