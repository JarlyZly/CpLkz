package com.jarly.mall.mapper;

import com.jarly.mall.model.Negotiate;
import com.jarly.mall.model.NegotiateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NegotiateMapper {
    long countByExample(NegotiateExample example);

    int deleteByExample(NegotiateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Negotiate record);

    int insertSelective(Negotiate record);

    List<Negotiate> selectByExample(NegotiateExample example);

    Negotiate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Negotiate record, @Param("example") NegotiateExample example);

    int updateByExample(@Param("record") Negotiate record, @Param("example") NegotiateExample example);

    int updateByPrimaryKeySelective(Negotiate record);

    int updateByPrimaryKey(Negotiate record);
}