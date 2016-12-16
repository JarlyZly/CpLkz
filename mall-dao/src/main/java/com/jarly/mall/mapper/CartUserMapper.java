package com.jarly.mall.mapper;

import com.jarly.mall.model.CartUser;
import com.jarly.mall.model.CartUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartUserMapper {
    long countByExample(CartUserExample example);

    int deleteByExample(CartUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CartUser record);

    int insertSelective(CartUser record);

    List<CartUser> selectByExample(CartUserExample example);

    CartUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CartUser record, @Param("example") CartUserExample example);

    int updateByExample(@Param("record") CartUser record, @Param("example") CartUserExample example);

    int updateByPrimaryKeySelective(CartUser record);

    int updateByPrimaryKey(CartUser record);
}