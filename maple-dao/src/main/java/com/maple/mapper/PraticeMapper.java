package com.maple.mapper;

import com.maple.pojo.Pratice;
import com.maple.pojo.PraticeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PraticeMapper {
    int countByExample(PraticeExample example);

    int deleteByExample(PraticeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Pratice record);

    int insertSelective(Pratice record);

    List<Pratice> selectByExample(PraticeExample example);

    Pratice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Pratice record, @Param("example") PraticeExample example);

    int updateByExample(@Param("record") Pratice record, @Param("example") PraticeExample example);

    int updateByPrimaryKeySelective(Pratice record);

    int updateByPrimaryKey(Pratice record);
}