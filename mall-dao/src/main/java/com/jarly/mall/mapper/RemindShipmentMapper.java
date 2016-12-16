package com.jarly.mall.mapper;

import com.jarly.mall.model.RemindShipment;
import com.jarly.mall.model.RemindShipmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RemindShipmentMapper {
    long countByExample(RemindShipmentExample example);

    int deleteByExample(RemindShipmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RemindShipment record);

    int insertSelective(RemindShipment record);

    List<RemindShipment> selectByExample(RemindShipmentExample example);

    RemindShipment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RemindShipment record, @Param("example") RemindShipmentExample example);

    int updateByExample(@Param("record") RemindShipment record, @Param("example") RemindShipmentExample example);

    int updateByPrimaryKeySelective(RemindShipment record);

    int updateByPrimaryKey(RemindShipment record);
}