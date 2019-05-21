package com.tcwong.service.impl;

import com.tcwong.bean.Truck;
import com.tcwong.common.WebPageResponse;
import com.tcwong.dao.TruckMapper;
import com.tcwong.service.ITruckService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TruckServiceImpl implements ITruckService {

    @Resource
    private TruckMapper truckMapper;
    @Override
    public int addTruck(Truck truck) {
        return truckMapper.insert(truck);
    }

    @Override
    public List<Truck> getAllTrucks() {
        return truckMapper.selectByExample(null);
    }

    @Override
    public WebPageResponse getAllTrucksByPage(Integer page, Integer size) {
        if (page!=null && size!=null){
            page = (page - 1) * size;
        }
        return new WebPageResponse(truckMapper.getTotal(),truckMapper.getAllTrucksByPage(page, size));
    }


}
