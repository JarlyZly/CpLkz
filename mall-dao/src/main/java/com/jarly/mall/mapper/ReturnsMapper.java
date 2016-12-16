package com.jarly.mall.mapper;

import com.jarly.mall.model.Returns;
import com.jarly.mall.model.ReturnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReturnsMapper {
    long countByExample(ReturnsExample example);

    int deleteByExample(ReturnsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Returns record);

    int insertSelective(Returns record);

    List<Returns> selectByExample(ReturnsExample example);

    Returns selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Returns record, @Param("example") ReturnsExample example);

    int updateByExample(@Param("record") Returns record, @Param("example") ReturnsExample example);

    int updateByPrimaryKeySelective(Returns record);

    int updateByPrimaryKey(Returns record);
}