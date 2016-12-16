package com.jarly.mall.mapper;

import com.jarly.mall.model.AdminOperateUser;
import com.jarly.mall.model.AdminOperateUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminOperateUserMapper {
    long countByExample(AdminOperateUserExample example);

    int deleteByExample(AdminOperateUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminOperateUser record);

    int insertSelective(AdminOperateUser record);

    List<AdminOperateUser> selectByExample(AdminOperateUserExample example);

    AdminOperateUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminOperateUser record, @Param("example") AdminOperateUserExample example);

    int updateByExample(@Param("record") AdminOperateUser record, @Param("example") AdminOperateUserExample example);

    int updateByPrimaryKeySelective(AdminOperateUser record);

    int updateByPrimaryKey(AdminOperateUser record);
}