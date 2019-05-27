package com.tcwong.service;

import com.tcwong.bean.User;
import com.tcwong.common.WebPageResponse;

public interface IUserService {
    int addUser(User user);

    int deleteByIds(String ids);

    int editUser(User user);

    WebPageResponse getAllByPage(Integer page, Integer size, String username, String account, Integer sex, Integer fkRoleid);
}
