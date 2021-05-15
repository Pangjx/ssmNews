package com.ssmcrud.dao;

import com.ssmcrud.bean.user;
import com.ssmcrud.bean.userExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userMapper {
    long countByExample(userExample example);

    int deleteByExample(userExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(user record);

    int insertSelective(user record);

    List<user> selectByExample(userExample example);

    List<user>  selectAllUser();

    user selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") user record, @Param("example") userExample example);

    int updateByExample(@Param("record") user record, @Param("example") userExample example);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);


}