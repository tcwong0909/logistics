package com.tcwong.dao;

import com.tcwong.bean.Contact;
import com.tcwong.bean.ContactExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContactMapper {
    int countByExample(ContactExample example);

    int deleteByExample(ContactExample example);

    int deleteByPrimaryKey(Integer contactid);

    int insert(Contact record);

    int insertSelective(Contact record);

    List<Contact> selectByExample(ContactExample example);

    Contact selectByPrimaryKey(Integer contactid);

    int updateByExampleSelective(@Param("record") Contact record, @Param("example") ContactExample example);

    int updateByExample(@Param("record") Contact record, @Param("example") ContactExample example);

    int updateByPrimaryKeySelective(Contact record);

    int updateByPrimaryKey(Contact record);

    int deleteByIds(@Param("ids") String[] split);

    Long getTotal(@Param("fkTruckid")Integer fkTruckid,@Param("fkDriverid")Integer fkDriverid,
                  @Param("drivername") String drivername,@Param("teamname")String teamname,@Param("bindId")Integer bindId);
    List<Contact> getAll(@Param("page") Integer page,@Param("size")Integer size,@Param("fkTruckid")Integer fkTruckid,@Param("fkDriverid")Integer fkDriverid,
                         @Param("drivername") String drivername,@Param("teamname")String teamname,@Param("bindId")Integer bindId);

    int unbindTrucks(@Param("ids") String[] split);
}