package com.tcwong.controller;

import com.tcwong.bean.User;
import com.tcwong.common.WebPageResponse;
import com.tcwong.common.WebResponse;
import com.tcwong.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Resource
    private IUserService userService;

    @PostMapping("/add")
    public WebResponse addUser(@RequestBody User user) {
        int num = userService.addUser(user);
        if (num > 0) {
            return WebResponse.success("添加成功");
        }
        return WebResponse.failed("添加失败");
    }

    @DeleteMapping("/delete/{ids}")
    public WebResponse deleteByIds(@PathVariable String ids) {
        int num = userService.deleteByIds(ids);
        if (num > 0) {
            return WebResponse.success("删除成功");
        }
        return WebResponse.failed("删除失败");
    }

    @PutMapping("/edit")
    public WebResponse editUser(@RequestBody User user) {
        int num = userService.editUser(user);
        if (num > 0) {
            return WebResponse.success("修改成功");
        }
        return WebResponse.failed("删除失败");
    }

    @PostMapping("/getAllByPage")
    public WebResponse getAllByPage(Integer page, Integer size, String username,
                                    String account, Integer sex, Integer fkRoleid) {
        WebPageResponse pageResponse = userService.getAllByPage(page, size, username, account, sex, fkRoleid);
        if (pageResponse != null) {
            return WebResponse.success(pageResponse, "查询成功");
        }
        return WebResponse.failed("查询失败");
    }

    @PutMapping("/password")
    public WebResponse editPassword(@RequestBody User user) {
        int num = userService.editPassword(user);
        if (num == 0) {
            WebResponse.failed("密码不对，请重新输入");
        } else if (num > 0) {
            WebResponse.success("密码修改成功，请重新登录");
        }
        return WebResponse.failed("修改失败，请重新输入");
    }

}
