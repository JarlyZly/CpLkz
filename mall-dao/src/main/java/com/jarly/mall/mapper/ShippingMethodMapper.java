package com.jarly.mall.mapper;

import com.jarly.mall.model.ShippingMethod;
import com.jarly.mall.model.ShippingMethodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingMethodMapper {
    long countByExample(ShippingMethodExample example);

    int deleteByExample(ShippingMethodExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShippingMethod record);

    int insertSelective(ShippingMethod record);

    List<ShippingMethod> selectByExampleWithBLOBs(ShippingMethodExample example);

    List<ShippingMethod> selectByExample(ShippingMethodExample example);

    ShippingMethod selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ShippingMethod record, @Param("example") ShippingMethodExample example);

    int updateByExampleWithBLOBs(@Param("record") ShippingMethod record, @Param("example") ShippingMethodExample example);

    int updateByExample(@Param("record") ShippingMethod record, @Param("example") ShippingMethodExample example);

    int updateByPrimaryKeySelective(ShippingMethod record);

    int updateByPrimaryKeyWithBLOBs(ShippingMethod record);

    int updateByPrimaryKey(ShippingMethod record);
}