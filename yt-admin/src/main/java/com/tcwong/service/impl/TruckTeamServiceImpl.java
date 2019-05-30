package com.tcwong.service.impl;

import com.tcwong.bean.Truckteam;
import com.tcwong.common.WebPageResponse;
import com.tcwong.dao.TruckteamMapper;
import com.tcwong.service.ITruckTeamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class TruckTeamServiceImpl implements ITruckTeamService {
    @Resource
    private TruckteamMapper truckteamMapper;
    @Override
    public int addTruckTeam(Truckteam truckteam) {
        truckteam.setCheckintime(new Date());
        truckteam.setAltertime(new Date());
        return truckteamMapper.insert(truckteam);
    }

    @Override
    public int deleteByIds(String ids) {
        String[] split = ids.split(",");
        return truckteamMapper.deleteByIds(split);
    }

    @Override
    public int editTruckTeam(Truckteam truckteam) {
        truckteam.setAltertime(new Date());

        return truckteamMapper.updateByPrimaryKeySelective(truckteam);
    }

    @Override
    public WebPageResponse getAllByPage(Integer page, Integer size, String teamname, String leader) {
        if (page != null && size != null) {
            page = (page-1)*size;
        }

        return new WebPageResponse(truckteamMapper.getTotal(teamname,leader),truckteamMapper.getALlTruckTeamByPage(page,size,teamname,leader));
    }
}
