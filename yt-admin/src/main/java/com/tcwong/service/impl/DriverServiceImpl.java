package com.tcwong.service.impl;

import com.tcwong.bean.Contact;
import com.tcwong.bean.Driver;
import com.tcwong.common.WebPageResponse;
import com.tcwong.dao.ContactMapper;
import com.tcwong.dao.DriverMapper;
import com.tcwong.service.IDriverService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class DriverServiceImpl implements IDriverService {

    @Resource
    private DriverMapper driverMapper;
    @Resource
    private ContactMapper contactMapper;

    @Override
    public int addDriver(Driver driver) {
        driver.setAltertime(new Date());
        driver.setCheckintime(new Date());
        driverMapper.insert(driver);
        Integer driverid = driver.getDriverid();
        Contact contact = new Contact();
        contact.setFkDriverid(driverid);
        return contactMapper.insert(contact);
    }

    @Override
    public int deleteByIds(String ids) {
        String[] split = ids.split(",");
        driverMapper.deleteByIds(split);
        contactMapper.deleteByIds(split);
        return split.length ;
    }

    @Override
    public int editDriver(Driver driver) {
        driver.setAltertime(new Date());
        return driverMapper.updateByPrimaryKey(driver);
    }

    @Override
    public WebPageResponse getAllDriverByPage(Integer page, Integer size,String name,Integer fkTeamid,Integer state) {
        if (page != null && size != null){
            page = (page-1)*size;
        }
        List<Driver> allDrivers = driverMapper.getAllDriverByPage(page, size,name,fkTeamid,state);
        return new WebPageResponse(driverMapper.getTotal(name,fkTeamid,state),allDrivers);
    }
}
