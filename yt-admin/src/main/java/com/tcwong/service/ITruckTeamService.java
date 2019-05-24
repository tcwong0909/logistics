package com.tcwong.service;

import com.tcwong.bean.Truckteam;
import com.tcwong.common.WebPageResponse;

public interface ITruckTeamService {
    int addTruckTeam(Truckteam truckteam);

    int deleteByIds(String ids);

    int editTruckTeam(Truckteam truckteam);

    WebPageResponse getAllByPage(Integer page,Integer size,String  teamname,String leader);
}
