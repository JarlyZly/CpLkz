package com.jarly.mall.mapper;

import com.jarly.mall.model.AttributeOption;
import com.jarly.mall.model.AttributeOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttributeOptionMapper {
    long countByExample(AttributeOptionExample example);

    int deleteByExample(AttributeOptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AttributeOption record);

    int insertSelective(AttributeOption record);

    List<AttributeOption> selectByExample(AttributeOptionExample example);

    AttributeOption selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AttributeOption record, @Param("example") AttributeOptionExample example);

    int updateByExample(@Param("record") AttributeOption record, @Param("example") AttributeOptionExample example);

    int updateByPrimaryKeySelective(AttributeOption record);

    int updateByPrimaryKey(AttributeOption record);
}