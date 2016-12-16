package com.jarly.mall.mapper;

import com.jarly.mall.model.QuickRegister;
import com.jarly.mall.model.QuickRegisterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuickRegisterMapper {
    long countByExample(QuickRegisterExample example);

    int deleteByExample(QuickRegisterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(QuickRegister record);

    int insertSelective(QuickRegister record);

    List<QuickRegister> selectByExample(QuickRegisterExample example);

    QuickRegister selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") QuickRegister record, @Param("example") QuickRegisterExample example);

    int updateByExample(@Param("record") QuickRegister record, @Param("example") QuickRegisterExample example);

    int updateByPrimaryKeySelective(QuickRegister record);

    int updateByPrimaryKey(QuickRegister record);
}