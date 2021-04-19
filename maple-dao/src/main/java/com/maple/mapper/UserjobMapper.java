package com.maple.mapper;

import com.maple.pojo.Userjob;
import com.maple.pojo.UserjobExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserjobMapper {
    int countByExample(UserjobExample example);

    int deleteByExample(UserjobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userjob record);

    int insertSelective(Userjob record);

    List<Userjob> selectByExample(UserjobExample example);

    Userjob selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userjob record, @Param("example") UserjobExample example);

    int updateByExample(@Param("record") Userjob record, @Param("example") UserjobExample example);

    int updateByPrimaryKeySelective(Userjob record);

    int updateByPrimaryKey(Userjob record);
}