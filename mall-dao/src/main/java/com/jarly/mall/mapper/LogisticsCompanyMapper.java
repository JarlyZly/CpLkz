package com.jarly.mall.mapper;

import com.jarly.mall.model.LogisticsCompany;
import com.jarly.mall.model.LogisticsCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogisticsCompanyMapper {
    long countByExample(LogisticsCompanyExample example);

    int deleteByExample(LogisticsCompanyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LogisticsCompany record);

    int insertSelective(LogisticsCompany record);

    List<LogisticsCompany> selectByExample(LogisticsCompanyExample example);

    LogisticsCompany selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LogisticsCompany record, @Param("example") LogisticsCompanyExample example);

    int updateByExample(@Param("record") LogisticsCompany record, @Param("example") LogisticsCompanyExample example);

    int updateByPrimaryKeySelective(LogisticsCompany record);

    int updateByPrimaryKey(LogisticsCompany record);
}