package com.jarly.mall.mapper;

import com.jarly.mall.model.Area;
import com.jarly.mall.model.AreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaMapper {
    long countByExample(AreaExample example);

    int deleteByExample(AreaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Area record);

    int insertSelective(Area record);

    List<Area> selectByExampleWithBLOBs(AreaExample example);

    List<Area> selectByExample(AreaExample example);

    Area selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByExampleWithBLOBs(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKeyWithBLOBs(Area record);

    int updateByPrimaryKey(Area record);
}