package com.maple.mapper;

import com.maple.pojo.Postion;
import com.maple.pojo.PostionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostionMapper {
    int countByExample(PostionExample example);

    int deleteByExample(PostionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Postion record);

    int insertSelective(Postion record);

    List<Postion> selectByExample(PostionExample example);

    Postion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Postion record, @Param("example") PostionExample example);

    int updateByExample(@Param("record") Postion record, @Param("example") PostionExample example);

    int updateByPrimaryKeySelective(Postion record);

    int updateByPrimaryKey(Postion record);
}