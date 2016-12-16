package com.jarly.mall.mapper;

import com.jarly.mall.model.ShippingItem;
import com.jarly.mall.model.ShippingItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingItemMapper {
    long countByExample(ShippingItemExample example);

    int deleteByExample(ShippingItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShippingItem record);

    int insertSelective(ShippingItem record);

    List<ShippingItem> selectByExample(ShippingItemExample example);

    ShippingItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ShippingItem record, @Param("example") ShippingItemExample example);

    int updateByExample(@Param("record") ShippingItem record, @Param("example") ShippingItemExample example);

    int updateByPrimaryKeySelective(ShippingItem record);

    int updateByPrimaryKey(ShippingItem record);
}