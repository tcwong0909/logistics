package com.tcwong.controller;

import com.tcwong.bean.Contact;
import com.tcwong.common.WebResponse;
import com.tcwong.service.IContactService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/contact/")
public class ContactController {

    @Resource
    private IContactService contactService;

    @GetMapping("/getAll")
    public WebResponse getContact() {
        List<Contact> contacts = contactService.getAll();
        if (contacts != null) {
            return WebResponse.success(contacts);
        }
        return WebResponse.failed("查询失败");
    }
}
