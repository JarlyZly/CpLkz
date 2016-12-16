package com.jarly.mall.mapper;

import com.jarly.mall.model.ProductCommentExtend;
import com.jarly.mall.model.ProductCommentExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCommentExtendMapper {
    long countByExample(ProductCommentExtendExample example);

    int deleteByExample(ProductCommentExtendExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductCommentExtend record);

    int insertSelective(ProductCommentExtend record);

    List<ProductCommentExtend> selectByExampleWithBLOBs(ProductCommentExtendExample example);

    List<ProductCommentExtend> selectByExample(ProductCommentExtendExample example);

    ProductCommentExtend selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductCommentExtend record, @Param("example") ProductCommentExtendExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductCommentExtend record, @Param("example") ProductCommentExtendExample example);

    int updateByExample(@Param("record") ProductCommentExtend record, @Param("example") ProductCommentExtendExample example);

    int updateByPrimaryKeySelective(ProductCommentExtend record);

    int updateByPrimaryKeyWithBLOBs(ProductCommentExtend record);

    int updateByPrimaryKey(ProductCommentExtend record);
}