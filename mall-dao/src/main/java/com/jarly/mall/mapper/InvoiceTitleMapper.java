package com.jarly.mall.mapper;

import com.jarly.mall.model.InvoiceTitle;
import com.jarly.mall.model.InvoiceTitleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoiceTitleMapper {
    long countByExample(InvoiceTitleExample example);

    int deleteByExample(InvoiceTitleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InvoiceTitle record);

    int insertSelective(InvoiceTitle record);

    List<InvoiceTitle> selectByExample(InvoiceTitleExample example);

    InvoiceTitle selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InvoiceTitle record, @Param("example") InvoiceTitleExample example);

    int updateByExample(@Param("record") InvoiceTitle record, @Param("example") InvoiceTitleExample example);

    int updateByPrimaryKeySelective(InvoiceTitle record);

    int updateByPrimaryKey(InvoiceTitle record);
}