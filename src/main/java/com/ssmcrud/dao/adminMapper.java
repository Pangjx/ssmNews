package com.ssmcrud.dao;

import com.ssmcrud.bean.admin;
import com.ssmcrud.bean.adminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface adminMapper {
    long countByExample(adminExample example);

    int deleteByExample(adminExample example);

    int deleteByPrimaryKey(Integer adminid);

    int insert(admin record);

    int insertSelective(admin record);

    List<admin> selectByExample(adminExample example);

    admin selectByPrimaryKey(Integer adminid);

    int updateByExampleSelective(@Param("record") admin record, @Param("example") adminExample example);

    int updateByExample(@Param("record") admin record, @Param("example") adminExample example);

    int updateByPrimaryKeySelective(admin record);

    int updateByPrimaryKey(admin record);
}