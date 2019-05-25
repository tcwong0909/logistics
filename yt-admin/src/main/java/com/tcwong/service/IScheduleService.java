package com.tcwong.service;

import com.tcwong.bean.Scheduling;
import com.tcwong.common.WebPageResponse;

import java.util.List;

public interface IScheduleService {
    int dispatchById(Scheduling scheduling);

    WebPageResponse getSchedules(Integer page, Integer size, Integer schedulingid, Integer fkCarriersid, String sendcompany, String receivecompany);

    int deleteMore(List<Scheduling> scheduleList);
}
