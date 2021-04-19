package com.maple.mapper;

import com.maple.pojo.Edu;
import com.maple.pojo.EduExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EduMapper {
    int countByExample(EduExample example);

    int deleteByExample(EduExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Edu record);

    int insertSelective(Edu record);

    List<Edu> selectByExample(EduExample example);

    Edu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Edu record, @Param("example") EduExample example);

    int updateByExample(@Param("record") Edu record, @Param("example") EduExample example);

    int updateByPrimaryKeySelective(Edu record);

    int updateByPrimaryKey(Edu record);
}