package com.tcwong.dao;

import com.tcwong.bean.Carriers;
import com.tcwong.bean.CarriersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarriersMapper {
    int countByExample(CarriersExample example);

    int deleteByExample(CarriersExample example);

    int deleteByPrimaryKey(Integer carriersid);

    int insert(Carriers record);

    int insertSelective(Carriers record);

    List<Carriers> selectByExample(CarriersExample example);

    Carriers selectByPrimaryKey(Integer carriersid);

    int updateByExampleSelective(@Param("record") Carriers record, @Param("example") CarriersExample example);

    int updateByExample(@Param("record") Carriers record, @Param("example") CarriersExample example);

    int updateByPrimaryKeySelective(Carriers record);

    int updateByPrimaryKey(Carriers record);

    Long getTotal(@Param("sendcompany") String sendcompany, @Param("receivecompany") String receivecompany, @Param("finishedstate") Integer finishedstate);

    List<?> getAllByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("sendcompany") String sendcompany, @Param("receivecompany") String receivecompany, @Param("finishedstate") Integer finishedstate);

    int deleteByIds(@Param("carrierIds") String[] carrierIds);

    int updateByIds(@Param("ids") String[] toString);
}