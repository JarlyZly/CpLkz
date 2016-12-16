package com.jarly.mall.mapper;

import com.jarly.mall.model.BankBranchInfo;
import com.jarly.mall.model.BankBranchInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankBranchInfoMapper {
    long countByExample(BankBranchInfoExample example);

    int deleteByExample(BankBranchInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BankBranchInfo record);

    int insertSelective(BankBranchInfo record);

    List<BankBranchInfo> selectByExample(BankBranchInfoExample example);

    BankBranchInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BankBranchInfo record, @Param("example") BankBranchInfoExample example);

    int updateByExample(@Param("record") BankBranchInfo record, @Param("example") BankBranchInfoExample example);

    int updateByPrimaryKeySelective(BankBranchInfo record);

    int updateByPrimaryKey(BankBranchInfo record);
}