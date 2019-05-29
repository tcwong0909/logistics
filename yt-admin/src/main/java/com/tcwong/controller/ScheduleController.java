package com.tcwong.controller;

import com.tcwong.bean.Scheduling;
import com.tcwong.common.WebPageResponse;
import com.tcwong.common.WebResponse;
import com.tcwong.service.IScheduleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/schedule/")
public class ScheduleController {

    @Resource
    private IScheduleService scheduleService;

    @PutMapping("/dispatch")
    public WebResponse dispatchById(@RequestBody Scheduling scheduling, HttpServletRequest request) {

        int num = scheduleService.dispatchById(scheduling);
        if (num > 0) {
            return WebResponse.success("已调度");
        }
        return WebResponse.failed("调度失败");
    }

    @PostMapping("/getAllByPage")
    public WebResponse getSchedules(Integer page, Integer size, Integer schedulingid,Integer fkCarriersid,String sendcompany,String receivecompany){
        WebPageResponse pageResponse = scheduleService.getSchedules(page, size, schedulingid, fkCarriersid, sendcompany, receivecompany);
        if (pageResponse != null) {
            return WebResponse.success(pageResponse, "查询成功");
        }
        return WebResponse.failed("查询失败");
    }

    @PostMapping("/delete")
    public WebResponse deleteMore(@RequestBody List<Scheduling> scheduleList) {
        int num = scheduleService.deleteMore(scheduleList);
        if (num > 0) {
            return WebResponse.success("删除成功");
        }
        return WebResponse.failed("删除失败");
    }

}
