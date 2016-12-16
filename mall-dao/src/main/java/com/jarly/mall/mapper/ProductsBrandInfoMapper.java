package com.jarly.mall.mapper;

import com.jarly.mall.model.ProductsBrandInfo;
import com.jarly.mall.model.ProductsBrandInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductsBrandInfoMapper {
    long countByExample(ProductsBrandInfoExample example);

    int deleteByExample(ProductsBrandInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductsBrandInfo record);

    int insertSelective(ProductsBrandInfo record);

    List<ProductsBrandInfo> selectByExample(ProductsBrandInfoExample example);

    ProductsBrandInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductsBrandInfo record, @Param("example") ProductsBrandInfoExample example);

    int updateByExample(@Param("record") ProductsBrandInfo record, @Param("example") ProductsBrandInfoExample example);

    int updateByPrimaryKeySelective(ProductsBrandInfo record);

    int updateByPrimaryKey(ProductsBrandInfo record);
}