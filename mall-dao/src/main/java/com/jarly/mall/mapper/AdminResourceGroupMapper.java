package com.jarly.mall.mapper;

import com.jarly.mall.model.AdminResourceGroup;
import com.jarly.mall.model.AdminResourceGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminResourceGroupMapper {
    long countByExample(AdminResourceGroupExample example);

    int deleteByExample(AdminResourceGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminResourceGroup record);

    int insertSelective(AdminResourceGroup record);

    List<AdminResourceGroup> selectByExample(AdminResourceGroupExample example);

    AdminResourceGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminResourceGroup record, @Param("example") AdminResourceGroupExample example);

    int updateByExample(@Param("record") AdminResourceGroup record, @Param("example") AdminResourceGroupExample example);

    int updateByPrimaryKeySelective(AdminResourceGroup record);

    int updateByPrimaryKey(AdminResourceGroup record);
}