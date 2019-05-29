package com.tcwong.controller;

import com.tcwong.bean.Scheduling;
import com.tcwong.common.Log;
import com.tcwong.common.LogdicType;
import com.tcwong.common.WebPageResponse;
import com.tcwong.common.WebResponse;
import com.tcwong.service.IScheduleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 成本维护
 */
@RestController
@RequestMapping("/cost/")
public class CostController {

    @Resource
    private IScheduleService scheduleService;


    @PostMapping("/getAllByPage")
    public WebResponse getAllByPage(Integer page,Integer size,Integer schedulingid,Integer fkCarriersid, HttpServletRequest request){
        WebPageResponse pageResponse = scheduleService.getSchedules(page, size, schedulingid, fkCarriersid, null, null);
        if (pageResponse != null) {
            return WebResponse.success(pageResponse, "查询成功");
        }
        return WebResponse.failed("查询失败");
    }

    @Log(behavior = "成本添加",fkTypeid = LogdicType.ADD)
    @PutMapping("/add")
    public WebResponse addCost(@RequestBody Scheduling scheduling, HttpServletRequest request){
        int num = scheduleService.addCost(scheduling);
        if (num > 0) {
            return WebResponse.success("添加成功");
        }
        return WebResponse.failed("添加失败");
    }
}
