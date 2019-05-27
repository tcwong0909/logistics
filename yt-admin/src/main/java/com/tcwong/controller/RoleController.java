package com.tcwong.controller;

import com.tcwong.bean.Role;
import com.tcwong.common.WebResponse;
import com.tcwong.service.IRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/role/")
public class RoleController {

    @Resource
    private IRoleService roleService;

    @PostMapping("/add")
    public WebResponse addRole(@RequestBody Role role) {
        int num = roleService.addRole(role);
        if (num > 0) {
            return WebResponse.success("添加成功");
        }
        return WebResponse.failed("添加失败");
    }

    @DeleteMapping("/delete/{id}")
    public WebResponse deleteById(@PathVariable Integer id) {
        int num = roleService.deleteById(id);
        if (num > 0) {
            return WebResponse.success("删除成功");
        }
        return WebResponse.failed("删除失败");
    }

    @PutMapping("/edit")
    public WebResponse editRole(@RequestBody Role role) {
        int num = roleService.editRole(role);
        if (num > 0) {
            return WebResponse.success("修改成功");
        }
        return WebResponse.failed("修改失败");
    }

    @GetMapping("/getAll")
    public WebResponse getAllRoles(){
        List<Role> allRoles = roleService.getAllRoles();
        if (allRoles != null) {
            return WebResponse.success(allRoles);
        }
        return WebResponse.failed("查询失败");
    }
}
