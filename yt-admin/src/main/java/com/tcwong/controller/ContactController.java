package com.tcwong.controller;

import com.tcwong.bean.Contact;
import com.tcwong.common.WebPageResponse;
import com.tcwong.common.WebResponse;
import com.tcwong.service.IContactService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/contact/")
public class ContactController {

    @Resource
    private IContactService contactService;

    @PutMapping("/put")
    public WebResponse bindTruck(@RequestBody Contact contact) {
        int num = contactService.bindTruck(contact);
        if (num > 0) {
            return WebResponse.success("绑定成功");
        }
        return WebResponse.failed("绑定失败");
    }

    @PutMapping("/delete/{ids}")
    public WebResponse unbindTrucks(String ids) {
        int num = contactService.unbindTrucks(ids);
        if (num > 0) {
            return WebResponse.success("解除成功");
        }
        return WebResponse.failed("解除失败");
    }

    @GetMapping("/getAll")
    public WebResponse getContact(Integer page,Integer size,Integer fkTruckid,Integer fkDriverid,String drivername,
                                  String teamname,Integer bindId) {
        WebPageResponse pageResponse = contactService.getAll( page,size,fkTruckid,fkDriverid,drivername,
                teamname, bindId);
        if (pageResponse != null) {
            return WebResponse.success(pageResponse,"查询成功");
        }
        return WebResponse.failed("查询失败");
    }

}
