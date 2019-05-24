package com.tcwong.controller;

import com.tcwong.bean.Truckteam;
import com.tcwong.common.WebPageResponse;
import com.tcwong.common.WebResponse;
import com.tcwong.service.ITruckTeamService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/truckTeam/")
public class TruckTeamController {

    @Resource
    private ITruckTeamService truckTeamService;

    @PostMapping("/add")
    public WebResponse addTruckTeam(@RequestBody Truckteam truckteam){

        int num = truckTeamService.addTruckTeam(truckteam);
        if (num > 0) {
            return WebResponse.success("添加成功");
        }
        return WebResponse.failed("添加失败");
    }

    @DeleteMapping("/delete/{ids}")
    public WebResponse deleteByIds(@PathVariable String ids) {
        int num = truckTeamService.deleteByIds(ids);
        if (num > 0) {
            return WebResponse.success("删除成功");
        }
        return WebResponse.failed("删除失败");
    }

    @PutMapping("/put")
    public WebResponse editTruckTeam(@RequestBody Truckteam truckteam) {
        int num = truckTeamService.editTruckTeam(truckteam);
        if (num > 0) {
            return WebResponse.success("修改成功");
        }
        return WebResponse.failed("修改失败");
    }
    @PostMapping("/getAllByPage")
    public WebResponse getAllByPage(Integer page,Integer size,String teamname,String leader) {
        WebPageResponse webPageResponse = truckTeamService.getAllByPage(page, size,teamname,leader);
        if (webPageResponse != null) {
            return WebResponse.success(webPageResponse, "查询成功");
        }
        return WebResponse.failed("查询失败");
    }

}
