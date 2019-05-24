package com.tcwong.service;

import com.tcwong.bean.Driver;
import com.tcwong.common.WebPageResponse;

public interface IDriverService {
    int addDriver(Driver driver);

    int deleteByIds(String ids);

    int editDriver(Driver driver);

    WebPageResponse getAllDriverByPage(Integer page, Integer size,String name,Integer fkTeamid,Integer state);
}
