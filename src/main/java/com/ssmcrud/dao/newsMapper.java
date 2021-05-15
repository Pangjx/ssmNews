package com.ssmcrud.dao;

import com.ssmcrud.bean.news;
import com.ssmcrud.bean.newsExample;
import java.util.List;

import com.ssmcrud.bean.user;
import org.apache.ibatis.annotations.Param;

public interface newsMapper {
    long countByExample(newsExample example);

    int deleteByExample(newsExample example);

    int deleteByPrimaryKey(Integer newsid);

    int insert(news record);

    int insertSelective(news record);

    List<news>  getAllNews();

    List<news> selectByExampleWithBLOBs(newsExample example);

    List<news> selectByExample(newsExample example);

    news selectByPrimaryKey(Integer newsid);

    int updateByExampleSelective(@Param("record") news record, @Param("example") newsExample example);

    int updateByExampleWithBLOBs(@Param("record") news record, @Param("example") newsExample example);

    int updateByExample(@Param("record") news record, @Param("example") newsExample example);

    int updateByPrimaryKeySelective(news record);

    int updateByPrimaryKeyWithBLOBs(news record);

    int updateByPrimaryKey(news record);
}