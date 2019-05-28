package com.tcwong.service.impl;

import com.tcwong.bean.Contact;
import com.tcwong.dao.ContactMapper;
import com.tcwong.service.IContactService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContactServiceImpl implements IContactService {

    @Resource
    private ContactMapper contactMapper;

    @Override
    public List<Contact> getAll() {
        List<Contact> contacts = contactMapper.getAll();
        return contacts;
    }
}
