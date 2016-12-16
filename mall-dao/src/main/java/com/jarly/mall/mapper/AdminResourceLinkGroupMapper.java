package com.jarly.mall.mapper;

import com.jarly.mall.model.AdminResourceLinkGroup;
import com.jarly.mall.model.AdminResourceLinkGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminResourceLinkGroupMapper {
    long countByExample(AdminResourceLinkGroupExample example);

    int deleteByExample(AdminResourceLinkGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminResourceLinkGroup record);

    int insertSelective(AdminResourceLinkGroup record);

    List<AdminResourceLinkGroup> selectByExample(AdminResourceLinkGroupExample example);

    AdminResourceLinkGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminResourceLinkGroup record, @Param("example") AdminResourceLinkGroupExample example);

    int updateByExample(@Param("record") AdminResourceLinkGroup record, @Param("example") AdminResourceLinkGroupExample example);

    int updateByPrimaryKeySelective(AdminResourceLinkGroup record);

    int updateByPrimaryKey(AdminResourceLinkGroup record);
}