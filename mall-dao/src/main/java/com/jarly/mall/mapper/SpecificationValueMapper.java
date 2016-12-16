package com.jarly.mall.mapper;

import com.jarly.mall.model.SpecificationValue;
import com.jarly.mall.model.SpecificationValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecificationValueMapper {
    long countByExample(SpecificationValueExample example);

    int deleteByExample(SpecificationValueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpecificationValue record);

    int insertSelective(SpecificationValue record);

    List<SpecificationValue> selectByExample(SpecificationValueExample example);

    SpecificationValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpecificationValue record, @Param("example") SpecificationValueExample example);

    int updateByExample(@Param("record") SpecificationValue record, @Param("example") SpecificationValueExample example);

    int updateByPrimaryKeySelective(SpecificationValue record);

    int updateByPrimaryKey(SpecificationValue record);
}