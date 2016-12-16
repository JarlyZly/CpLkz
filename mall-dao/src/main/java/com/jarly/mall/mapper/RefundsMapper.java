package com.jarly.mall.mapper;

import com.jarly.mall.model.Refunds;
import com.jarly.mall.model.RefundsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundsMapper {
    long countByExample(RefundsExample example);

    int deleteByExample(RefundsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Refunds record);

    int insertSelective(Refunds record);

    List<Refunds> selectByExample(RefundsExample example);

    Refunds selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Refunds record, @Param("example") RefundsExample example);

    int updateByExample(@Param("record") Refunds record, @Param("example") RefundsExample example);

    int updateByPrimaryKeySelective(Refunds record);

    int updateByPrimaryKey(Refunds record);
}