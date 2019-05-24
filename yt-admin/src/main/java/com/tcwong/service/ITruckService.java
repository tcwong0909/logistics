package com.tcwong.service;

import com.tcwong.bean.Truck;
import com.tcwong.common.WebPageResponse;

public interface ITruckService {
    int addTruck(Truck truck);


    WebPageResponse getAllTrucksByPage(Integer page, Integer size);

    int  editTruck(Truck truck);

    int deleteByIds(String ids);

    WebPageResponse search(Integer page, Integer size, String number, String type, Integer fkTeamid);
}
