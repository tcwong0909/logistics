package com.tcwong.dao;

import com.tcwong.bean.User;
import com.tcwong.bean.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int deleteByIds(@Param("ids") String[] ids);

    Long getTotal(@Param("username") String username, @Param("account") String account, @Param("sex") Integer sex, @Param("fkRoleid") Integer fkRoleid);

    List<?> getAllByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("username") String username, @Param("account") String account, @Param("sex") Integer sex, @Param("fkRoleid") Integer fkRoleid);;
}