package com.jarly.mall.mapper;

import com.jarly.mall.model.CartDevice;
import com.jarly.mall.model.CartDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartDeviceMapper {
    long countByExample(CartDeviceExample example);

    int deleteByExample(CartDeviceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CartDevice record);

    int insertSelective(CartDevice record);

    List<CartDevice> selectByExample(CartDeviceExample example);

    CartDevice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CartDevice record, @Param("example") CartDeviceExample example);

    int updateByExample(@Param("record") CartDevice record, @Param("example") CartDeviceExample example);

    int updateByPrimaryKeySelective(CartDevice record);

    int updateByPrimaryKey(CartDevice record);
}