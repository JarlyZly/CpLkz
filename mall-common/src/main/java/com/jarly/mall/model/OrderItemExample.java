package com.jarly.mall.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderItemExample() {
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

        public Criteria andFullNameIsNull() {
            addCriterion("full_name is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("full_name is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("full_name =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("full_name <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("full_name >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("full_name >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("full_name <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("full_name <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("full_name like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("full_name not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("full_name in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("full_name not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("full_name between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("full_name not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andNetpayIsNull() {
            addCriterion("netpay is null");
            return (Criteria) this;
        }

        public Criteria andNetpayIsNotNull() {
            addCriterion("netpay is not null");
            return (Criteria) this;
        }

        public Criteria andNetpayEqualTo(BigDecimal value) {
            addCriterion("netpay =", value, "netpay");
            return (Criteria) this;
        }

        public Criteria andNetpayNotEqualTo(BigDecimal value) {
            addCriterion("netpay <>", value, "netpay");
            return (Criteria) this;
        }

        public Criteria andNetpayGreaterThan(BigDecimal value) {
            addCriterion("netpay >", value, "netpay");
            return (Criteria) this;
        }

        public Criteria andNetpayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("netpay >=", value, "netpay");
            return (Criteria) this;
        }

        public Criteria andNetpayLessThan(BigDecimal value) {
            addCriterion("netpay <", value, "netpay");
            return (Criteria) this;
        }

        public Criteria andNetpayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("netpay <=", value, "netpay");
            return (Criteria) this;
        }

        public Criteria andNetpayIn(List<BigDecimal> values) {
            addCriterion("netpay in", values, "netpay");
            return (Criteria) this;
        }

        public Criteria andNetpayNotIn(List<BigDecimal> values) {
            addCriterion("netpay not in", values, "netpay");
            return (Criteria) this;
        }

        public Criteria andNetpayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("netpay between", value1, value2, "netpay");
            return (Criteria) this;
        }

        public Criteria andNetpayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("netpay not between", value1, value2, "netpay");
            return (Criteria) this;
        }

        public Criteria andTenancyIsNull() {
            addCriterion("tenancy is null");
            return (Criteria) this;
        }

        public Criteria andTenancyIsNotNull() {
            addCriterion("tenancy is not null");
            return (Criteria) this;
        }

        public Criteria andTenancyEqualTo(Integer value) {
            addCriterion("tenancy =", value, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyNotEqualTo(Integer value) {
            addCriterion("tenancy <>", value, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyGreaterThan(Integer value) {
            addCriterion("tenancy >", value, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyGreaterThanOrEqualTo(Integer value) {
            addCriterion("tenancy >=", value, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyLessThan(Integer value) {
            addCriterion("tenancy <", value, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyLessThanOrEqualTo(Integer value) {
            addCriterion("tenancy <=", value, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyIn(List<Integer> values) {
            addCriterion("tenancy in", values, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyNotIn(List<Integer> values) {
            addCriterion("tenancy not in", values, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyBetween(Integer value1, Integer value2) {
            addCriterion("tenancy between", value1, value2, "tenancy");
            return (Criteria) this;
        }

        public Criteria andTenancyNotBetween(Integer value1, Integer value2) {
            addCriterion("tenancy not between", value1, value2, "tenancy");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(Boolean value) {
            addCriterion("is_new =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(Boolean value) {
            addCriterion("is_new <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(Boolean value) {
            addCriterion("is_new >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_new >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(Boolean value) {
            addCriterion("is_new <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(Boolean value) {
            addCriterion("is_new <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<Boolean> values) {
            addCriterion("is_new in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<Boolean> values) {
            addCriterion("is_new not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new not between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andPrePaidIsNull() {
            addCriterion("pre_paid is null");
            return (Criteria) this;
        }

        public Criteria andPrePaidIsNotNull() {
            addCriterion("pre_paid is not null");
            return (Criteria) this;
        }

        public Criteria andPrePaidEqualTo(BigDecimal value) {
            addCriterion("pre_paid =", value, "prePaid");
            return (Criteria) this;
        }

        public Criteria andPrePaidNotEqualTo(BigDecimal value) {
            addCriterion("pre_paid <>", value, "prePaid");
            return (Criteria) this;
        }

        public Criteria andPrePaidGreaterThan(BigDecimal value) {
            addCriterion("pre_paid >", value, "prePaid");
            return (Criteria) this;
        }

        public Criteria andPrePaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pre_paid >=", value, "prePaid");
            return (Criteria) this;
        }

        public Criteria andPrePaidLessThan(BigDecimal value) {
            addCriterion("pre_paid <", value, "prePaid");
            return (Criteria) this;
        }

        public Criteria andPrePaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pre_paid <=", value, "prePaid");
            return (Criteria) this;
        }

        public Criteria andPrePaidIn(List<BigDecimal> values) {
            addCriterion("pre_paid in", values, "prePaid");
            return (Criteria) this;
        }

        public Criteria andPrePaidNotIn(List<BigDecimal> values) {
            addCriterion("pre_paid not in", values, "prePaid");
            return (Criteria) this;
        }

        public Criteria andPrePaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pre_paid between", value1, value2, "prePaid");
            return (Criteria) this;
        }

        public Criteria andPrePaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pre_paid not between", value1, value2, "prePaid");
            return (Criteria) this;
        }

        public Criteria andTailPaidIsNull() {
            addCriterion("tail_paid is null");
            return (Criteria) this;
        }

        public Criteria andTailPaidIsNotNull() {
            addCriterion("tail_paid is not null");
            return (Criteria) this;
        }

        public Criteria andTailPaidEqualTo(BigDecimal value) {
            addCriterion("tail_paid =", value, "tailPaid");
            return (Criteria) this;
        }

        public Criteria andTailPaidNotEqualTo(BigDecimal value) {
            addCriterion("tail_paid <>", value, "tailPaid");
            return (Criteria) this;
        }

        public Criteria andTailPaidGreaterThan(BigDecimal value) {
            addCriterion("tail_paid >", value, "tailPaid");
            return (Criteria) this;
        }

        public Criteria andTailPaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tail_paid >=", value, "tailPaid");
            return (Criteria) this;
        }

        public Criteria andTailPaidLessThan(BigDecimal value) {
            addCriterion("tail_paid <", value, "tailPaid");
            return (Criteria) this;
        }

        public Criteria andTailPaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tail_paid <=", value, "tailPaid");
            return (Criteria) this;
        }

        public Criteria andTailPaidIn(List<BigDecimal> values) {
            addCriterion("tail_paid in", values, "tailPaid");
            return (Criteria) this;
        }

        public Criteria andTailPaidNotIn(List<BigDecimal> values) {
            addCriterion("tail_paid not in", values, "tailPaid");
            return (Criteria) this;
        }

        public Criteria andTailPaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tail_paid between", value1, value2, "tailPaid");
            return (Criteria) this;
        }

        public Criteria andTailPaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tail_paid not between", value1, value2, "tailPaid");
            return (Criteria) this;
        }

        public Criteria andLeasePaidIsNull() {
            addCriterion("lease_paid is null");
            return (Criteria) this;
        }

        public Criteria andLeasePaidIsNotNull() {
            addCriterion("lease_paid is not null");
            return (Criteria) this;
        }

        public Criteria andLeasePaidEqualTo(BigDecimal value) {
            addCriterion("lease_paid =", value, "leasePaid");
            return (Criteria) this;
        }

        public Criteria andLeasePaidNotEqualTo(BigDecimal value) {
            addCriterion("lease_paid <>", value, "leasePaid");
            return (Criteria) this;
        }

        public Criteria andLeasePaidGreaterThan(BigDecimal value) {
            addCriterion("lease_paid >", value, "leasePaid");
            return (Criteria) this;
        }

        public Criteria andLeasePaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lease_paid >=", value, "leasePaid");
            return (Criteria) this;
        }

        public Criteria andLeasePaidLessThan(BigDecimal value) {
            addCriterion("lease_paid <", value, "leasePaid");
            return (Criteria) this;
        }

        public Criteria andLeasePaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lease_paid <=", value, "leasePaid");
            return (Criteria) this;
        }

        public Criteria andLeasePaidIn(List<BigDecimal> values) {
            addCriterion("lease_paid in", values, "leasePaid");
            return (Criteria) this;
        }

        public Criteria andLeasePaidNotIn(List<BigDecimal> values) {
            addCriterion("lease_paid not in", values, "leasePaid");
            return (Criteria) this;
        }

        public Criteria andLeasePaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lease_paid between", value1, value2, "leasePaid");
            return (Criteria) this;
        }

        public Criteria andLeasePaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lease_paid not between", value1, value2, "leasePaid");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityIsNull() {
            addCriterion("return_quantity is null");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityIsNotNull() {
            addCriterion("return_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityEqualTo(Integer value) {
            addCriterion("return_quantity =", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityNotEqualTo(Integer value) {
            addCriterion("return_quantity <>", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityGreaterThan(Integer value) {
            addCriterion("return_quantity >", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_quantity >=", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityLessThan(Integer value) {
            addCriterion("return_quantity <", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("return_quantity <=", value, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityIn(List<Integer> values) {
            addCriterion("return_quantity in", values, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityNotIn(List<Integer> values) {
            addCriterion("return_quantity not in", values, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityBetween(Integer value1, Integer value2) {
            addCriterion("return_quantity between", value1, value2, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andReturnQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("return_quantity not between", value1, value2, "returnQuantity");
            return (Criteria) this;
        }

        public Criteria andShippedQuantityIsNull() {
            addCriterion("shipped_quantity is null");
            return (Criteria) this;
        }

        public Criteria andShippedQuantityIsNotNull() {
            addCriterion("shipped_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andShippedQuantityEqualTo(Integer value) {
            addCriterion("shipped_quantity =", value, "shippedQuantity");
            return (Criteria) this;
        }

        public Criteria andShippedQuantityNotEqualTo(Integer value) {
            addCriterion("shipped_quantity <>", value, "shippedQuantity");
            return (Criteria) this;
        }

        public Criteria andShippedQuantityGreaterThan(Integer value) {
            addCriterion("shipped_quantity >", value, "shippedQuantity");
            return (Criteria) this;
        }

        public Criteria andShippedQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipped_quantity >=", value, "shippedQuantity");
            return (Criteria) this;
        }

        public Criteria andShippedQuantityLessThan(Integer value) {
            addCriterion("shipped_quantity <", value, "shippedQuantity");
            return (Criteria) this;
        }

        public Criteria andShippedQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("shipped_quantity <=", value, "shippedQuantity");
            return (Criteria) this;
        }

        public Criteria andShippedQuantityIn(List<Integer> values) {
            addCriterion("shipped_quantity in", values, "shippedQuantity");
            return (Criteria) this;
        }

        public Criteria andShippedQuantityNotIn(List<Integer> values) {
            addCriterion("shipped_quantity not in", values, "shippedQuantity");
            return (Criteria) this;
        }

        public Criteria andShippedQuantityBetween(Integer value1, Integer value2) {
            addCriterion("shipped_quantity between", value1, value2, "shippedQuantity");
            return (Criteria) this;
        }

        public Criteria andShippedQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("shipped_quantity not between", value1, value2, "shippedQuantity");
            return (Criteria) this;
        }

        public Criteria andWarehouseQuantityIsNull() {
            addCriterion("warehouse_quantity is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseQuantityIsNotNull() {
            addCriterion("warehouse_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseQuantityEqualTo(Integer value) {
            addCriterion("warehouse_quantity =", value, "warehouseQuantity");
            return (Criteria) this;
        }

        public Criteria andWarehouseQuantityNotEqualTo(Integer value) {
            addCriterion("warehouse_quantity <>", value, "warehouseQuantity");
            return (Criteria) this;
        }

        public Criteria andWarehouseQuantityGreaterThan(Integer value) {
            addCriterion("warehouse_quantity >", value, "warehouseQuantity");
            return (Criteria) this;
        }

        public Criteria andWarehouseQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouse_quantity >=", value, "warehouseQuantity");
            return (Criteria) this;
        }

        public Criteria andWarehouseQuantityLessThan(Integer value) {
            addCriterion("warehouse_quantity <", value, "warehouseQuantity");
            return (Criteria) this;
        }

        public Criteria andWarehouseQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("warehouse_quantity <=", value, "warehouseQuantity");
            return (Criteria) this;
        }

        public Criteria andWarehouseQuantityIn(List<Integer> values) {
            addCriterion("warehouse_quantity in", values, "warehouseQuantity");
            return (Criteria) this;
        }

        public Criteria andWarehouseQuantityNotIn(List<Integer> values) {
            addCriterion("warehouse_quantity not in", values, "warehouseQuantity");
            return (Criteria) this;
        }

        public Criteria andWarehouseQuantityBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_quantity between", value1, value2, "warehouseQuantity");
            return (Criteria) this;
        }

        public Criteria andWarehouseQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_quantity not between", value1, value2, "warehouseQuantity");
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

        public Criteria andThumbnailIsNull() {
            addCriterion("thumbnail is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailIsNotNull() {
            addCriterion("thumbnail is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailEqualTo(String value) {
            addCriterion("thumbnail =", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotEqualTo(String value) {
            addCriterion("thumbnail <>", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThan(String value) {
            addCriterion("thumbnail >", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail >=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThan(String value) {
            addCriterion("thumbnail <", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLessThanOrEqualTo(String value) {
            addCriterion("thumbnail <=", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailLike(String value) {
            addCriterion("thumbnail like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotLike(String value) {
            addCriterion("thumbnail not like", value, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailIn(List<String> values) {
            addCriterion("thumbnail in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotIn(List<String> values) {
            addCriterion("thumbnail not in", values, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailBetween(String value1, String value2) {
            addCriterion("thumbnail between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andThumbnailNotBetween(String value1, String value2) {
            addCriterion("thumbnail not between", value1, value2, "thumbnail");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNull() {
            addCriterion("orders is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("orders is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Long value) {
            addCriterion("orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Long value) {
            addCriterion("orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Long value) {
            addCriterion("orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Long value) {
            addCriterion("orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Long value) {
            addCriterion("orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Long value) {
            addCriterion("orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Long> values) {
            addCriterion("orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Long> values) {
            addCriterion("orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Long value1, Long value2) {
            addCriterion("orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Long value1, Long value2) {
            addCriterion("orders not between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andProductIsNull() {
            addCriterion("product is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("product is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(Long value) {
            addCriterion("product =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(Long value) {
            addCriterion("product <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(Long value) {
            addCriterion("product >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(Long value) {
            addCriterion("product >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(Long value) {
            addCriterion("product <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(Long value) {
            addCriterion("product <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<Long> values) {
            addCriterion("product in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<Long> values) {
            addCriterion("product not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(Long value1, Long value2) {
            addCriterion("product between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(Long value1, Long value2) {
            addCriterion("product not between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Long value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Long value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Long value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Long value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Long> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Long> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Long value1, Long value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNull() {
            addCriterion("item_status is null");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNotNull() {
            addCriterion("item_status is not null");
            return (Criteria) this;
        }

        public Criteria andItemStatusEqualTo(Integer value) {
            addCriterion("item_status =", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotEqualTo(Integer value) {
            addCriterion("item_status <>", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThan(Integer value) {
            addCriterion("item_status >", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_status >=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThan(Integer value) {
            addCriterion("item_status <", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThanOrEqualTo(Integer value) {
            addCriterion("item_status <=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusIn(List<Integer> values) {
            addCriterion("item_status in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotIn(List<Integer> values) {
            addCriterion("item_status not in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusBetween(Integer value1, Integer value2) {
            addCriterion("item_status between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("item_status not between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
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

        public Criteria andApplyReturnTimeIsNull() {
            addCriterion("apply_return_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyReturnTimeIsNotNull() {
            addCriterion("apply_return_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyReturnTimeEqualTo(Date value) {
            addCriterion("apply_return_time =", value, "applyReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyReturnTimeNotEqualTo(Date value) {
            addCriterion("apply_return_time <>", value, "applyReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyReturnTimeGreaterThan(Date value) {
            addCriterion("apply_return_time >", value, "applyReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_return_time >=", value, "applyReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyReturnTimeLessThan(Date value) {
            addCriterion("apply_return_time <", value, "applyReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_return_time <=", value, "applyReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyReturnTimeIn(List<Date> values) {
            addCriterion("apply_return_time in", values, "applyReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyReturnTimeNotIn(List<Date> values) {
            addCriterion("apply_return_time not in", values, "applyReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyReturnTimeBetween(Date value1, Date value2) {
            addCriterion("apply_return_time between", value1, value2, "applyReturnTime");
            return (Criteria) this;
        }

        public Criteria andApplyReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_return_time not between", value1, value2, "applyReturnTime");
            return (Criteria) this;
        }

        public Criteria andCustomerGetTimeIsNull() {
            addCriterion("customer_get_time is null");
            return (Criteria) this;
        }

        public Criteria andCustomerGetTimeIsNotNull() {
            addCriterion("customer_get_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerGetTimeEqualTo(Date value) {
            addCriterion("customer_get_time =", value, "customerGetTime");
            return (Criteria) this;
        }

        public Criteria andCustomerGetTimeNotEqualTo(Date value) {
            addCriterion("customer_get_time <>", value, "customerGetTime");
            return (Criteria) this;
        }

        public Criteria andCustomerGetTimeGreaterThan(Date value) {
            addCriterion("customer_get_time >", value, "customerGetTime");
            return (Criteria) this;
        }

        public Criteria andCustomerGetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_get_time >=", value, "customerGetTime");
            return (Criteria) this;
        }

        public Criteria andCustomerGetTimeLessThan(Date value) {
            addCriterion("customer_get_time <", value, "customerGetTime");
            return (Criteria) this;
        }

        public Criteria andCustomerGetTimeLessThanOrEqualTo(Date value) {
            addCriterion("customer_get_time <=", value, "customerGetTime");
            return (Criteria) this;
        }

        public Criteria andCustomerGetTimeIn(List<Date> values) {
            addCriterion("customer_get_time in", values, "customerGetTime");
            return (Criteria) this;
        }

        public Criteria andCustomerGetTimeNotIn(List<Date> values) {
            addCriterion("customer_get_time not in", values, "customerGetTime");
            return (Criteria) this;
        }

        public Criteria andCustomerGetTimeBetween(Date value1, Date value2) {
            addCriterion("customer_get_time between", value1, value2, "customerGetTime");
            return (Criteria) this;
        }

        public Criteria andCustomerGetTimeNotBetween(Date value1, Date value2) {
            addCriterion("customer_get_time not between", value1, value2, "customerGetTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeIsNull() {
            addCriterion("refund_agree_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeIsNotNull() {
            addCriterion("refund_agree_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeEqualTo(Date value) {
            addCriterion("refund_agree_time =", value, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeNotEqualTo(Date value) {
            addCriterion("refund_agree_time <>", value, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeGreaterThan(Date value) {
            addCriterion("refund_agree_time >", value, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_agree_time >=", value, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeLessThan(Date value) {
            addCriterion("refund_agree_time <", value, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_agree_time <=", value, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeIn(List<Date> values) {
            addCriterion("refund_agree_time in", values, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeNotIn(List<Date> values) {
            addCriterion("refund_agree_time not in", values, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeBetween(Date value1, Date value2) {
            addCriterion("refund_agree_time between", value1, value2, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_agree_time not between", value1, value2, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeIsNull() {
            addCriterion("refund_apply_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeIsNotNull() {
            addCriterion("refund_apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeEqualTo(Date value) {
            addCriterion("refund_apply_time =", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeNotEqualTo(Date value) {
            addCriterion("refund_apply_time <>", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeGreaterThan(Date value) {
            addCriterion("refund_apply_time >", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_apply_time >=", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeLessThan(Date value) {
            addCriterion("refund_apply_time <", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_apply_time <=", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeIn(List<Date> values) {
            addCriterion("refund_apply_time in", values, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeNotIn(List<Date> values) {
            addCriterion("refund_apply_time not in", values, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeBetween(Date value1, Date value2) {
            addCriterion("refund_apply_time between", value1, value2, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_apply_time not between", value1, value2, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeIsNull() {
            addCriterion("refund_success_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeIsNotNull() {
            addCriterion("refund_success_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeEqualTo(Date value) {
            addCriterion("refund_success_time =", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeNotEqualTo(Date value) {
            addCriterion("refund_success_time <>", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeGreaterThan(Date value) {
            addCriterion("refund_success_time >", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_success_time >=", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeLessThan(Date value) {
            addCriterion("refund_success_time <", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_success_time <=", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeIn(List<Date> values) {
            addCriterion("refund_success_time in", values, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeNotIn(List<Date> values) {
            addCriterion("refund_success_time not in", values, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeBetween(Date value1, Date value2) {
            addCriterion("refund_success_time between", value1, value2, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_success_time not between", value1, value2, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andInstructionIsNull() {
            addCriterion("instruction is null");
            return (Criteria) this;
        }

        public Criteria andInstructionIsNotNull() {
            addCriterion("instruction is not null");
            return (Criteria) this;
        }

        public Criteria andInstructionEqualTo(String value) {
            addCriterion("instruction =", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotEqualTo(String value) {
            addCriterion("instruction <>", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionGreaterThan(String value) {
            addCriterion("instruction >", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionGreaterThanOrEqualTo(String value) {
            addCriterion("instruction >=", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLessThan(String value) {
            addCriterion("instruction <", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLessThanOrEqualTo(String value) {
            addCriterion("instruction <=", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLike(String value) {
            addCriterion("instruction like", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotLike(String value) {
            addCriterion("instruction not like", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionIn(List<String> values) {
            addCriterion("instruction in", values, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotIn(List<String> values) {
            addCriterion("instruction not in", values, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionBetween(String value1, String value2) {
            addCriterion("instruction between", value1, value2, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotBetween(String value1, String value2) {
            addCriterion("instruction not between", value1, value2, "instruction");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andImgurl1IsNull() {
            addCriterion("imgurl1 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl1IsNotNull() {
            addCriterion("imgurl1 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl1EqualTo(String value) {
            addCriterion("imgurl1 =", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotEqualTo(String value) {
            addCriterion("imgurl1 <>", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1GreaterThan(String value) {
            addCriterion("imgurl1 >", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1GreaterThanOrEqualTo(String value) {
            addCriterion("imgurl1 >=", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1LessThan(String value) {
            addCriterion("imgurl1 <", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1LessThanOrEqualTo(String value) {
            addCriterion("imgurl1 <=", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1Like(String value) {
            addCriterion("imgurl1 like", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotLike(String value) {
            addCriterion("imgurl1 not like", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1In(List<String> values) {
            addCriterion("imgurl1 in", values, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotIn(List<String> values) {
            addCriterion("imgurl1 not in", values, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1Between(String value1, String value2) {
            addCriterion("imgurl1 between", value1, value2, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotBetween(String value1, String value2) {
            addCriterion("imgurl1 not between", value1, value2, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl2IsNull() {
            addCriterion("imgurl2 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl2IsNotNull() {
            addCriterion("imgurl2 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl2EqualTo(String value) {
            addCriterion("imgurl2 =", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotEqualTo(String value) {
            addCriterion("imgurl2 <>", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2GreaterThan(String value) {
            addCriterion("imgurl2 >", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2GreaterThanOrEqualTo(String value) {
            addCriterion("imgurl2 >=", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2LessThan(String value) {
            addCriterion("imgurl2 <", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2LessThanOrEqualTo(String value) {
            addCriterion("imgurl2 <=", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2Like(String value) {
            addCriterion("imgurl2 like", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotLike(String value) {
            addCriterion("imgurl2 not like", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2In(List<String> values) {
            addCriterion("imgurl2 in", values, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotIn(List<String> values) {
            addCriterion("imgurl2 not in", values, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2Between(String value1, String value2) {
            addCriterion("imgurl2 between", value1, value2, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotBetween(String value1, String value2) {
            addCriterion("imgurl2 not between", value1, value2, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl3IsNull() {
            addCriterion("imgurl3 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl3IsNotNull() {
            addCriterion("imgurl3 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl3EqualTo(String value) {
            addCriterion("imgurl3 =", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotEqualTo(String value) {
            addCriterion("imgurl3 <>", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3GreaterThan(String value) {
            addCriterion("imgurl3 >", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3GreaterThanOrEqualTo(String value) {
            addCriterion("imgurl3 >=", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3LessThan(String value) {
            addCriterion("imgurl3 <", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3LessThanOrEqualTo(String value) {
            addCriterion("imgurl3 <=", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3Like(String value) {
            addCriterion("imgurl3 like", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotLike(String value) {
            addCriterion("imgurl3 not like", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3In(List<String> values) {
            addCriterion("imgurl3 in", values, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotIn(List<String> values) {
            addCriterion("imgurl3 not in", values, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3Between(String value1, String value2) {
            addCriterion("imgurl3 between", value1, value2, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotBetween(String value1, String value2) {
            addCriterion("imgurl3 not between", value1, value2, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl4IsNull() {
            addCriterion("imgurl4 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl4IsNotNull() {
            addCriterion("imgurl4 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl4EqualTo(String value) {
            addCriterion("imgurl4 =", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotEqualTo(String value) {
            addCriterion("imgurl4 <>", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4GreaterThan(String value) {
            addCriterion("imgurl4 >", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4GreaterThanOrEqualTo(String value) {
            addCriterion("imgurl4 >=", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4LessThan(String value) {
            addCriterion("imgurl4 <", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4LessThanOrEqualTo(String value) {
            addCriterion("imgurl4 <=", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4Like(String value) {
            addCriterion("imgurl4 like", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotLike(String value) {
            addCriterion("imgurl4 not like", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4In(List<String> values) {
            addCriterion("imgurl4 in", values, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotIn(List<String> values) {
            addCriterion("imgurl4 not in", values, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4Between(String value1, String value2) {
            addCriterion("imgurl4 between", value1, value2, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotBetween(String value1, String value2) {
            addCriterion("imgurl4 not between", value1, value2, "imgurl4");
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

        public Criteria andPromotionEqualTo(Long value) {
            addCriterion("promotion =", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionNotEqualTo(Long value) {
            addCriterion("promotion <>", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionGreaterThan(Long value) {
            addCriterion("promotion >", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionGreaterThanOrEqualTo(Long value) {
            addCriterion("promotion >=", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionLessThan(Long value) {
            addCriterion("promotion <", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionLessThanOrEqualTo(Long value) {
            addCriterion("promotion <=", value, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionIn(List<Long> values) {
            addCriterion("promotion in", values, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionNotIn(List<Long> values) {
            addCriterion("promotion not in", values, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionBetween(Long value1, Long value2) {
            addCriterion("promotion between", value1, value2, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionNotBetween(Long value1, Long value2) {
            addCriterion("promotion not between", value1, value2, "promotion");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceIsNull() {
            addCriterion("promotion_price is null");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceIsNotNull() {
            addCriterion("promotion_price is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceEqualTo(BigDecimal value) {
            addCriterion("promotion_price =", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotEqualTo(BigDecimal value) {
            addCriterion("promotion_price <>", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceGreaterThan(BigDecimal value) {
            addCriterion("promotion_price >", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_price >=", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceLessThan(BigDecimal value) {
            addCriterion("promotion_price <", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_price <=", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceIn(List<BigDecimal> values) {
            addCriterion("promotion_price in", values, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotIn(List<BigDecimal> values) {
            addCriterion("promotion_price not in", values, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_price between", value1, value2, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_price not between", value1, value2, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPaidIsNull() {
            addCriterion("deposit_paid is null");
            return (Criteria) this;
        }

        public Criteria andDepositPaidIsNotNull() {
            addCriterion("deposit_paid is not null");
            return (Criteria) this;
        }

        public Criteria andDepositPaidEqualTo(BigDecimal value) {
            addCriterion("deposit_paid =", value, "depositPaid");
            return (Criteria) this;
        }

        public Criteria andDepositPaidNotEqualTo(BigDecimal value) {
            addCriterion("deposit_paid <>", value, "depositPaid");
            return (Criteria) this;
        }

        public Criteria andDepositPaidGreaterThan(BigDecimal value) {
            addCriterion("deposit_paid >", value, "depositPaid");
            return (Criteria) this;
        }

        public Criteria andDepositPaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_paid >=", value, "depositPaid");
            return (Criteria) this;
        }

        public Criteria andDepositPaidLessThan(BigDecimal value) {
            addCriterion("deposit_paid <", value, "depositPaid");
            return (Criteria) this;
        }

        public Criteria andDepositPaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_paid <=", value, "depositPaid");
            return (Criteria) this;
        }

        public Criteria andDepositPaidIn(List<BigDecimal> values) {
            addCriterion("deposit_paid in", values, "depositPaid");
            return (Criteria) this;
        }

        public Criteria andDepositPaidNotIn(List<BigDecimal> values) {
            addCriterion("deposit_paid not in", values, "depositPaid");
            return (Criteria) this;
        }

        public Criteria andDepositPaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_paid between", value1, value2, "depositPaid");
            return (Criteria) this;
        }

        public Criteria andDepositPaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_paid not between", value1, value2, "depositPaid");
            return (Criteria) this;
        }

        public Criteria andBookDateIsNull() {
            addCriterion("book_date is null");
            return (Criteria) this;
        }

        public Criteria andBookDateIsNotNull() {
            addCriterion("book_date is not null");
            return (Criteria) this;
        }

        public Criteria andBookDateEqualTo(Date value) {
            addCriterion("book_date =", value, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateNotEqualTo(Date value) {
            addCriterion("book_date <>", value, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateGreaterThan(Date value) {
            addCriterion("book_date >", value, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateGreaterThanOrEqualTo(Date value) {
            addCriterion("book_date >=", value, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateLessThan(Date value) {
            addCriterion("book_date <", value, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateLessThanOrEqualTo(Date value) {
            addCriterion("book_date <=", value, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateIn(List<Date> values) {
            addCriterion("book_date in", values, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateNotIn(List<Date> values) {
            addCriterion("book_date not in", values, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateBetween(Date value1, Date value2) {
            addCriterion("book_date between", value1, value2, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateNotBetween(Date value1, Date value2) {
            addCriterion("book_date not between", value1, value2, "bookDate");
            return (Criteria) this;
        }

        public Criteria andIsFullPayIsNull() {
            addCriterion("is_full_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsFullPayIsNotNull() {
            addCriterion("is_full_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsFullPayEqualTo(Boolean value) {
            addCriterion("is_full_pay =", value, "isFullPay");
            return (Criteria) this;
        }

        public Criteria andIsFullPayNotEqualTo(Boolean value) {
            addCriterion("is_full_pay <>", value, "isFullPay");
            return (Criteria) this;
        }

        public Criteria andIsFullPayGreaterThan(Boolean value) {
            addCriterion("is_full_pay >", value, "isFullPay");
            return (Criteria) this;
        }

        public Criteria andIsFullPayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_full_pay >=", value, "isFullPay");
            return (Criteria) this;
        }

        public Criteria andIsFullPayLessThan(Boolean value) {
            addCriterion("is_full_pay <", value, "isFullPay");
            return (Criteria) this;
        }

        public Criteria andIsFullPayLessThanOrEqualTo(Boolean value) {
            addCriterion("is_full_pay <=", value, "isFullPay");
            return (Criteria) this;
        }

        public Criteria andIsFullPayIn(List<Boolean> values) {
            addCriterion("is_full_pay in", values, "isFullPay");
            return (Criteria) this;
        }

        public Criteria andIsFullPayNotIn(List<Boolean> values) {
            addCriterion("is_full_pay not in", values, "isFullPay");
            return (Criteria) this;
        }

        public Criteria andIsFullPayBetween(Boolean value1, Boolean value2) {
            addCriterion("is_full_pay between", value1, value2, "isFullPay");
            return (Criteria) this;
        }

        public Criteria andIsFullPayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_full_pay not between", value1, value2, "isFullPay");
            return (Criteria) this;
        }

        public Criteria andRefundsAmountIsNull() {
            addCriterion("refunds_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundsAmountIsNotNull() {
            addCriterion("refunds_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundsAmountEqualTo(BigDecimal value) {
            addCriterion("refunds_amount =", value, "refundsAmount");
            return (Criteria) this;
        }

        public Criteria andRefundsAmountNotEqualTo(BigDecimal value) {
            addCriterion("refunds_amount <>", value, "refundsAmount");
            return (Criteria) this;
        }

        public Criteria andRefundsAmountGreaterThan(BigDecimal value) {
            addCriterion("refunds_amount >", value, "refundsAmount");
            return (Criteria) this;
        }

        public Criteria andRefundsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refunds_amount >=", value, "refundsAmount");
            return (Criteria) this;
        }

        public Criteria andRefundsAmountLessThan(BigDecimal value) {
            addCriterion("refunds_amount <", value, "refundsAmount");
            return (Criteria) this;
        }

        public Criteria andRefundsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refunds_amount <=", value, "refundsAmount");
            return (Criteria) this;
        }

        public Criteria andRefundsAmountIn(List<BigDecimal> values) {
            addCriterion("refunds_amount in", values, "refundsAmount");
            return (Criteria) this;
        }

        public Criteria andRefundsAmountNotIn(List<BigDecimal> values) {
            addCriterion("refunds_amount not in", values, "refundsAmount");
            return (Criteria) this;
        }

        public Criteria andRefundsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refunds_amount between", value1, value2, "refundsAmount");
            return (Criteria) this;
        }

        public Criteria andRefundsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refunds_amount not between", value1, value2, "refundsAmount");
            return (Criteria) this;
        }

        public Criteria andBuyTypeIsNull() {
            addCriterion("buy_type is null");
            return (Criteria) this;
        }

        public Criteria andBuyTypeIsNotNull() {
            addCriterion("buy_type is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTypeEqualTo(Boolean value) {
            addCriterion("buy_type =", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeNotEqualTo(Boolean value) {
            addCriterion("buy_type <>", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeGreaterThan(Boolean value) {
            addCriterion("buy_type >", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("buy_type >=", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeLessThan(Boolean value) {
            addCriterion("buy_type <", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("buy_type <=", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeIn(List<Boolean> values) {
            addCriterion("buy_type in", values, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeNotIn(List<Boolean> values) {
            addCriterion("buy_type not in", values, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("buy_type between", value1, value2, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("buy_type not between", value1, value2, "buyType");
            return (Criteria) this;
        }

        public Criteria andSalePropsIsNull() {
            addCriterion("sale_props is null");
            return (Criteria) this;
        }

        public Criteria andSalePropsIsNotNull() {
            addCriterion("sale_props is not null");
            return (Criteria) this;
        }

        public Criteria andSalePropsEqualTo(String value) {
            addCriterion("sale_props =", value, "saleProps");
            return (Criteria) this;
        }

        public Criteria andSalePropsNotEqualTo(String value) {
            addCriterion("sale_props <>", value, "saleProps");
            return (Criteria) this;
        }

        public Criteria andSalePropsGreaterThan(String value) {
            addCriterion("sale_props >", value, "saleProps");
            return (Criteria) this;
        }

        public Criteria andSalePropsGreaterThanOrEqualTo(String value) {
            addCriterion("sale_props >=", value, "saleProps");
            return (Criteria) this;
        }

        public Criteria andSalePropsLessThan(String value) {
            addCriterion("sale_props <", value, "saleProps");
            return (Criteria) this;
        }

        public Criteria andSalePropsLessThanOrEqualTo(String value) {
            addCriterion("sale_props <=", value, "saleProps");
            return (Criteria) this;
        }

        public Criteria andSalePropsLike(String value) {
            addCriterion("sale_props like", value, "saleProps");
            return (Criteria) this;
        }

        public Criteria andSalePropsNotLike(String value) {
            addCriterion("sale_props not like", value, "saleProps");
            return (Criteria) this;
        }

        public Criteria andSalePropsIn(List<String> values) {
            addCriterion("sale_props in", values, "saleProps");
            return (Criteria) this;
        }

        public Criteria andSalePropsNotIn(List<String> values) {
            addCriterion("sale_props not in", values, "saleProps");
            return (Criteria) this;
        }

        public Criteria andSalePropsBetween(String value1, String value2) {
            addCriterion("sale_props between", value1, value2, "saleProps");
            return (Criteria) this;
        }

        public Criteria andSalePropsNotBetween(String value1, String value2) {
            addCriterion("sale_props not between", value1, value2, "saleProps");
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