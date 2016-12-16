package com.jarly.mall.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberOrderExample() {
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAmountPaidIsNull() {
            addCriterion("amount_paid is null");
            return (Criteria) this;
        }

        public Criteria andAmountPaidIsNotNull() {
            addCriterion("amount_paid is not null");
            return (Criteria) this;
        }

        public Criteria andAmountPaidEqualTo(BigDecimal value) {
            addCriterion("amount_paid =", value, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidNotEqualTo(BigDecimal value) {
            addCriterion("amount_paid <>", value, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidGreaterThan(BigDecimal value) {
            addCriterion("amount_paid >", value, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_paid >=", value, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidLessThan(BigDecimal value) {
            addCriterion("amount_paid <", value, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_paid <=", value, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidIn(List<BigDecimal> values) {
            addCriterion("amount_paid in", values, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidNotIn(List<BigDecimal> values) {
            addCriterion("amount_paid not in", values, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_paid between", value1, value2, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAmountPaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_paid not between", value1, value2, "amountPaid");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountIsNull() {
            addCriterion("coupon_discount is null");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountIsNotNull() {
            addCriterion("coupon_discount is not null");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountEqualTo(BigDecimal value) {
            addCriterion("coupon_discount =", value, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountNotEqualTo(BigDecimal value) {
            addCriterion("coupon_discount <>", value, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountGreaterThan(BigDecimal value) {
            addCriterion("coupon_discount >", value, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_discount >=", value, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountLessThan(BigDecimal value) {
            addCriterion("coupon_discount <", value, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_discount <=", value, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountIn(List<BigDecimal> values) {
            addCriterion("coupon_discount in", values, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountNotIn(List<BigDecimal> values) {
            addCriterion("coupon_discount not in", values, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_discount between", value1, value2, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andCouponDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_discount not between", value1, value2, "couponDiscount");
            return (Criteria) this;
        }

        public Criteria andExpireIsNull() {
            addCriterion("expire is null");
            return (Criteria) this;
        }

        public Criteria andExpireIsNotNull() {
            addCriterion("expire is not null");
            return (Criteria) this;
        }

        public Criteria andExpireEqualTo(Date value) {
            addCriterion("expire =", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotEqualTo(Date value) {
            addCriterion("expire <>", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireGreaterThan(Date value) {
            addCriterion("expire >", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireGreaterThanOrEqualTo(Date value) {
            addCriterion("expire >=", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireLessThan(Date value) {
            addCriterion("expire <", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireLessThanOrEqualTo(Date value) {
            addCriterion("expire <=", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireIn(List<Date> values) {
            addCriterion("expire in", values, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotIn(List<Date> values) {
            addCriterion("expire not in", values, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireBetween(Date value1, Date value2) {
            addCriterion("expire between", value1, value2, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotBetween(Date value1, Date value2) {
            addCriterion("expire not between", value1, value2, "expire");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(BigDecimal value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(BigDecimal value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(BigDecimal value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(BigDecimal value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<BigDecimal> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<BigDecimal> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNull() {
            addCriterion("invoice_title is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNotNull() {
            addCriterion("invoice_title is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleEqualTo(String value) {
            addCriterion("invoice_title =", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotEqualTo(String value) {
            addCriterion("invoice_title <>", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThan(String value) {
            addCriterion("invoice_title >", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_title >=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThan(String value) {
            addCriterion("invoice_title <", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThanOrEqualTo(String value) {
            addCriterion("invoice_title <=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLike(String value) {
            addCriterion("invoice_title like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotLike(String value) {
            addCriterion("invoice_title not like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIn(List<String> values) {
            addCriterion("invoice_title in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotIn(List<String> values) {
            addCriterion("invoice_title not in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleBetween(String value1, String value2) {
            addCriterion("invoice_title between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotBetween(String value1, String value2) {
            addCriterion("invoice_title not between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andIsAllocatedStockIsNull() {
            addCriterion("is_allocated_stock is null");
            return (Criteria) this;
        }

        public Criteria andIsAllocatedStockIsNotNull() {
            addCriterion("is_allocated_stock is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllocatedStockEqualTo(Boolean value) {
            addCriterion("is_allocated_stock =", value, "isAllocatedStock");
            return (Criteria) this;
        }

        public Criteria andIsAllocatedStockNotEqualTo(Boolean value) {
            addCriterion("is_allocated_stock <>", value, "isAllocatedStock");
            return (Criteria) this;
        }

        public Criteria andIsAllocatedStockGreaterThan(Boolean value) {
            addCriterion("is_allocated_stock >", value, "isAllocatedStock");
            return (Criteria) this;
        }

        public Criteria andIsAllocatedStockGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_allocated_stock >=", value, "isAllocatedStock");
            return (Criteria) this;
        }

        public Criteria andIsAllocatedStockLessThan(Boolean value) {
            addCriterion("is_allocated_stock <", value, "isAllocatedStock");
            return (Criteria) this;
        }

        public Criteria andIsAllocatedStockLessThanOrEqualTo(Boolean value) {
            addCriterion("is_allocated_stock <=", value, "isAllocatedStock");
            return (Criteria) this;
        }

        public Criteria andIsAllocatedStockIn(List<Boolean> values) {
            addCriterion("is_allocated_stock in", values, "isAllocatedStock");
            return (Criteria) this;
        }

        public Criteria andIsAllocatedStockNotIn(List<Boolean> values) {
            addCriterion("is_allocated_stock not in", values, "isAllocatedStock");
            return (Criteria) this;
        }

        public Criteria andIsAllocatedStockBetween(Boolean value1, Boolean value2) {
            addCriterion("is_allocated_stock between", value1, value2, "isAllocatedStock");
            return (Criteria) this;
        }

        public Criteria andIsAllocatedStockNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_allocated_stock not between", value1, value2, "isAllocatedStock");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNull() {
            addCriterion("is_invoice is null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNotNull() {
            addCriterion("is_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceEqualTo(Boolean value) {
            addCriterion("is_invoice =", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotEqualTo(Boolean value) {
            addCriterion("is_invoice <>", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThan(Boolean value) {
            addCriterion("is_invoice >", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_invoice >=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThan(Boolean value) {
            addCriterion("is_invoice <", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThanOrEqualTo(Boolean value) {
            addCriterion("is_invoice <=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIn(List<Boolean> values) {
            addCriterion("is_invoice in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotIn(List<Boolean> values) {
            addCriterion("is_invoice not in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceBetween(Boolean value1, Boolean value2) {
            addCriterion("is_invoice between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_invoice not between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andLockExpireIsNull() {
            addCriterion("lock_expire is null");
            return (Criteria) this;
        }

        public Criteria andLockExpireIsNotNull() {
            addCriterion("lock_expire is not null");
            return (Criteria) this;
        }

        public Criteria andLockExpireEqualTo(Date value) {
            addCriterion("lock_expire =", value, "lockExpire");
            return (Criteria) this;
        }

        public Criteria andLockExpireNotEqualTo(Date value) {
            addCriterion("lock_expire <>", value, "lockExpire");
            return (Criteria) this;
        }

        public Criteria andLockExpireGreaterThan(Date value) {
            addCriterion("lock_expire >", value, "lockExpire");
            return (Criteria) this;
        }

        public Criteria andLockExpireGreaterThanOrEqualTo(Date value) {
            addCriterion("lock_expire >=", value, "lockExpire");
            return (Criteria) this;
        }

        public Criteria andLockExpireLessThan(Date value) {
            addCriterion("lock_expire <", value, "lockExpire");
            return (Criteria) this;
        }

        public Criteria andLockExpireLessThanOrEqualTo(Date value) {
            addCriterion("lock_expire <=", value, "lockExpire");
            return (Criteria) this;
        }

        public Criteria andLockExpireIn(List<Date> values) {
            addCriterion("lock_expire in", values, "lockExpire");
            return (Criteria) this;
        }

        public Criteria andLockExpireNotIn(List<Date> values) {
            addCriterion("lock_expire not in", values, "lockExpire");
            return (Criteria) this;
        }

        public Criteria andLockExpireBetween(Date value1, Date value2) {
            addCriterion("lock_expire between", value1, value2, "lockExpire");
            return (Criteria) this;
        }

        public Criteria andLockExpireNotBetween(Date value1, Date value2) {
            addCriterion("lock_expire not between", value1, value2, "lockExpire");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andOffsetAmountIsNull() {
            addCriterion("offset_amount is null");
            return (Criteria) this;
        }

        public Criteria andOffsetAmountIsNotNull() {
            addCriterion("offset_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetAmountEqualTo(BigDecimal value) {
            addCriterion("offset_amount =", value, "offsetAmount");
            return (Criteria) this;
        }

        public Criteria andOffsetAmountNotEqualTo(BigDecimal value) {
            addCriterion("offset_amount <>", value, "offsetAmount");
            return (Criteria) this;
        }

        public Criteria andOffsetAmountGreaterThan(BigDecimal value) {
            addCriterion("offset_amount >", value, "offsetAmount");
            return (Criteria) this;
        }

        public Criteria andOffsetAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("offset_amount >=", value, "offsetAmount");
            return (Criteria) this;
        }

        public Criteria andOffsetAmountLessThan(BigDecimal value) {
            addCriterion("offset_amount <", value, "offsetAmount");
            return (Criteria) this;
        }

        public Criteria andOffsetAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("offset_amount <=", value, "offsetAmount");
            return (Criteria) this;
        }

        public Criteria andOffsetAmountIn(List<BigDecimal> values) {
            addCriterion("offset_amount in", values, "offsetAmount");
            return (Criteria) this;
        }

        public Criteria andOffsetAmountNotIn(List<BigDecimal> values) {
            addCriterion("offset_amount not in", values, "offsetAmount");
            return (Criteria) this;
        }

        public Criteria andOffsetAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offset_amount between", value1, value2, "offsetAmount");
            return (Criteria) this;
        }

        public Criteria andOffsetAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offset_amount not between", value1, value2, "offsetAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Byte value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Byte value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Byte value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Byte value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Byte value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Byte> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Byte> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Byte value1, Byte value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameIsNull() {
            addCriterion("payment_method_name is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameIsNotNull() {
            addCriterion("payment_method_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameEqualTo(String value) {
            addCriterion("payment_method_name =", value, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameNotEqualTo(String value) {
            addCriterion("payment_method_name <>", value, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameGreaterThan(String value) {
            addCriterion("payment_method_name >", value, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("payment_method_name >=", value, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameLessThan(String value) {
            addCriterion("payment_method_name <", value, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameLessThanOrEqualTo(String value) {
            addCriterion("payment_method_name <=", value, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameLike(String value) {
            addCriterion("payment_method_name like", value, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameNotLike(String value) {
            addCriterion("payment_method_name not like", value, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameIn(List<String> values) {
            addCriterion("payment_method_name in", values, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameNotIn(List<String> values) {
            addCriterion("payment_method_name not in", values, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameBetween(String value1, String value2) {
            addCriterion("payment_method_name between", value1, value2, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNameNotBetween(String value1, String value2) {
            addCriterion("payment_method_name not between", value1, value2, "paymentMethodName");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNull() {
            addCriterion("payment_status is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNotNull() {
            addCriterion("payment_status is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusEqualTo(Integer value) {
            addCriterion("payment_status =", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotEqualTo(Integer value) {
            addCriterion("payment_status <>", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThan(Integer value) {
            addCriterion("payment_status >", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_status >=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThan(Integer value) {
            addCriterion("payment_status <", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("payment_status <=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIn(List<Integer> values) {
            addCriterion("payment_status in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotIn(List<Integer> values) {
            addCriterion("payment_status not in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusBetween(Integer value1, Integer value2) {
            addCriterion("payment_status between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_status not between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Long value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Long value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Long value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Long value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Long value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Long value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Long> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Long> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Long value1, Long value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Long value1, Long value2) {
            addCriterion("point not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPromotionIsNull() {
            addCriterion("promotion is null");
            return (Criteria) this;
        }

        public Criteria andPromotionIsNotNull() {
            addCriterion("promotion is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionEqualTo(String value) {
            addCriterion("promotion =", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionNotEqualTo(String value) {
            addCriterion("promotion <>", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionGreaterThan(String value) {
            addCriterion("promotion >", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionGreaterThanOrEqualTo(String value) {
            addCriterion("promotion >=", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionLessThan(String value) {
            addCriterion("promotion <", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionLessThanOrEqualTo(String value) {
            addCriterion("promotion <=", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionLike(String value) {
            addCriterion("promotion like", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionNotLike(String value) {
            addCriterion("promotion not like", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionIn(List<String> values) {
            addCriterion("promotion in", values, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionNotIn(List<String> values) {
            addCriterion("promotion not in", values, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionBetween(String value1, String value2) {
            addCriterion("promotion between", value1, value2, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionNotBetween(String value1, String value2) {
            addCriterion("promotion not between", value1, value2, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountIsNull() {
            addCriterion("promotion_discount is null");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountIsNotNull() {
            addCriterion("promotion_discount is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountEqualTo(BigDecimal value) {
            addCriterion("promotion_discount =", value, "promotionDiscount");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountNotEqualTo(BigDecimal value) {
            addCriterion("promotion_discount <>", value, "promotionDiscount");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountGreaterThan(BigDecimal value) {
            addCriterion("promotion_discount >", value, "promotionDiscount");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_discount >=", value, "promotionDiscount");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountLessThan(BigDecimal value) {
            addCriterion("promotion_discount <", value, "promotionDiscount");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_discount <=", value, "promotionDiscount");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountIn(List<BigDecimal> values) {
            addCriterion("promotion_discount in", values, "promotionDiscount");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountNotIn(List<BigDecimal> values) {
            addCriterion("promotion_discount not in", values, "promotionDiscount");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_discount between", value1, value2, "promotionDiscount");
            return (Criteria) this;
        }

        public Criteria andPromotionDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_discount not between", value1, value2, "promotionDiscount");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNameIsNull() {
            addCriterion("shipping_method_name is null");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNameIsNotNull() {
            addCriterion("shipping_method_name is not null");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNameEqualTo(String value) {
            addCriterion("shipping_method_name =", value, "shippingMethodName");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNameNotEqualTo(String value) {
            addCriterion("shipping_method_name <>", value, "shippingMethodName");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNameGreaterThan(String value) {
            addCriterion("shipping_method_name >", value, "shippingMethodName");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_method_name >=", value, "shippingMethodName");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNameLessThan(String value) {
            addCriterion("shipping_method_name <", value, "shippingMethodName");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNameLessThanOrEqualTo(String value) {
            addCriterion("shipping_method_name <=", value, "shippingMethodName");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNameLike(String value) {
            addCriterion("shipping_method_name like", value, "shippingMethodName");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNameNotLike(String value) {
            addCriterion("shipping_method_name not like", value, "shippingMethodName");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNameIn(List<String> values) {
            addCriterion("shipping_method_name in", values, "shippingMethodName");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNameNotIn(List<String> values) {
            addCriterion("shipping_method_name not in", values, "shippingMethodName");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNameBetween(String value1, String value2) {
            addCriterion("shipping_method_name between", value1, value2, "shippingMethodName");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNameNotBetween(String value1, String value2) {
            addCriterion("shipping_method_name not between", value1, value2, "shippingMethodName");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIsNull() {
            addCriterion("shipping_status is null");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIsNotNull() {
            addCriterion("shipping_status is not null");
            return (Criteria) this;
        }

        public Criteria andShippingStatusEqualTo(Integer value) {
            addCriterion("shipping_status =", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotEqualTo(Integer value) {
            addCriterion("shipping_status <>", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusGreaterThan(Integer value) {
            addCriterion("shipping_status >", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipping_status >=", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusLessThan(Integer value) {
            addCriterion("shipping_status <", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusLessThanOrEqualTo(Integer value) {
            addCriterion("shipping_status <=", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIn(List<Integer> values) {
            addCriterion("shipping_status in", values, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotIn(List<Integer> values) {
            addCriterion("shipping_status not in", values, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusBetween(Integer value1, Integer value2) {
            addCriterion("shipping_status between", value1, value2, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("shipping_status not between", value1, value2, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameIsNull() {
            addCriterion("delivery_corp_name is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameIsNotNull() {
            addCriterion("delivery_corp_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameEqualTo(String value) {
            addCriterion("delivery_corp_name =", value, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameNotEqualTo(String value) {
            addCriterion("delivery_corp_name <>", value, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameGreaterThan(String value) {
            addCriterion("delivery_corp_name >", value, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_corp_name >=", value, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameLessThan(String value) {
            addCriterion("delivery_corp_name <", value, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameLessThanOrEqualTo(String value) {
            addCriterion("delivery_corp_name <=", value, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameLike(String value) {
            addCriterion("delivery_corp_name like", value, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameNotLike(String value) {
            addCriterion("delivery_corp_name not like", value, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameIn(List<String> values) {
            addCriterion("delivery_corp_name in", values, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameNotIn(List<String> values) {
            addCriterion("delivery_corp_name not in", values, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameBetween(String value1, String value2) {
            addCriterion("delivery_corp_name between", value1, value2, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCorpNameNotBetween(String value1, String value2) {
            addCriterion("delivery_corp_name not between", value1, value2, "deliveryCorpName");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("zip_code is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("zip_code =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("zip_code <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("zip_code >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zip_code >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("zip_code <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("zip_code <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("zip_code like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("zip_code not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("zip_code in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("zip_code not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("zip_code between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("zip_code not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Long value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Long value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Long value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Long value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Long value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Long> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Long> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Long value1, Long value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Long value1, Long value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andCouponCodeIsNull() {
            addCriterion("coupon_code is null");
            return (Criteria) this;
        }

        public Criteria andCouponCodeIsNotNull() {
            addCriterion("coupon_code is not null");
            return (Criteria) this;
        }

        public Criteria andCouponCodeEqualTo(Long value) {
            addCriterion("coupon_code =", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeNotEqualTo(Long value) {
            addCriterion("coupon_code <>", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeGreaterThan(Long value) {
            addCriterion("coupon_code >", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("coupon_code >=", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeLessThan(Long value) {
            addCriterion("coupon_code <", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeLessThanOrEqualTo(Long value) {
            addCriterion("coupon_code <=", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeIn(List<Long> values) {
            addCriterion("coupon_code in", values, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeNotIn(List<Long> values) {
            addCriterion("coupon_code not in", values, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeBetween(Long value1, Long value2) {
            addCriterion("coupon_code between", value1, value2, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeNotBetween(Long value1, Long value2) {
            addCriterion("coupon_code not between", value1, value2, "couponCode");
            return (Criteria) this;
        }

        public Criteria andMemberIsNull() {
            addCriterion("member is null");
            return (Criteria) this;
        }

        public Criteria andMemberIsNotNull() {
            addCriterion("member is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEqualTo(Long value) {
            addCriterion("member =", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotEqualTo(Long value) {
            addCriterion("member <>", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThan(Long value) {
            addCriterion("member >", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThanOrEqualTo(Long value) {
            addCriterion("member >=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThan(Long value) {
            addCriterion("member <", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThanOrEqualTo(Long value) {
            addCriterion("member <=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberIn(List<Long> values) {
            addCriterion("member in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotIn(List<Long> values) {
            addCriterion("member not in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberBetween(Long value1, Long value2) {
            addCriterion("member between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotBetween(Long value1, Long value2) {
            addCriterion("member not between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(Long value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(Long value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(Long value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(Long value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(Long value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(Long value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<Long> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<Long> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(Long value1, Long value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(Long value1, Long value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNull() {
            addCriterion("payment_method is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNotNull() {
            addCriterion("payment_method is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodEqualTo(Long value) {
            addCriterion("payment_method =", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotEqualTo(Long value) {
            addCriterion("payment_method <>", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThan(Long value) {
            addCriterion("payment_method >", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThanOrEqualTo(Long value) {
            addCriterion("payment_method >=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThan(Long value) {
            addCriterion("payment_method <", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThanOrEqualTo(Long value) {
            addCriterion("payment_method <=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIn(List<Long> values) {
            addCriterion("payment_method in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotIn(List<Long> values) {
            addCriterion("payment_method not in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodBetween(Long value1, Long value2) {
            addCriterion("payment_method between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotBetween(Long value1, Long value2) {
            addCriterion("payment_method not between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNull() {
            addCriterion("pay_date is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(Date value) {
            addCriterion("pay_date =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(Date value) {
            addCriterion("pay_date <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(Date value) {
            addCriterion("pay_date >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_date >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(Date value) {
            addCriterion("pay_date <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(Date value) {
            addCriterion("pay_date <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<Date> values) {
            addCriterion("pay_date in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<Date> values) {
            addCriterion("pay_date not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(Date value1, Date value2) {
            addCriterion("pay_date between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(Date value1, Date value2) {
            addCriterion("pay_date not between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andShippingMethodIsNull() {
            addCriterion("shipping_method is null");
            return (Criteria) this;
        }

        public Criteria andShippingMethodIsNotNull() {
            addCriterion("shipping_method is not null");
            return (Criteria) this;
        }

        public Criteria andShippingMethodEqualTo(Long value) {
            addCriterion("shipping_method =", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNotEqualTo(Long value) {
            addCriterion("shipping_method <>", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodGreaterThan(Long value) {
            addCriterion("shipping_method >", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodGreaterThanOrEqualTo(Long value) {
            addCriterion("shipping_method >=", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodLessThan(Long value) {
            addCriterion("shipping_method <", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodLessThanOrEqualTo(Long value) {
            addCriterion("shipping_method <=", value, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodIn(List<Long> values) {
            addCriterion("shipping_method in", values, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNotIn(List<Long> values) {
            addCriterion("shipping_method not in", values, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodBetween(Long value1, Long value2) {
            addCriterion("shipping_method between", value1, value2, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andShippingMethodNotBetween(Long value1, Long value2) {
            addCriterion("shipping_method not between", value1, value2, "shippingMethod");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterIsNull() {
            addCriterion("experience_center is null");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterIsNotNull() {
            addCriterion("experience_center is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterEqualTo(Long value) {
            addCriterion("experience_center =", value, "experienceCenter");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterNotEqualTo(Long value) {
            addCriterion("experience_center <>", value, "experienceCenter");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterGreaterThan(Long value) {
            addCriterion("experience_center >", value, "experienceCenter");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterGreaterThanOrEqualTo(Long value) {
            addCriterion("experience_center >=", value, "experienceCenter");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterLessThan(Long value) {
            addCriterion("experience_center <", value, "experienceCenter");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterLessThanOrEqualTo(Long value) {
            addCriterion("experience_center <=", value, "experienceCenter");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterIn(List<Long> values) {
            addCriterion("experience_center in", values, "experienceCenter");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterNotIn(List<Long> values) {
            addCriterion("experience_center not in", values, "experienceCenter");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterBetween(Long value1, Long value2) {
            addCriterion("experience_center between", value1, value2, "experienceCenter");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterNotBetween(Long value1, Long value2) {
            addCriterion("experience_center not between", value1, value2, "experienceCenter");
            return (Criteria) this;
        }

        public Criteria andIsArayacakIsNull() {
            addCriterion("is_arayacak is null");
            return (Criteria) this;
        }

        public Criteria andIsArayacakIsNotNull() {
            addCriterion("is_arayacak is not null");
            return (Criteria) this;
        }

        public Criteria andIsArayacakEqualTo(Boolean value) {
            addCriterion("is_arayacak =", value, "isArayacak");
            return (Criteria) this;
        }

        public Criteria andIsArayacakNotEqualTo(Boolean value) {
            addCriterion("is_arayacak <>", value, "isArayacak");
            return (Criteria) this;
        }

        public Criteria andIsArayacakGreaterThan(Boolean value) {
            addCriterion("is_arayacak >", value, "isArayacak");
            return (Criteria) this;
        }

        public Criteria andIsArayacakGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_arayacak >=", value, "isArayacak");
            return (Criteria) this;
        }

        public Criteria andIsArayacakLessThan(Boolean value) {
            addCriterion("is_arayacak <", value, "isArayacak");
            return (Criteria) this;
        }

        public Criteria andIsArayacakLessThanOrEqualTo(Boolean value) {
            addCriterion("is_arayacak <=", value, "isArayacak");
            return (Criteria) this;
        }

        public Criteria andIsArayacakIn(List<Boolean> values) {
            addCriterion("is_arayacak in", values, "isArayacak");
            return (Criteria) this;
        }

        public Criteria andIsArayacakNotIn(List<Boolean> values) {
            addCriterion("is_arayacak not in", values, "isArayacak");
            return (Criteria) this;
        }

        public Criteria andIsArayacakBetween(Boolean value1, Boolean value2) {
            addCriterion("is_arayacak between", value1, value2, "isArayacak");
            return (Criteria) this;
        }

        public Criteria andIsArayacakNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_arayacak not between", value1, value2, "isArayacak");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterNameIsNull() {
            addCriterion("experience_center_name is null");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterNameIsNotNull() {
            addCriterion("experience_center_name is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterNameEqualTo(String value) {
            addCriterion("experience_center_name =", value, "experienceCenterName");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterNameNotEqualTo(String value) {
            addCriterion("experience_center_name <>", value, "experienceCenterName");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterNameGreaterThan(String value) {
            addCriterion("experience_center_name >", value, "experienceCenterName");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterNameGreaterThanOrEqualTo(String value) {
            addCriterion("experience_center_name >=", value, "experienceCenterName");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterNameLessThan(String value) {
            addCriterion("experience_center_name <", value, "experienceCenterName");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterNameLessThanOrEqualTo(String value) {
            addCriterion("experience_center_name <=", value, "experienceCenterName");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterNameLike(String value) {
            addCriterion("experience_center_name like", value, "experienceCenterName");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterNameNotLike(String value) {
            addCriterion("experience_center_name not like", value, "experienceCenterName");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterNameIn(List<String> values) {
            addCriterion("experience_center_name in", values, "experienceCenterName");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterNameNotIn(List<String> values) {
            addCriterion("experience_center_name not in", values, "experienceCenterName");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterNameBetween(String value1, String value2) {
            addCriterion("experience_center_name between", value1, value2, "experienceCenterName");
            return (Criteria) this;
        }

        public Criteria andExperienceCenterNameNotBetween(String value1, String value2) {
            addCriterion("experience_center_name not between", value1, value2, "experienceCenterName");
            return (Criteria) this;
        }

        public Criteria andInstallPriceIsNull() {
            addCriterion("install_price is null");
            return (Criteria) this;
        }

        public Criteria andInstallPriceIsNotNull() {
            addCriterion("install_price is not null");
            return (Criteria) this;
        }

        public Criteria andInstallPriceEqualTo(BigDecimal value) {
            addCriterion("install_price =", value, "installPrice");
            return (Criteria) this;
        }

        public Criteria andInstallPriceNotEqualTo(BigDecimal value) {
            addCriterion("install_price <>", value, "installPrice");
            return (Criteria) this;
        }

        public Criteria andInstallPriceGreaterThan(BigDecimal value) {
            addCriterion("install_price >", value, "installPrice");
            return (Criteria) this;
        }

        public Criteria andInstallPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("install_price >=", value, "installPrice");
            return (Criteria) this;
        }

        public Criteria andInstallPriceLessThan(BigDecimal value) {
            addCriterion("install_price <", value, "installPrice");
            return (Criteria) this;
        }

        public Criteria andInstallPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("install_price <=", value, "installPrice");
            return (Criteria) this;
        }

        public Criteria andInstallPriceIn(List<BigDecimal> values) {
            addCriterion("install_price in", values, "installPrice");
            return (Criteria) this;
        }

        public Criteria andInstallPriceNotIn(List<BigDecimal> values) {
            addCriterion("install_price not in", values, "installPrice");
            return (Criteria) this;
        }

        public Criteria andInstallPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("install_price between", value1, value2, "installPrice");
            return (Criteria) this;
        }

        public Criteria andInstallPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("install_price not between", value1, value2, "installPrice");
            return (Criteria) this;
        }

        public Criteria andIsInstallIsNull() {
            addCriterion("is_install is null");
            return (Criteria) this;
        }

        public Criteria andIsInstallIsNotNull() {
            addCriterion("is_install is not null");
            return (Criteria) this;
        }

        public Criteria andIsInstallEqualTo(Boolean value) {
            addCriterion("is_install =", value, "isInstall");
            return (Criteria) this;
        }

        public Criteria andIsInstallNotEqualTo(Boolean value) {
            addCriterion("is_install <>", value, "isInstall");
            return (Criteria) this;
        }

        public Criteria andIsInstallGreaterThan(Boolean value) {
            addCriterion("is_install >", value, "isInstall");
            return (Criteria) this;
        }

        public Criteria andIsInstallGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_install >=", value, "isInstall");
            return (Criteria) this;
        }

        public Criteria andIsInstallLessThan(Boolean value) {
            addCriterion("is_install <", value, "isInstall");
            return (Criteria) this;
        }

        public Criteria andIsInstallLessThanOrEqualTo(Boolean value) {
            addCriterion("is_install <=", value, "isInstall");
            return (Criteria) this;
        }

        public Criteria andIsInstallIn(List<Boolean> values) {
            addCriterion("is_install in", values, "isInstall");
            return (Criteria) this;
        }

        public Criteria andIsInstallNotIn(List<Boolean> values) {
            addCriterion("is_install not in", values, "isInstall");
            return (Criteria) this;
        }

        public Criteria andIsInstallBetween(Boolean value1, Boolean value2) {
            addCriterion("is_install between", value1, value2, "isInstall");
            return (Criteria) this;
        }

        public Criteria andIsInstallNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_install not between", value1, value2, "isInstall");
            return (Criteria) this;
        }

        public Criteria andReductionContentIsNull() {
            addCriterion("reduction_content is null");
            return (Criteria) this;
        }

        public Criteria andReductionContentIsNotNull() {
            addCriterion("reduction_content is not null");
            return (Criteria) this;
        }

        public Criteria andReductionContentEqualTo(Long value) {
            addCriterion("reduction_content =", value, "reductionContent");
            return (Criteria) this;
        }

        public Criteria andReductionContentNotEqualTo(Long value) {
            addCriterion("reduction_content <>", value, "reductionContent");
            return (Criteria) this;
        }

        public Criteria andReductionContentGreaterThan(Long value) {
            addCriterion("reduction_content >", value, "reductionContent");
            return (Criteria) this;
        }

        public Criteria andReductionContentGreaterThanOrEqualTo(Long value) {
            addCriterion("reduction_content >=", value, "reductionContent");
            return (Criteria) this;
        }

        public Criteria andReductionContentLessThan(Long value) {
            addCriterion("reduction_content <", value, "reductionContent");
            return (Criteria) this;
        }

        public Criteria andReductionContentLessThanOrEqualTo(Long value) {
            addCriterion("reduction_content <=", value, "reductionContent");
            return (Criteria) this;
        }

        public Criteria andReductionContentIn(List<Long> values) {
            addCriterion("reduction_content in", values, "reductionContent");
            return (Criteria) this;
        }

        public Criteria andReductionContentNotIn(List<Long> values) {
            addCriterion("reduction_content not in", values, "reductionContent");
            return (Criteria) this;
        }

        public Criteria andReductionContentBetween(Long value1, Long value2) {
            addCriterion("reduction_content between", value1, value2, "reductionContent");
            return (Criteria) this;
        }

        public Criteria andReductionContentNotBetween(Long value1, Long value2) {
            addCriterion("reduction_content not between", value1, value2, "reductionContent");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNull() {
            addCriterion("send_date is null");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNotNull() {
            addCriterion("send_date is not null");
            return (Criteria) this;
        }

        public Criteria andSendDateEqualTo(Date value) {
            addCriterion("send_date =", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotEqualTo(Date value) {
            addCriterion("send_date <>", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThan(Date value) {
            addCriterion("send_date >", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThanOrEqualTo(Date value) {
            addCriterion("send_date >=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThan(Date value) {
            addCriterion("send_date <", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThanOrEqualTo(Date value) {
            addCriterion("send_date <=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateIn(List<Date> values) {
            addCriterion("send_date in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotIn(List<Date> values) {
            addCriterion("send_date not in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateBetween(Date value1, Date value2) {
            addCriterion("send_date between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotBetween(Date value1, Date value2) {
            addCriterion("send_date not between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andReductionPriceIsNull() {
            addCriterion("reduction_price is null");
            return (Criteria) this;
        }

        public Criteria andReductionPriceIsNotNull() {
            addCriterion("reduction_price is not null");
            return (Criteria) this;
        }

        public Criteria andReductionPriceEqualTo(BigDecimal value) {
            addCriterion("reduction_price =", value, "reductionPrice");
            return (Criteria) this;
        }

        public Criteria andReductionPriceNotEqualTo(BigDecimal value) {
            addCriterion("reduction_price <>", value, "reductionPrice");
            return (Criteria) this;
        }

        public Criteria andReductionPriceGreaterThan(BigDecimal value) {
            addCriterion("reduction_price >", value, "reductionPrice");
            return (Criteria) this;
        }

        public Criteria andReductionPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reduction_price >=", value, "reductionPrice");
            return (Criteria) this;
        }

        public Criteria andReductionPriceLessThan(BigDecimal value) {
            addCriterion("reduction_price <", value, "reductionPrice");
            return (Criteria) this;
        }

        public Criteria andReductionPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reduction_price <=", value, "reductionPrice");
            return (Criteria) this;
        }

        public Criteria andReductionPriceIn(List<BigDecimal> values) {
            addCriterion("reduction_price in", values, "reductionPrice");
            return (Criteria) this;
        }

        public Criteria andReductionPriceNotIn(List<BigDecimal> values) {
            addCriterion("reduction_price not in", values, "reductionPrice");
            return (Criteria) this;
        }

        public Criteria andReductionPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reduction_price between", value1, value2, "reductionPrice");
            return (Criteria) this;
        }

        public Criteria andReductionPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reduction_price not between", value1, value2, "reductionPrice");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNull() {
            addCriterion("receive_Date is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNotNull() {
            addCriterion("receive_Date is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateEqualTo(Date value) {
            addCriterion("receive_Date =", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotEqualTo(Date value) {
            addCriterion("receive_Date <>", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThan(Date value) {
            addCriterion("receive_Date >", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_Date >=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThan(Date value) {
            addCriterion("receive_Date <", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThanOrEqualTo(Date value) {
            addCriterion("receive_Date <=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIn(List<Date> values) {
            addCriterion("receive_Date in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotIn(List<Date> values) {
            addCriterion("receive_Date not in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateBetween(Date value1, Date value2) {
            addCriterion("receive_Date between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotBetween(Date value1, Date value2) {
            addCriterion("receive_Date not between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterIsNull() {
            addCriterion("delivery_center is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterIsNotNull() {
            addCriterion("delivery_center is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterEqualTo(Long value) {
            addCriterion("delivery_center =", value, "deliveryCenter");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterNotEqualTo(Long value) {
            addCriterion("delivery_center <>", value, "deliveryCenter");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterGreaterThan(Long value) {
            addCriterion("delivery_center >", value, "deliveryCenter");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterGreaterThanOrEqualTo(Long value) {
            addCriterion("delivery_center >=", value, "deliveryCenter");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterLessThan(Long value) {
            addCriterion("delivery_center <", value, "deliveryCenter");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterLessThanOrEqualTo(Long value) {
            addCriterion("delivery_center <=", value, "deliveryCenter");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterIn(List<Long> values) {
            addCriterion("delivery_center in", values, "deliveryCenter");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterNotIn(List<Long> values) {
            addCriterion("delivery_center not in", values, "deliveryCenter");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterBetween(Long value1, Long value2) {
            addCriterion("delivery_center between", value1, value2, "deliveryCenter");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterNotBetween(Long value1, Long value2) {
            addCriterion("delivery_center not between", value1, value2, "deliveryCenter");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterNameIsNull() {
            addCriterion("delivery_center_name is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterNameIsNotNull() {
            addCriterion("delivery_center_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterNameEqualTo(String value) {
            addCriterion("delivery_center_name =", value, "deliveryCenterName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterNameNotEqualTo(String value) {
            addCriterion("delivery_center_name <>", value, "deliveryCenterName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterNameGreaterThan(String value) {
            addCriterion("delivery_center_name >", value, "deliveryCenterName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterNameGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_center_name >=", value, "deliveryCenterName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterNameLessThan(String value) {
            addCriterion("delivery_center_name <", value, "deliveryCenterName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterNameLessThanOrEqualTo(String value) {
            addCriterion("delivery_center_name <=", value, "deliveryCenterName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterNameLike(String value) {
            addCriterion("delivery_center_name like", value, "deliveryCenterName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterNameNotLike(String value) {
            addCriterion("delivery_center_name not like", value, "deliveryCenterName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterNameIn(List<String> values) {
            addCriterion("delivery_center_name in", values, "deliveryCenterName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterNameNotIn(List<String> values) {
            addCriterion("delivery_center_name not in", values, "deliveryCenterName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterNameBetween(String value1, String value2) {
            addCriterion("delivery_center_name between", value1, value2, "deliveryCenterName");
            return (Criteria) this;
        }

        public Criteria andDeliveryCenterNameNotBetween(String value1, String value2) {
            addCriterion("delivery_center_name not between", value1, value2, "deliveryCenterName");
            return (Criteria) this;
        }

        public Criteria andRefundIsNull() {
            addCriterion("refund is null");
            return (Criteria) this;
        }

        public Criteria andRefundIsNotNull() {
            addCriterion("refund is not null");
            return (Criteria) this;
        }

        public Criteria andRefundEqualTo(Long value) {
            addCriterion("refund =", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotEqualTo(Long value) {
            addCriterion("refund <>", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundGreaterThan(Long value) {
            addCriterion("refund >", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundGreaterThanOrEqualTo(Long value) {
            addCriterion("refund >=", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundLessThan(Long value) {
            addCriterion("refund <", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundLessThanOrEqualTo(Long value) {
            addCriterion("refund <=", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundIn(List<Long> values) {
            addCriterion("refund in", values, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotIn(List<Long> values) {
            addCriterion("refund not in", values, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundBetween(Long value1, Long value2) {
            addCriterion("refund between", value1, value2, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotBetween(Long value1, Long value2) {
            addCriterion("refund not between", value1, value2, "refund");
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