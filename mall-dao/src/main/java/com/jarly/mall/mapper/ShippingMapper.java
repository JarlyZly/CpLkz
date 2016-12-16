package com.jarly.mall.mapper;

import com.jarly.mall.model.Shipping;
import com.jarly.mall.model.ShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingMapper {
    long countByExample(ShippingExample example);

    int deleteByExample(ShippingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Shipping record);

    int insertSelective(Shipping record);

    List<Shipping> selectByExample(ShippingExample example);

    Shipping selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Shipping record, @Param("example") ShippingExample example);

    int updateByExample(@Param("record") Shipping record, @Param("example") ShippingExample example);

    int updateByPrimaryKeySelective(Shipping record);

    int updateByPrimaryKey(Shipping record);
}