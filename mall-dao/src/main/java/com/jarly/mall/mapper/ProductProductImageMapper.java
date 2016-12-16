package com.jarly.mall.mapper;

import com.jarly.mall.model.ProductProductImage;
import com.jarly.mall.model.ProductProductImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductProductImageMapper {
    long countByExample(ProductProductImageExample example);

    int deleteByExample(ProductProductImageExample example);

    int insert(ProductProductImage record);

    int insertSelective(ProductProductImage record);

    List<ProductProductImage> selectByExample(ProductProductImageExample example);

    int updateByExampleSelective(@Param("record") ProductProductImage record, @Param("example") ProductProductImageExample example);

    int updateByExample(@Param("record") ProductProductImage record, @Param("example") ProductProductImageExample example);
}