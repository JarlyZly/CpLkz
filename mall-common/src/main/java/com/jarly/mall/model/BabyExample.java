package com.jarly.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BabyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BabyExample() {
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

        public Criteria andBabyNameIsNull() {
            addCriterion("baby_name is null");
            return (Criteria) this;
        }

        public Criteria andBabyNameIsNotNull() {
            addCriterion("baby_name is not null");
            return (Criteria) this;
        }

        public Criteria andBabyNameEqualTo(String value) {
            addCriterion("baby_name =", value, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameNotEqualTo(String value) {
            addCriterion("baby_name <>", value, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameGreaterThan(String value) {
            addCriterion("baby_name >", value, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameGreaterThanOrEqualTo(String value) {
            addCriterion("baby_name >=", value, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameLessThan(String value) {
            addCriterion("baby_name <", value, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameLessThanOrEqualTo(String value) {
            addCriterion("baby_name <=", value, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameLike(String value) {
            addCriterion("baby_name like", value, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameNotLike(String value) {
            addCriterion("baby_name not like", value, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameIn(List<String> values) {
            addCriterion("baby_name in", values, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameNotIn(List<String> values) {
            addCriterion("baby_name not in", values, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameBetween(String value1, String value2) {
            addCriterion("baby_name between", value1, value2, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyNameNotBetween(String value1, String value2) {
            addCriterion("baby_name not between", value1, value2, "babyName");
            return (Criteria) this;
        }

        public Criteria andBabyGenderIsNull() {
            addCriterion("baby_gender is null");
            return (Criteria) this;
        }

        public Criteria andBabyGenderIsNotNull() {
            addCriterion("baby_gender is not null");
            return (Criteria) this;
        }

        public Criteria andBabyGenderEqualTo(Boolean value) {
            addCriterion("baby_gender =", value, "babyGender");
            return (Criteria) this;
        }

        public Criteria andBabyGenderNotEqualTo(Boolean value) {
            addCriterion("baby_gender <>", value, "babyGender");
            return (Criteria) this;
        }

        public Criteria andBabyGenderGreaterThan(Boolean value) {
            addCriterion("baby_gender >", value, "babyGender");
            return (Criteria) this;
        }

        public Criteria andBabyGenderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("baby_gender >=", value, "babyGender");
            return (Criteria) this;
        }

        public Criteria andBabyGenderLessThan(Boolean value) {
            addCriterion("baby_gender <", value, "babyGender");
            return (Criteria) this;
        }

        public Criteria andBabyGenderLessThanOrEqualTo(Boolean value) {
            addCriterion("baby_gender <=", value, "babyGender");
            return (Criteria) this;
        }

        public Criteria andBabyGenderIn(List<Boolean> values) {
            addCriterion("baby_gender in", values, "babyGender");
            return (Criteria) this;
        }

        public Criteria andBabyGenderNotIn(List<Boolean> values) {
            addCriterion("baby_gender not in", values, "babyGender");
            return (Criteria) this;
        }

        public Criteria andBabyGenderBetween(Boolean value1, Boolean value2) {
            addCriterion("baby_gender between", value1, value2, "babyGender");
            return (Criteria) this;
        }

        public Criteria andBabyGenderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("baby_gender not between", value1, value2, "babyGender");
            return (Criteria) this;
        }

        public Criteria andBabyBirthIsNull() {
            addCriterion("baby_birth is null");
            return (Criteria) this;
        }

        public Criteria andBabyBirthIsNotNull() {
            addCriterion("baby_birth is not null");
            return (Criteria) this;
        }

        public Criteria andBabyBirthEqualTo(Date value) {
            addCriterion("baby_birth =", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthNotEqualTo(Date value) {
            addCriterion("baby_birth <>", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthGreaterThan(Date value) {
            addCriterion("baby_birth >", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("baby_birth >=", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthLessThan(Date value) {
            addCriterion("baby_birth <", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthLessThanOrEqualTo(Date value) {
            addCriterion("baby_birth <=", value, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthIn(List<Date> values) {
            addCriterion("baby_birth in", values, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthNotIn(List<Date> values) {
            addCriterion("baby_birth not in", values, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthBetween(Date value1, Date value2) {
            addCriterion("baby_birth between", value1, value2, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andBabyBirthNotBetween(Date value1, Date value2) {
            addCriterion("baby_birth not between", value1, value2, "babyBirth");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
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