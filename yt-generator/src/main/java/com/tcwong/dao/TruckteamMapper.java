package com.tcwong.dao;

import com.tcwong.bean.Truckteam;
import com.tcwong.bean.TruckteamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TruckteamMapper {
    int countByExample(TruckteamExample example);

    int deleteByExample(TruckteamExample example);

    int deleteByPrimaryKey(Integer teamid);

    int insert(Truckteam record);

    int insertSelective(Truckteam record);

    List<Truckteam> selectByExample(TruckteamExample example);

    Truckteam selectByPrimaryKey(Integer teamid);

    int updateByExampleSelective(@Param("record") Truckteam record, @Param("example") TruckteamExample example);

    int updateByExample(@Param("record") Truckteam record, @Param("example") TruckteamExample example);

    int updateByPrimaryKeySelective(Truckteam record);

    int updateByPrimaryKey(Truckteam record);

    int deleteByIds(@Param("ids") String[] ids);

    List<?> getALlTruckTeamByPage(@Param("page") Integer page, @Param("size") Integer size);

    Long getTotal();
}