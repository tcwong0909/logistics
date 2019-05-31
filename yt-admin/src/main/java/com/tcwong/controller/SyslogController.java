package com.tcwong.controller;
import com.tcwong.common.WebPageResponse;
import com.tcwong.common.WebResponse;
import com.tcwong.service.ISyslogService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/syslog/")
public class SyslogController {

    @Resource
    private ISyslogService syslogService;

    @PostMapping("/getAllByPage")
    public WebResponse getAllSyslog(Integer page, Integer size, String behavior, String fkTypeid,
                                    String fkUserid , Integer isexception) {
        WebPageResponse pageResponse = syslogService.getAllSyslog(page, size, behavior, fkTypeid, fkUserid, isexception);
        if (pageResponse != null) {
            return WebResponse.success(pageResponse, "查询成功");
        }
        return WebResponse.failed("查询失败");
    }
}
