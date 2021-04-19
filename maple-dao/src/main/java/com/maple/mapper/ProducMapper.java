package com.maple.mapper;

import com.maple.pojo.Produc;
import com.maple.pojo.ProducExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProducMapper {
    int countByExample(ProducExample example);

    int deleteByExample(ProducExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Produc record);

    int insertSelective(Produc record);

    List<Produc> selectByExample(ProducExample example);

    Produc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Produc record, @Param("example") ProducExample example);

    int updateByExample(@Param("record") Produc record, @Param("example") ProducExample example);

    int updateByPrimaryKeySelective(Produc record);

    int updateByPrimaryKey(Produc record);
}