package com.jarly.mall.mapper;

import com.jarly.mall.model.Questionnaire;
import com.jarly.mall.model.QuestionnaireExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionnaireMapper {
    long countByExample(QuestionnaireExample example);

    int deleteByExample(QuestionnaireExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Questionnaire record);

    int insertSelective(Questionnaire record);

    List<Questionnaire> selectByExample(QuestionnaireExample example);

    Questionnaire selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Questionnaire record, @Param("example") QuestionnaireExample example);

    int updateByExample(@Param("record") Questionnaire record, @Param("example") QuestionnaireExample example);

    int updateByPrimaryKeySelective(Questionnaire record);

    int updateByPrimaryKey(Questionnaire record);
}