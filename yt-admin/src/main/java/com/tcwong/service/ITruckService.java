package com.tcwong.service;

import com.tcwong.bean.Truck;
import com.tcwong.common.WebPageResponse;

import java.util.List;

public interface ITruckService {
    int addTruck(Truck truck);

    List<Truck> getAllTrucks();

    WebPageResponse getAllTrucksByPage(Integer page, Integer size);
}
