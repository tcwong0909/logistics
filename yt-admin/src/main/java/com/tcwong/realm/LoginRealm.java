package com.tcwong.realm;

import com.tcwong.bean.User;
import com.tcwong.service.ILoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class LoginRealm extends AuthorizingRealm {
    @Resource
    private ILoginService loginService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String)authenticationToken.getPrincipal();
        Session session = SecurityUtils.getSubject().getSession();
        List<User> userList = loginService.login(username);
        User user = userList.get(0);
        session.setAttribute("user",user);
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user.getAccount(), user.getPassword(), ByteSource.Util.bytes(user.getAccount()), getName());
        return info;
    }
}
