package com.jarly.mall.mapper;

import com.jarly.mall.model.Refund;
import com.jarly.mall.model.RefundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundMapper {
    long countByExample(RefundExample example);

    int deleteByExample(RefundExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Refund record);

    int insertSelective(Refund record);

    List<Refund> selectByExample(RefundExample example);

    Refund selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Refund record, @Param("example") RefundExample example);

    int updateByExample(@Param("record") Refund record, @Param("example") RefundExample example);

    int updateByPrimaryKeySelective(Refund record);

    int updateByPrimaryKey(Refund record);
}