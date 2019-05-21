package com.tcwong.service;

import com.tcwong.bean.User;

import java.util.List;

public interface ILoginService {

    /**
     * 登录
     * @param account
     * @return
     */
    List<User> login(String account);

    /**
     * 注销登录
     * @return
     */
    int login();
}
