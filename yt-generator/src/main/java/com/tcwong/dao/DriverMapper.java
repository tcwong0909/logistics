package com.tcwong.dao;

import com.tcwong.bean.Driver;
import com.tcwong.bean.DriverExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    int deleteByIds(@Param("ids") String[] ids);

    List<Driver> getAllDriverByPage(@Param("page") Integer page,@Param("size") Integer size,@Param("name") String name,@Param("fkTeamid") Integer fkTeamid,@Param("state") Integer state);

    Long getTotal(@Param("name") String name,@Param("fkTeamid") Integer fkTeamid,@Param("state") Integer state);
}