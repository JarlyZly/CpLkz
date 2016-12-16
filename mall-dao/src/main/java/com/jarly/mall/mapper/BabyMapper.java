package com.jarly.mall.mapper;

import com.jarly.mall.model.Baby;
import com.jarly.mall.model.BabyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BabyMapper {
    long countByExample(BabyExample example);

    int deleteByExample(BabyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Baby record);

    int insertSelective(Baby record);

    List<Baby> selectByExample(BabyExample example);

    Baby selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Baby record, @Param("example") BabyExample example);

    int updateByExample(@Param("record") Baby record, @Param("example") BabyExample example);

    int updateByPrimaryKeySelective(Baby record);

    int updateByPrimaryKey(Baby record);
}