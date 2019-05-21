package com.tcwong.dao;

import com.tcwong.bean.Syslog;
import com.tcwong.bean.SyslogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyslogMapper {
    int countByExample(SyslogExample example);

    int deleteByExample(SyslogExample example);

    int deleteByPrimaryKey(Integer logid);

    int insert(Syslog record);

    int insertSelective(Syslog record);

    List<Syslog> selectByExampleWithBLOBs(SyslogExample example);

    List<Syslog> selectByExample(SyslogExample example);

    Syslog selectByPrimaryKey(Integer logid);

    int updateByExampleSelective(@Param("record") Syslog record, @Param("example") SyslogExample example);

    int updateByExampleWithBLOBs(@Param("record") Syslog record, @Param("example") SyslogExample example);

    int updateByExample(@Param("record") Syslog record, @Param("example") SyslogExample example);

    int updateByPrimaryKeySelective(Syslog record);

    int updateByPrimaryKeyWithBLOBs(Syslog record);

    int updateByPrimaryKey(Syslog record);
}