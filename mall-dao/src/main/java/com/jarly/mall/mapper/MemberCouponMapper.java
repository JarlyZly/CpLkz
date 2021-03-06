package com.jarly.mall.mapper;

import com.jarly.mall.model.MemberCoupon;
import com.jarly.mall.model.MemberCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberCouponMapper {
    long countByExample(MemberCouponExample example);

    int deleteByExample(MemberCouponExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberCoupon record);

    int insertSelective(MemberCoupon record);

    List<MemberCoupon> selectByExample(MemberCouponExample example);

    MemberCoupon selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberCoupon record, @Param("example") MemberCouponExample example);

    int updateByExample(@Param("record") MemberCoupon record, @Param("example") MemberCouponExample example);

    int updateByPrimaryKeySelective(MemberCoupon record);

    int updateByPrimaryKey(MemberCoupon record);
}