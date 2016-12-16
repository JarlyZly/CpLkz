package com.jarly.mall.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FreightTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FreightTemplateExample() {
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

        public Criteria andDoorFeeIsNull() {
            addCriterion("door_fee is null");
            return (Criteria) this;
        }

        public Criteria andDoorFeeIsNotNull() {
            addCriterion("door_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDoorFeeEqualTo(BigDecimal value) {
            addCriterion("door_fee =", value, "doorFee");
            return (Criteria) this;
        }

        public Criteria andDoorFeeNotEqualTo(BigDecimal value) {
            addCriterion("door_fee <>", value, "doorFee");
            return (Criteria) this;
        }

        public Criteria andDoorFeeGreaterThan(BigDecimal value) {
            addCriterion("door_fee >", value, "doorFee");
            return (Criteria) this;
        }

        public Criteria andDoorFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("door_fee >=", value, "doorFee");
            return (Criteria) this;
        }

        public Criteria andDoorFeeLessThan(BigDecimal value) {
            addCriterion("door_fee <", value, "doorFee");
            return (Criteria) this;
        }

        public Criteria andDoorFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("door_fee <=", value, "doorFee");
            return (Criteria) this;
        }

        public Criteria andDoorFeeIn(List<BigDecimal> values) {
            addCriterion("door_fee in", values, "doorFee");
            return (Criteria) this;
        }

        public Criteria andDoorFeeNotIn(List<BigDecimal> values) {
            addCriterion("door_fee not in", values, "doorFee");
            return (Criteria) this;
        }

        public Criteria andDoorFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("door_fee between", value1, value2, "doorFee");
            return (Criteria) this;
        }

        public Criteria andDoorFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("door_fee not between", value1, value2, "doorFee");
            return (Criteria) this;
        }

        public Criteria andLogisticsUnitPriceIsNull() {
            addCriterion("logistics_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsUnitPriceIsNotNull() {
            addCriterion("logistics_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsUnitPriceEqualTo(BigDecimal value) {
            addCriterion("logistics_unit_price =", value, "logisticsUnitPrice");
            return (Criteria) this;
        }

        public Criteria andLogisticsUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("logistics_unit_price <>", value, "logisticsUnitPrice");
            return (Criteria) this;
        }

        public Criteria andLogisticsUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("logistics_unit_price >", value, "logisticsUnitPrice");
            return (Criteria) this;
        }

        public Criteria andLogisticsUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("logistics_unit_price >=", value, "logisticsUnitPrice");
            return (Criteria) this;
        }

        public Criteria andLogisticsUnitPriceLessThan(BigDecimal value) {
            addCriterion("logistics_unit_price <", value, "logisticsUnitPrice");
            return (Criteria) this;
        }

        public Criteria andLogisticsUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("logistics_unit_price <=", value, "logisticsUnitPrice");
            return (Criteria) this;
        }

        public Criteria andLogisticsUnitPriceIn(List<BigDecimal> values) {
            addCriterion("logistics_unit_price in", values, "logisticsUnitPrice");
            return (Criteria) this;
        }

        public Criteria andLogisticsUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("logistics_unit_price not in", values, "logisticsUnitPrice");
            return (Criteria) this;
        }

        public Criteria andLogisticsUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("logistics_unit_price between", value1, value2, "logisticsUnitPrice");
            return (Criteria) this;
        }

        public Criteria andLogisticsUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("logistics_unit_price not between", value1, value2, "logisticsUnitPrice");
            return (Criteria) this;
        }

        public Criteria andChargeIsNull() {
            addCriterion("charge is null");
            return (Criteria) this;
        }

        public Criteria andChargeIsNotNull() {
            addCriterion("charge is not null");
            return (Criteria) this;
        }

        public Criteria andChargeEqualTo(BigDecimal value) {
            addCriterion("charge =", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotEqualTo(BigDecimal value) {
            addCriterion("charge <>", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThan(BigDecimal value) {
            addCriterion("charge >", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("charge >=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThan(BigDecimal value) {
            addCriterion("charge <", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("charge <=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeIn(List<BigDecimal> values) {
            addCriterion("charge in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotIn(List<BigDecimal> values) {
            addCriterion("charge not in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charge between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charge not between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andRenewIsNull() {
            addCriterion("renew is null");
            return (Criteria) this;
        }

        public Criteria andRenewIsNotNull() {
            addCriterion("renew is not null");
            return (Criteria) this;
        }

        public Criteria andRenewEqualTo(BigDecimal value) {
            addCriterion("renew =", value, "renew");
            return (Criteria) this;
        }

        public Criteria andRenewNotEqualTo(BigDecimal value) {
            addCriterion("renew <>", value, "renew");
            return (Criteria) this;
        }

        public Criteria andRenewGreaterThan(BigDecimal value) {
            addCriterion("renew >", value, "renew");
            return (Criteria) this;
        }

        public Criteria andRenewGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("renew >=", value, "renew");
            return (Criteria) this;
        }

        public Criteria andRenewLessThan(BigDecimal value) {
            addCriterion("renew <", value, "renew");
            return (Criteria) this;
        }

        public Criteria andRenewLessThanOrEqualTo(BigDecimal value) {
            addCriterion("renew <=", value, "renew");
            return (Criteria) this;
        }

        public Criteria andRenewIn(List<BigDecimal> values) {
            addCriterion("renew in", values, "renew");
            return (Criteria) this;
        }

        public Criteria andRenewNotIn(List<BigDecimal> values) {
            addCriterion("renew not in", values, "renew");
            return (Criteria) this;
        }

        public Criteria andRenewBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("renew between", value1, value2, "renew");
            return (Criteria) this;
        }

        public Criteria andRenewNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("renew not between", value1, value2, "renew");
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