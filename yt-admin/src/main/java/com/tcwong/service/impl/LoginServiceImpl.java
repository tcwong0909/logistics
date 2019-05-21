package com.tcwong.service.impl;


import com.tcwong.bean.User;
import com.tcwong.bean.UserExample;
import com.tcwong.dao.UserMapper;
import com.tcwong.service.ILoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class LoginServiceImpl implements ILoginService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> login(String account) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAccountEqualTo(account);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public int login() {
        return 0;
    }
}
