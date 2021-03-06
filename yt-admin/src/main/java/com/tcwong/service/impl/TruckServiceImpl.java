package com.tcwong.service.impl;

import com.tcwong.bean.Truck;
import com.tcwong.bean.TruckExample;
import com.tcwong.common.WebPageResponse;
import com.tcwong.dao.TruckMapper;
import com.tcwong.service.ITruckService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

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

    @Override
    public WebPageResponse search(Integer page, Integer size, String number, String type, Integer fkTeamid) {
        if (page!=null && size!=null){
            page = (page - 1) * size;
        }
        return new WebPageResponse(truckMapper.getSearchTotal(number,type,fkTeamid),truckMapper.getALLSearch(page,size,number,type,fkTeamid));
    }

    @Override
    public List<Truck> selectTruck() {
        TruckExample truckExample = new TruckExample();
        TruckExample.Criteria criteria = truckExample.createCriteria();
        criteria.andStateEqualTo(2);
        List<Truck> trucks = truckMapper.selectByExample(truckExample);
        return trucks;
    }


}
