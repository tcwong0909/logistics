package com.tcwong.controller;

import com.tcwong.bean.User;
import com.tcwong.common.WebResponse;
import com.tcwong.service.ILoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {

    @Resource
    private ILoginService loginService;

    @PostMapping("/login")
    public WebResponse login(@RequestBody User user){
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(new UsernamePasswordToken(user.getAccount(), user.getPassword()));
            User user1 = loginService.login(user.getAccount()).get(0);
            return WebResponse.success(user1);
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }
        return WebResponse.failed("登录失败");
    }

    @PostMapping("/logout")
    public WebResponse logout(){
        Session session = SecurityUtils.getSubject().getSession();
        session.stop();
        return WebResponse.success("注销成功");
    }
}