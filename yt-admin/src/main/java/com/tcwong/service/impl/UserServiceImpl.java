package com.tcwong.service.impl;

import com.tcwong.bean.User;
import com.tcwong.common.WebPageResponse;
import com.tcwong.dao.UserMapper;
import com.tcwong.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int deleteByIds(String ids) {
        String[] split = ids.split(",");

        userMapper.deleteByIds(split);
        return split.length;
    }

    @Override
    public int editUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public WebPageResponse getAllByPage(Integer page, Integer size, String username, String account,
                                        Integer sex, Integer fkRoleid) {
        if (page != null && size != null) {
            page = (page-1)*size;
        }

        return new WebPageResponse(userMapper.getTotal(username,account,sex,fkRoleid),userMapper.getAllByPage(page,
                size,username,account,sex,fkRoleid));
    }
}
