package com.tcwong.dao;

import com.tcwong.bean.Driver;
import com.tcwong.bean.DriverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DriverMapper {
    int countByExample(DriverExample example);

    int deleteByExample(DriverExample example);

    int deleteByPrimaryKey(Integer driverid);

    int insert(Driver record);

    int insertSelective(Driver record);

    List<Driver> selectByExample(DriverExample example);

    Driver selectByPrimaryKey(Integer driverid);

    int updateByExampleSelective(@Param("record") Driver record, @Param("example") DriverExample example);

    int updateByExample(@Param("record") Driver record, @Param("example") DriverExample example);

    int updateByPrimaryKeySelective(Driver record);

    int updateByPrimaryKey(Driver record);
}