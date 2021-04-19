package com.maple.mapper;

import com.maple.pojo.Workdata;
import com.maple.pojo.WorkdataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkdataMapper {
    int countByExample(WorkdataExample example);

    int deleteByExample(WorkdataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Workdata record);

    int insertSelective(Workdata record);

    List<Workdata> selectByExample(WorkdataExample example);

    Workdata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Workdata record, @Param("example") WorkdataExample example);

    int updateByExample(@Param("record") Workdata record, @Param("example") WorkdataExample example);

    int updateByPrimaryKeySelective(Workdata record);

    int updateByPrimaryKey(Workdata record);
}