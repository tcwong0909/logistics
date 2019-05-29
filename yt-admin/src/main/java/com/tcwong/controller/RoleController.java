package com.tcwong.controller;

import com.tcwong.bean.Role;
import com.tcwong.common.Log;
import com.tcwong.common.LogdicType;
import com.tcwong.common.WebResponse;
import com.tcwong.service.IRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 角色
 */
@RestController
@RequestMapping("/role/")
public class RoleController {

    @Resource
    private IRoleService roleService;

    @Log(behavior = "角色添加",fkTypeid = LogdicType.ADD)
    @PostMapping("/add")
    public WebResponse addRole(@RequestBody Role role, HttpServletRequest request) {
        int num = roleService.addRole(role);
        if (num > 0) {
            return WebResponse.success("添加成功");
        }
        return WebResponse.failed("添加失败");
    }

    @Log(behavior = "角色删除",fkTypeid = LogdicType.DELETE)
    @DeleteMapping("/delete/{id}")
    public WebResponse deleteById(@PathVariable Integer id, HttpServletRequest request) {
        int num = roleService.deleteById(id);
        if (num > 0) {
            return WebResponse.success("删除成功");
        }
        return WebResponse.failed("删除失败");
    }

    @Log(behavior = "角色修改",fkTypeid = LogdicType.UPDATE)
    @PutMapping("/edit")
    public WebResponse editRole(@RequestBody Role role, HttpServletRequest request) {
        int num = roleService.editRole(role);
        if (num > 0) {
            return WebResponse.success("修改成功");
        }
        return WebResponse.failed("修改失败");
    }

    @GetMapping("/getAll")
    public WebResponse getAllRoles(HttpServletRequest request){
        List<Role> allRoles = roleService.getAllRoles();
        if (allRoles != null) {
            return WebResponse.success(allRoles);
        }
        return WebResponse.failed("查询失败");
    }
}
