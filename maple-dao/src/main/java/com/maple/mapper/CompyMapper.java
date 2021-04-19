package com.maple.mapper;

import com.maple.pojo.Compy;
import com.maple.pojo.CompyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompyMapper {
    int countByExample(CompyExample example);

    int deleteByExample(CompyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Compy record);

    int insertSelective(Compy record);

    List<Compy> selectByExample(CompyExample example);

    Compy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Compy record, @Param("example") CompyExample example);

    int updateByExample(@Param("record") Compy record, @Param("example") CompyExample example);

    int updateByPrimaryKeySelective(Compy record);

    int updateByPrimaryKey(Compy record);
}