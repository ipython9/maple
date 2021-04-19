package com.maple.mapper;

import com.maple.pojo.Resumesplit;
import com.maple.pojo.ResumesplitExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResumesplitMapper {
    int countByExample(ResumesplitExample example);

    int deleteByExample(ResumesplitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Resumesplit record);

    int insertSelective(Resumesplit record);

    List<Resumesplit> selectByExample(ResumesplitExample example);

    Resumesplit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Resumesplit record, @Param("example") ResumesplitExample example);

    int updateByExample(@Param("record") Resumesplit record, @Param("example") ResumesplitExample example);

    int updateByPrimaryKeySelective(Resumesplit record);

    int updateByPrimaryKey(Resumesplit record);
}