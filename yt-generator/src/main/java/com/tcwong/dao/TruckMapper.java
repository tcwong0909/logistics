package com.tcwong.dao;

import com.tcwong.bean.Truck;
import com.tcwong.bean.TruckExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TruckMapper {
    int countByExample(TruckExample example);

    int deleteByExample(TruckExample example);

    int deleteByPrimaryKey(Integer truckid);

    int insert(Truck record);

    int insertSelective(Truck record);

    List<Truck> selectByExample(TruckExample example);

    Truck selectByPrimaryKey(Integer truckid);

    int updateByExampleSelective(@Param("record") Truck record, @Param("example") TruckExample example);

    int updateByExample(@Param("record") Truck record, @Param("example") TruckExample example);

    int updateByPrimaryKeySelective(Truck record);

    int updateByPrimaryKey(Truck record);

    List<Truck> getAllTrucksByPage(@Param("page") Integer page, @Param("size") Integer size);

    Long getTotal();

    int deleteByIds(@Param("ids") String[] ids);
}