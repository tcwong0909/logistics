package com.tcwong.service.impl;

import com.tcwong.bean.User;
import com.tcwong.common.WebPageResponse;
import com.tcwong.dao.UserMapper;
import com.tcwong.service.IUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(User user) {
        String password = new Md5Hash("123456").toString();
        user.setPassword((new Md5Hash(password,user.getAccount(),1024)).toString());
        user.setCheckintime(new Date());
        user.setAltertime(new Date());
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
        user.setAltertime(new Date());
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

    @Override
    public int editPassword(User user) {
        Integer userid = ((User) (SecurityUtils.getSubject().getSession()
                .getAttribute("user"))).getUserid();
        user.setUserid(userid);
        String password = userMapper.selectByPrimaryKey(user.getUserid()).getPassword();
        String oldPassword = new Md5Hash(user.getOldPassword(), ((User) (SecurityUtils.getSubject().getSession()
                .getAttribute("user"))).getAccount(), 1024).toString();
        if (!oldPassword.equals(password)) {
            return 0;
        }
        Md5Hash md5Hash = new Md5Hash(user.getPassword(), ((User) (SecurityUtils.getSubject().getSession().getAttribute("user"))).getAccount(), 1024);
        user.setPassword(md5Hash.toString());
        int i = userMapper.updateByPrimaryKeySelective(user);
        return i ;
    }


}
