package com.jarly.mall.mapper;

import com.jarly.mall.model.ProductKeywords;
import com.jarly.mall.model.ProductKeywordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductKeywordsMapper {
    long countByExample(ProductKeywordsExample example);

    int deleteByExample(ProductKeywordsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductKeywords record);

    int insertSelective(ProductKeywords record);

    List<ProductKeywords> selectByExample(ProductKeywordsExample example);

    ProductKeywords selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductKeywords record, @Param("example") ProductKeywordsExample example);

    int updateByExample(@Param("record") ProductKeywords record, @Param("example") ProductKeywordsExample example);

    int updateByPrimaryKeySelective(ProductKeywords record);

    int updateByPrimaryKey(ProductKeywords record);
}