package com.tcwong.service.impl;

import com.tcwong.bean.Contact;
import com.tcwong.common.WebPageResponse;
import com.tcwong.dao.ContactMapper;
import com.tcwong.service.IContactService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ContactServiceImpl implements IContactService {

    @Resource
    private ContactMapper contactMapper;


    @Override
    public WebPageResponse getAll(Integer page, Integer size, Integer fkTruckid, Integer fkDriverid, String drivername,
                                  String teamname, Integer bindId) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        return new WebPageResponse(contactMapper.getTotal(fkTruckid,fkDriverid,drivername,
                teamname, bindId),contactMapper.getAll(page,size,fkTruckid,fkDriverid,drivername,
                teamname, bindId));
    }

    @Override
    public int bindTruck(Contact contact) {
        return contactMapper.updateByPrimaryKeySelective(contact);
    }

    @Override
    public int unbindTrucks(String ids) {
        String[] split = ids.split(",");

        contactMapper.unbindTrucks(split);
        return split.length;
    }


}
