package com.tcwong.service.impl;

import com.tcwong.bean.Driver;
import com.tcwong.common.WebPageResponse;
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

    @Override
    public int addDriver(Driver driver) {
        driver.setAltertime(new Date());
        driver.setCheckintime(new Date());
        return driverMapper.insert(driver);
    }

    @Override
    public int deleteByIds(String ids) {
        String[] split = ids.split(",");
        driverMapper.deleteByIds(split);
        return split.length ;
    }

    @Override
    public int editDriver(Driver driver) {
        driver.setAltertime(new Date());
        return driverMapper.updateByPrimaryKey(driver);
    }

    @Override
    public WebPageResponse getAllDriverByPage(Integer page, Integer size) {
        if (page != null && size != null){
            page = (page-1)*size;
        }
        List<Driver> allDrivers = driverMapper.getAllDriverByPage(page, size);
        return new WebPageResponse(driverMapper.getTotal(),allDrivers);
    }
}
