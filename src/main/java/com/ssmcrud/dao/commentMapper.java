package com.ssmcrud.dao;

import com.ssmcrud.bean.comment;
import com.ssmcrud.bean.commentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface commentMapper {
    long countByExample(commentExample example);

    int deleteByExample(commentExample example);

    int deleteByPrimaryKey(Integer commentid);

    int insert(comment record);

    int insertSelective(comment record);

    List<comment> selectByExampleWithBLOBs(commentExample example);

    List<comment> selectByExample(commentExample example);

    comment selectByPrimaryKey(Integer commentid);

    int updateByExampleSelective(@Param("record") comment record, @Param("example") commentExample example);

    int updateByExampleWithBLOBs(@Param("record") comment record, @Param("example") commentExample example);

    int updateByExample(@Param("record") comment record, @Param("example") commentExample example);

    int updateByPrimaryKeySelective(comment record);

    int updateByPrimaryKeyWithBLOBs(comment record);

    int updateByPrimaryKey(comment record);
}