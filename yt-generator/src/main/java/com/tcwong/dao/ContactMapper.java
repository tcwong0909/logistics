package com.tcwong.dao;

import com.tcwong.bean.Contact;
import com.tcwong.bean.ContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}