package com.jarly.mall.mapper;

import com.jarly.mall.model.UserFeedback;
import com.jarly.mall.model.UserFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFeedbackMapper {
    long countByExample(UserFeedbackExample example);

    int deleteByExample(UserFeedbackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserFeedback record);

    int insertSelective(UserFeedback record);

    List<UserFeedback> selectByExample(UserFeedbackExample example);

    UserFeedback selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserFeedback record, @Param("example") UserFeedbackExample example);

    int updateByExample(@Param("record") UserFeedback record, @Param("example") UserFeedbackExample example);

    int updateByPrimaryKeySelective(UserFeedback record);

    int updateByPrimaryKey(UserFeedback record);
}