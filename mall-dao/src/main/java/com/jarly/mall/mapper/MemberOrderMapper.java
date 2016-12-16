package com.jarly.mall.mapper;

import com.jarly.mall.model.MemberOrder;
import com.jarly.mall.model.MemberOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberOrderMapper {
    long countByExample(MemberOrderExample example);

    int deleteByExample(MemberOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberOrder record);

    int insertSelective(MemberOrder record);

    List<MemberOrder> selectByExample(MemberOrderExample example);

    MemberOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberOrder record, @Param("example") MemberOrderExample example);

    int updateByExample(@Param("record") MemberOrder record, @Param("example") MemberOrderExample example);

    int updateByPrimaryKeySelective(MemberOrder record);

    int updateByPrimaryKey(MemberOrder record);
}