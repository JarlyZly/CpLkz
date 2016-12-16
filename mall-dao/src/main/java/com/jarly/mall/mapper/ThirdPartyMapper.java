package com.jarly.mall.mapper;

import com.jarly.mall.model.ThirdParty;
import com.jarly.mall.model.ThirdPartyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThirdPartyMapper {
    long countByExample(ThirdPartyExample example);

    int deleteByExample(ThirdPartyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ThirdParty record);

    int insertSelective(ThirdParty record);

    List<ThirdParty> selectByExample(ThirdPartyExample example);

    ThirdParty selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ThirdParty record, @Param("example") ThirdPartyExample example);

    int updateByExample(@Param("record") ThirdParty record, @Param("example") ThirdPartyExample example);

    int updateByPrimaryKeySelective(ThirdParty record);

    int updateByPrimaryKey(ThirdParty record);
}