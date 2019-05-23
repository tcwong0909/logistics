package com.tcwong.service.impl;

import com.tcwong.bean.Truck;
import com.tcwong.common.WebPageResponse;
import com.tcwong.dao.TruckMapper;
import com.tcwong.service.ITruckService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class TruckServiceImpl implements ITruckService {

    @Resource
    private TruckMapper truckMapper;
    @Override
    public int addTruck(Truck truck) {
        truck.setAltertime(new Date());
        truck.setCheckintime(new Date());

        return truckMapper.insert(truck);
    }


    @Override
    public WebPageResponse getAllTrucksByPage(Integer page, Integer size) {
        if (page!=null && size!=null){
            page = (page - 1) * size;
        }
        return new WebPageResponse(truckMapper.getTotal(),truckMapper.getAllTrucksByPage(page, size));
    }

    @Override
    public int editTruck(Truck truck) {
        truck.setAltertime(new Date());
        return truckMapper.updateByPrimaryKeySelective(truck);
    }

    @Override
    public int deleteByIds(String ids) {

        String[] split = ids.split(",");
        truckMapper.deleteByIds(split);
        return split.length;
    }


}
