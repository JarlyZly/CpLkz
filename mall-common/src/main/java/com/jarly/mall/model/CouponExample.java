package com.jarly.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNull() {
            addCriterion("coupon_name is null");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNotNull() {
            addCriterion("coupon_name is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNameEqualTo(String value) {
            addCriterion("coupon_name =", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotEqualTo(String value) {
            addCriterion("coupon_name <>", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThan(String value) {
            addCriterion("coupon_name >", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_name >=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThan(String value) {
            addCriterion("coupon_name <", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanOrEqualTo(String value) {
            addCriterion("coupon_name <=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLike(String value) {
            addCriterion("coupon_name like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotLike(String value) {
            addCriterion("coupon_name not like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIn(List<String> values) {
            addCriterion("coupon_name in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotIn(List<String> values) {
            addCriterion("coupon_name not in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameBetween(String value1, String value2) {
            addCriterion("coupon_name between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotBetween(String value1, String value2) {
            addCriterion("coupon_name not between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNull() {
            addCriterion("activity_type is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNotNull() {
            addCriterion("activity_type is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeEqualTo(Byte value) {
            addCriterion("activity_type =", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotEqualTo(Byte value) {
            addCriterion("activity_type <>", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThan(Byte value) {
            addCriterion("activity_type >", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("activity_type >=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThan(Byte value) {
            addCriterion("activity_type <", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanOrEqualTo(Byte value) {
            addCriterion("activity_type <=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIn(List<Byte> values) {
            addCriterion("activity_type in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotIn(List<Byte> values) {
            addCriterion("activity_type not in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeBetween(Byte value1, Byte value2) {
            addCriterion("activity_type between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("activity_type not between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNull() {
            addCriterion("coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(Byte value) {
            addCriterion("coupon_type =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(Byte value) {
            addCriterion("coupon_type <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(Byte value) {
            addCriterion("coupon_type >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("coupon_type >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(Byte value) {
            addCriterion("coupon_type <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(Byte value) {
            addCriterion("coupon_type <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<Byte> values) {
            addCriterion("coupon_type in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<Byte> values) {
            addCriterion("coupon_type not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(Byte value1, Byte value2) {
            addCriterion("coupon_type between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("coupon_type not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Integer value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Integer value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Integer value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Integer value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Integer> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Integer> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Integer value1, Integer value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andAmountLimitIsNull() {
            addCriterion("amount_limit is null");
            return (Criteria) this;
        }

        public Criteria andAmountLimitIsNotNull() {
            addCriterion("amount_limit is not null");
            return (Criteria) this;
        }

        public Criteria andAmountLimitEqualTo(Integer value) {
            addCriterion("amount_limit =", value, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitNotEqualTo(Integer value) {
            addCriterion("amount_limit <>", value, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitGreaterThan(Integer value) {
            addCriterion("amount_limit >", value, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount_limit >=", value, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitLessThan(Integer value) {
            addCriterion("amount_limit <", value, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitLessThanOrEqualTo(Integer value) {
            addCriterion("amount_limit <=", value, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitIn(List<Integer> values) {
            addCriterion("amount_limit in", values, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitNotIn(List<Integer> values) {
            addCriterion("amount_limit not in", values, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitBetween(Integer value1, Integer value2) {
            addCriterion("amount_limit between", value1, value2, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andAmountLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("amount_limit not between", value1, value2, "amountLimit");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("desc is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("desc is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("desc =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("desc <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("desc >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("desc >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("desc <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("desc <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("desc like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("desc not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("desc in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("desc not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("desc between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("desc not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNull() {
            addCriterion("use_type is null");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNotNull() {
            addCriterion("use_type is not null");
            return (Criteria) this;
        }

        public Criteria andUseTypeEqualTo(Byte value) {
            addCriterion("use_type =", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotEqualTo(Byte value) {
            addCriterion("use_type <>", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThan(Byte value) {
            addCriterion("use_type >", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("use_type >=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThan(Byte value) {
            addCriterion("use_type <", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThanOrEqualTo(Byte value) {
            addCriterion("use_type <=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeIn(List<Byte> values) {
            addCriterion("use_type in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotIn(List<Byte> values) {
            addCriterion("use_type not in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeBetween(Byte value1, Byte value2) {
            addCriterion("use_type between", value1, value2, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("use_type not between", value1, value2, "useType");
            return (Criteria) this;
        }

        public Criteria andItemIdsIsNull() {
            addCriterion("item_ids is null");
            return (Criteria) this;
        }

        public Criteria andItemIdsIsNotNull() {
            addCriterion("item_ids is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdsEqualTo(String value) {
            addCriterion("item_ids =", value, "itemIds");
            return (Criteria) this;
        }

        public Criteria andItemIdsNotEqualTo(String value) {
            addCriterion("item_ids <>", value, "itemIds");
            return (Criteria) this;
        }

        public Criteria andItemIdsGreaterThan(String value) {
            addCriterion("item_ids >", value, "itemIds");
            return (Criteria) this;
        }

        public Criteria andItemIdsGreaterThanOrEqualTo(String value) {
            addCriterion("item_ids >=", value, "itemIds");
            return (Criteria) this;
        }

        public Criteria andItemIdsLessThan(String value) {
            addCriterion("item_ids <", value, "itemIds");
            return (Criteria) this;
        }

        public Criteria andItemIdsLessThanOrEqualTo(String value) {
            addCriterion("item_ids <=", value, "itemIds");
            return (Criteria) this;
        }

        public Criteria andItemIdsLike(String value) {
            addCriterion("item_ids like", value, "itemIds");
            return (Criteria) this;
        }

        public Criteria andItemIdsNotLike(String value) {
            addCriterion("item_ids not like", value, "itemIds");
            return (Criteria) this;
        }

        public Criteria andItemIdsIn(List<String> values) {
            addCriterion("item_ids in", values, "itemIds");
            return (Criteria) this;
        }

        public Criteria andItemIdsNotIn(List<String> values) {
            addCriterion("item_ids not in", values, "itemIds");
            return (Criteria) this;
        }

        public Criteria andItemIdsBetween(String value1, String value2) {
            addCriterion("item_ids between", value1, value2, "itemIds");
            return (Criteria) this;
        }

        public Criteria andItemIdsNotBetween(String value1, String value2) {
            addCriterion("item_ids not between", value1, value2, "itemIds");
            return (Criteria) this;
        }

        public Criteria andCategoryIdsIsNull() {
            addCriterion("category_ids is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdsIsNotNull() {
            addCriterion("category_ids is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdsEqualTo(String value) {
            addCriterion("category_ids =", value, "categoryIds");
            return (Criteria) this;
        }

        public Criteria andCategoryIdsNotEqualTo(String value) {
            addCriterion("category_ids <>", value, "categoryIds");
            return (Criteria) this;
        }

        public Criteria andCategoryIdsGreaterThan(String value) {
            addCriterion("category_ids >", value, "categoryIds");
            return (Criteria) this;
        }

        public Criteria andCategoryIdsGreaterThanOrEqualTo(String value) {
            addCriterion("category_ids >=", value, "categoryIds");
            return (Criteria) this;
        }

        public Criteria andCategoryIdsLessThan(String value) {
            addCriterion("category_ids <", value, "categoryIds");
            return (Criteria) this;
        }

        public Criteria andCategoryIdsLessThanOrEqualTo(String value) {
            addCriterion("category_ids <=", value, "categoryIds");
            return (Criteria) this;
        }

        public Criteria andCategoryIdsLike(String value) {
            addCriterion("category_ids like", value, "categoryIds");
            return (Criteria) this;
        }

        public Criteria andCategoryIdsNotLike(String value) {
            addCriterion("category_ids not like", value, "categoryIds");
            return (Criteria) this;
        }

        public Criteria andCategoryIdsIn(List<String> values) {
            addCriterion("category_ids in", values, "categoryIds");
            return (Criteria) this;
        }

        public Criteria andCategoryIdsNotIn(List<String> values) {
            addCriterion("category_ids not in", values, "categoryIds");
            return (Criteria) this;
        }

        public Criteria andCategoryIdsBetween(String value1, String value2) {
            addCriterion("category_ids between", value1, value2, "categoryIds");
            return (Criteria) this;
        }

        public Criteria andCategoryIdsNotBetween(String value1, String value2) {
            addCriterion("category_ids not between", value1, value2, "categoryIds");
            return (Criteria) this;
        }

        public Criteria andPublishAmountIsNull() {
            addCriterion("publish_amount is null");
            return (Criteria) this;
        }

        public Criteria andPublishAmountIsNotNull() {
            addCriterion("publish_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPublishAmountEqualTo(Long value) {
            addCriterion("publish_amount =", value, "publishAmount");
            return (Criteria) this;
        }

        public Criteria andPublishAmountNotEqualTo(Long value) {
            addCriterion("publish_amount <>", value, "publishAmount");
            return (Criteria) this;
        }

        public Criteria andPublishAmountGreaterThan(Long value) {
            addCriterion("publish_amount >", value, "publishAmount");
            return (Criteria) this;
        }

        public Criteria andPublishAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("publish_amount >=", value, "publishAmount");
            return (Criteria) this;
        }

        public Criteria andPublishAmountLessThan(Long value) {
            addCriterion("publish_amount <", value, "publishAmount");
            return (Criteria) this;
        }

        public Criteria andPublishAmountLessThanOrEqualTo(Long value) {
            addCriterion("publish_amount <=", value, "publishAmount");
            return (Criteria) this;
        }

        public Criteria andPublishAmountIn(List<Long> values) {
            addCriterion("publish_amount in", values, "publishAmount");
            return (Criteria) this;
        }

        public Criteria andPublishAmountNotIn(List<Long> values) {
            addCriterion("publish_amount not in", values, "publishAmount");
            return (Criteria) this;
        }

        public Criteria andPublishAmountBetween(Long value1, Long value2) {
            addCriterion("publish_amount between", value1, value2, "publishAmount");
            return (Criteria) this;
        }

        public Criteria andPublishAmountNotBetween(Long value1, Long value2) {
            addCriterion("publish_amount not between", value1, value2, "publishAmount");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andBuzSourceIsNull() {
            addCriterion("buz_source is null");
            return (Criteria) this;
        }

        public Criteria andBuzSourceIsNotNull() {
            addCriterion("buz_source is not null");
            return (Criteria) this;
        }

        public Criteria andBuzSourceEqualTo(Integer value) {
            addCriterion("buz_source =", value, "buzSource");
            return (Criteria) this;
        }

        public Criteria andBuzSourceNotEqualTo(Integer value) {
            addCriterion("buz_source <>", value, "buzSource");
            return (Criteria) this;
        }

        public Criteria andBuzSourceGreaterThan(Integer value) {
            addCriterion("buz_source >", value, "buzSource");
            return (Criteria) this;
        }

        public Criteria andBuzSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("buz_source >=", value, "buzSource");
            return (Criteria) this;
        }

        public Criteria andBuzSourceLessThan(Integer value) {
            addCriterion("buz_source <", value, "buzSource");
            return (Criteria) this;
        }

        public Criteria andBuzSourceLessThanOrEqualTo(Integer value) {
            addCriterion("buz_source <=", value, "buzSource");
            return (Criteria) this;
        }

        public Criteria andBuzSourceIn(List<Integer> values) {
            addCriterion("buz_source in", values, "buzSource");
            return (Criteria) this;
        }

        public Criteria andBuzSourceNotIn(List<Integer> values) {
            addCriterion("buz_source not in", values, "buzSource");
            return (Criteria) this;
        }

        public Criteria andBuzSourceBetween(Integer value1, Integer value2) {
            addCriterion("buz_source between", value1, value2, "buzSource");
            return (Criteria) this;
        }

        public Criteria andBuzSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("buz_source not between", value1, value2, "buzSource");
            return (Criteria) this;
        }

        public Criteria andAutoApplyIsNull() {
            addCriterion("auto_apply is null");
            return (Criteria) this;
        }

        public Criteria andAutoApplyIsNotNull() {
            addCriterion("auto_apply is not null");
            return (Criteria) this;
        }

        public Criteria andAutoApplyEqualTo(Byte value) {
            addCriterion("auto_apply =", value, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyNotEqualTo(Byte value) {
            addCriterion("auto_apply <>", value, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyGreaterThan(Byte value) {
            addCriterion("auto_apply >", value, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyGreaterThanOrEqualTo(Byte value) {
            addCriterion("auto_apply >=", value, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyLessThan(Byte value) {
            addCriterion("auto_apply <", value, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyLessThanOrEqualTo(Byte value) {
            addCriterion("auto_apply <=", value, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyIn(List<Byte> values) {
            addCriterion("auto_apply in", values, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyNotIn(List<Byte> values) {
            addCriterion("auto_apply not in", values, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyBetween(Byte value1, Byte value2) {
            addCriterion("auto_apply between", value1, value2, "autoApply");
            return (Criteria) this;
        }

        public Criteria andAutoApplyNotBetween(Byte value1, Byte value2) {
            addCriterion("auto_apply not between", value1, value2, "autoApply");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}