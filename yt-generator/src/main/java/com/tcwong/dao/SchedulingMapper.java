package com.tcwong.dao;

import com.tcwong.bean.Scheduling;
import com.tcwong.bean.SchedulingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SchedulingMapper {
    int countByExample(SchedulingExample example);

    int deleteByExample(SchedulingExample example);

    int deleteByPrimaryKey(Integer schedulingid);

    int insert(Scheduling record);

    int insertSelective(Scheduling record);

    List<Scheduling> selectByExample(SchedulingExample example);

    Scheduling selectByPrimaryKey(Integer schedulingid);

    int updateByExampleSelective(@Param("record") Scheduling record, @Param("example") SchedulingExample example);

    int updateByExample(@Param("record") Scheduling record, @Param("example") SchedulingExample example);

    int updateByPrimaryKeySelective(Scheduling record);

    int updateByPrimaryKey(Scheduling record);

    Long getTotal(@Param("schedulingid") Integer schedulingid, @Param("fkCarriersid") Integer fkCarriersid, @Param("sendcompany") String sendcompany, @Param("receivecompany") String receivecompany);

    List<?> getAllByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("schedulingid") Integer schedulingid, @Param("fkCarriersid") Integer fkCarriersid, @Param("sendcompany") String sendcompany, @Param("receivecompany") String receivecompany);

    int deleteByIds(@Param("ids") String toString);
}