package com.tcwong.service.impl;

import com.tcwong.bean.Carriers;
import com.tcwong.bean.Scheduling;
import com.tcwong.bean.Truck;
import com.tcwong.bean.User;
import com.tcwong.common.WebPageResponse;
import com.tcwong.dao.CarriersMapper;
import com.tcwong.dao.SchedulingMapper;
import com.tcwong.dao.TruckMapper;
import com.tcwong.service.IScheduleService;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class ScheduleServiceImpl implements IScheduleService {

    @Resource
    private SchedulingMapper schedulingMapper;
    @Resource
    private CarriersMapper carriersMapper;
    @Resource
    private TruckMapper truckMapper;

    @Override
    public int dispatchById(Scheduling scheduling) {
        scheduling.setFkUserid(((User)(SecurityUtils.getSubject().getSession().getAttribute("user"))).getUserid());
        scheduling.setCheckintime(new Date());
        scheduling.setAltertime(new Date());
        schedulingMapper.insert(scheduling);
        Truck truck = new Truck();
        truck.setTruckid(scheduling.getFkTruckid());
        truck.setState(1);
        truckMapper.updateByPrimaryKeySelective(truck);
        Carriers carriers = new Carriers();
        carriers.setCarriersid(scheduling.getFkCarriersid());
        carriers.setFinishedstate(2);
        carriers.setAltertime(new Date());
        carriersMapper.updateByPrimaryKeySelective(carriers);
        return 1;
    }
    @Override
    public WebPageResponse getSchedules(Integer page, Integer size, Integer schedulingid,
                                        Integer fkCarriersid, String sendcompany, String receivecompany) {
        if (page != null && size != null) {
            page = (page-1)*size;
        }
        return new WebPageResponse(schedulingMapper.getTotal(schedulingid,fkCarriersid,sendcompany,receivecompany),
                schedulingMapper.getAllByPage(page,size,schedulingid,fkCarriersid,sendcompany,receivecompany));
    }
    @Override
    public int deleteMore(List<Scheduling> scheduleList) {
        int size = scheduleList.size();
        StringBuilder schedulingidBuilder = new StringBuilder();
        StringBuilder fkTruckidBuilder = new StringBuilder();
        StringBuilder fkCarriersidBuilder = new StringBuilder();
        scheduleList.forEach((schedule)->{
            Integer schedulingid = schedule.getSchedulingid();
            Integer fkTruckid = schedule.getFkTruckid();
            Integer fkCarriersid = schedule.getFkCarriersid();
            if (schedulingid != null) {
                schedulingidBuilder.append(schedulingid).append(",");
            }
            if (fkTruckid != null) {
                fkTruckidBuilder.append(fkTruckid).append(",");
            }
            if (fkCarriersid != null) {
                fkCarriersidBuilder.append(fkCarriersid).append(",");
            }
        });
        String[] schedulingIds = schedulingidBuilder.toString().split(",");
        String[] carriersIds = fkCarriersidBuilder.toString().split(",");
        String[] truckIds = fkTruckidBuilder.toString().split(",");
        schedulingMapper.deleteByIds(schedulingIds);
        carriersMapper.updateByIds(carriersIds);
        truckMapper.updateByIds(truckIds);
        return size;
    }

    @Override
    public int addCost(Scheduling scheduling) {
        scheduling.setAltertime(new Date());
        Integer fkCarriersid = scheduling.getFkCarriersid();
        Carriers carriers = new Carriers();
        carriers.setFinishedstate(4);
        carriers.setCarriersid(fkCarriersid);
        carriersMapper.updateByPrimaryKeySelective(carriers);
        return schedulingMapper.updateByPrimaryKeySelective(scheduling);
    }
}
