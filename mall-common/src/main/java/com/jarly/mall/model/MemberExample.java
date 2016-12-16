package com.jarly.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Boolean value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Boolean value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Boolean value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Boolean value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Boolean value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Boolean> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Boolean> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Boolean value1, Boolean value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gender not between", value1, value2, "gender");
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

        public Criteria andBirthIsNull() {
            addCriterion("birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterionForJDBCDate("birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterionForJDBCDate("birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterionForJDBCDate("birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNull() {
            addCriterion("card_number is null");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNotNull() {
            addCriterion("card_number is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumberEqualTo(String value) {
            addCriterion("card_number =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotEqualTo(String value) {
            addCriterion("card_number <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThan(String value) {
            addCriterion("card_number >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("card_number >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThan(String value) {
            addCriterion("card_number <", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThanOrEqualTo(String value) {
            addCriterion("card_number <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLike(String value) {
            addCriterion("card_number like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotLike(String value) {
            addCriterion("card_number not like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIn(List<String> values) {
            addCriterion("card_number in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotIn(List<String> values) {
            addCriterion("card_number not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberBetween(String value1, String value2) {
            addCriterion("card_number between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotBetween(String value1, String value2) {
            addCriterion("card_number not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andBearStatusIsNull() {
            addCriterion("bear_status is null");
            return (Criteria) this;
        }

        public Criteria andBearStatusIsNotNull() {
            addCriterion("bear_status is not null");
            return (Criteria) this;
        }

        public Criteria andBearStatusEqualTo(Boolean value) {
            addCriterion("bear_status =", value, "bearStatus");
            return (Criteria) this;
        }

        public Criteria andBearStatusNotEqualTo(Boolean value) {
            addCriterion("bear_status <>", value, "bearStatus");
            return (Criteria) this;
        }

        public Criteria andBearStatusGreaterThan(Boolean value) {
            addCriterion("bear_status >", value, "bearStatus");
            return (Criteria) this;
        }

        public Criteria andBearStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bear_status >=", value, "bearStatus");
            return (Criteria) this;
        }

        public Criteria andBearStatusLessThan(Boolean value) {
            addCriterion("bear_status <", value, "bearStatus");
            return (Criteria) this;
        }

        public Criteria andBearStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("bear_status <=", value, "bearStatus");
            return (Criteria) this;
        }

        public Criteria andBearStatusIn(List<Boolean> values) {
            addCriterion("bear_status in", values, "bearStatus");
            return (Criteria) this;
        }

        public Criteria andBearStatusNotIn(List<Boolean> values) {
            addCriterion("bear_status not in", values, "bearStatus");
            return (Criteria) this;
        }

        public Criteria andBearStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("bear_status between", value1, value2, "bearStatus");
            return (Criteria) this;
        }

        public Criteria andBearStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bear_status not between", value1, value2, "bearStatus");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
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

        public Criteria andMemberRankIsNull() {
            addCriterion("member_rank is null");
            return (Criteria) this;
        }

        public Criteria andMemberRankIsNotNull() {
            addCriterion("member_rank is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRankEqualTo(Boolean value) {
            addCriterion("member_rank =", value, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankNotEqualTo(Boolean value) {
            addCriterion("member_rank <>", value, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankGreaterThan(Boolean value) {
            addCriterion("member_rank >", value, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankGreaterThanOrEqualTo(Boolean value) {
            addCriterion("member_rank >=", value, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankLessThan(Boolean value) {
            addCriterion("member_rank <", value, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankLessThanOrEqualTo(Boolean value) {
            addCriterion("member_rank <=", value, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankIn(List<Boolean> values) {
            addCriterion("member_rank in", values, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankNotIn(List<Boolean> values) {
            addCriterion("member_rank not in", values, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankBetween(Boolean value1, Boolean value2) {
            addCriterion("member_rank between", value1, value2, "memberRank");
            return (Criteria) this;
        }

        public Criteria andMemberRankNotBetween(Boolean value1, Boolean value2) {
            addCriterion("member_rank not between", value1, value2, "memberRank");
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

        public Criteria andExpectedDateIsNull() {
            addCriterion("expected_date is null");
            return (Criteria) this;
        }

        public Criteria andExpectedDateIsNotNull() {
            addCriterion("expected_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedDateEqualTo(Date value) {
            addCriterionForJDBCDate("expected_date =", value, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("expected_date <>", value, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("expected_date >", value, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expected_date >=", value, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateLessThan(Date value) {
            addCriterionForJDBCDate("expected_date <", value, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expected_date <=", value, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateIn(List<Date> values) {
            addCriterionForJDBCDate("expected_date in", values, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("expected_date not in", values, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expected_date between", value1, value2, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expected_date not between", value1, value2, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andIsMemberIsNull() {
            addCriterion("is_member is null");
            return (Criteria) this;
        }

        public Criteria andIsMemberIsNotNull() {
            addCriterion("is_member is not null");
            return (Criteria) this;
        }

        public Criteria andIsMemberEqualTo(Boolean value) {
            addCriterion("is_member =", value, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberNotEqualTo(Boolean value) {
            addCriterion("is_member <>", value, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberGreaterThan(Boolean value) {
            addCriterion("is_member >", value, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_member >=", value, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberLessThan(Boolean value) {
            addCriterion("is_member <", value, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberLessThanOrEqualTo(Boolean value) {
            addCriterion("is_member <=", value, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberIn(List<Boolean> values) {
            addCriterion("is_member in", values, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberNotIn(List<Boolean> values) {
            addCriterion("is_member not in", values, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberBetween(Boolean value1, Boolean value2) {
            addCriterion("is_member between", value1, value2, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_member not between", value1, value2, "isMember");
            return (Criteria) this;
        }

        public Criteria andPointTotalIsNull() {
            addCriterion("point_total is null");
            return (Criteria) this;
        }

        public Criteria andPointTotalIsNotNull() {
            addCriterion("point_total is not null");
            return (Criteria) this;
        }

        public Criteria andPointTotalEqualTo(Long value) {
            addCriterion("point_total =", value, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalNotEqualTo(Long value) {
            addCriterion("point_total <>", value, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalGreaterThan(Long value) {
            addCriterion("point_total >", value, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("point_total >=", value, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalLessThan(Long value) {
            addCriterion("point_total <", value, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalLessThanOrEqualTo(Long value) {
            addCriterion("point_total <=", value, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalIn(List<Long> values) {
            addCriterion("point_total in", values, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalNotIn(List<Long> values) {
            addCriterion("point_total not in", values, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalBetween(Long value1, Long value2) {
            addCriterion("point_total between", value1, value2, "pointTotal");
            return (Criteria) this;
        }

        public Criteria andPointTotalNotBetween(Long value1, Long value2) {
            addCriterion("point_total not between", value1, value2, "pointTotal");
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

        public Criteria andDelStateIsNull() {
            addCriterion("del_state is null");
            return (Criteria) this;
        }

        public Criteria andDelStateIsNotNull() {
            addCriterion("del_state is not null");
            return (Criteria) this;
        }

        public Criteria andDelStateEqualTo(Byte value) {
            addCriterion("del_state =", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateNotEqualTo(Byte value) {
            addCriterion("del_state <>", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateGreaterThan(Byte value) {
            addCriterion("del_state >", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("del_state >=", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateLessThan(Byte value) {
            addCriterion("del_state <", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateLessThanOrEqualTo(Byte value) {
            addCriterion("del_state <=", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateIn(List<Byte> values) {
            addCriterion("del_state in", values, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateNotIn(List<Byte> values) {
            addCriterion("del_state not in", values, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateBetween(Byte value1, Byte value2) {
            addCriterion("del_state between", value1, value2, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateNotBetween(Byte value1, Byte value2) {
            addCriterion("del_state not between", value1, value2, "delState");
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

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andIsActivateIsNull() {
            addCriterion("is_activate is null");
            return (Criteria) this;
        }

        public Criteria andIsActivateIsNotNull() {
            addCriterion("is_activate is not null");
            return (Criteria) this;
        }

        public Criteria andIsActivateEqualTo(Boolean value) {
            addCriterion("is_activate =", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateNotEqualTo(Boolean value) {
            addCriterion("is_activate <>", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateGreaterThan(Boolean value) {
            addCriterion("is_activate >", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_activate >=", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateLessThan(Boolean value) {
            addCriterion("is_activate <", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateLessThanOrEqualTo(Boolean value) {
            addCriterion("is_activate <=", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateIn(List<Boolean> values) {
            addCriterion("is_activate in", values, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateNotIn(List<Boolean> values) {
            addCriterion("is_activate not in", values, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateBetween(Boolean value1, Boolean value2) {
            addCriterion("is_activate between", value1, value2, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_activate not between", value1, value2, "isActivate");
            return (Criteria) this;
        }

        public Criteria andSafekeyEmailIsNull() {
            addCriterion("safeKey_email is null");
            return (Criteria) this;
        }

        public Criteria andSafekeyEmailIsNotNull() {
            addCriterion("safeKey_email is not null");
            return (Criteria) this;
        }

        public Criteria andSafekeyEmailEqualTo(String value) {
            addCriterion("safeKey_email =", value, "safekeyEmail");
            return (Criteria) this;
        }

        public Criteria andSafekeyEmailNotEqualTo(String value) {
            addCriterion("safeKey_email <>", value, "safekeyEmail");
            return (Criteria) this;
        }

        public Criteria andSafekeyEmailGreaterThan(String value) {
            addCriterion("safeKey_email >", value, "safekeyEmail");
            return (Criteria) this;
        }

        public Criteria andSafekeyEmailGreaterThanOrEqualTo(String value) {
            addCriterion("safeKey_email >=", value, "safekeyEmail");
            return (Criteria) this;
        }

        public Criteria andSafekeyEmailLessThan(String value) {
            addCriterion("safeKey_email <", value, "safekeyEmail");
            return (Criteria) this;
        }

        public Criteria andSafekeyEmailLessThanOrEqualTo(String value) {
            addCriterion("safeKey_email <=", value, "safekeyEmail");
            return (Criteria) this;
        }

        public Criteria andSafekeyEmailLike(String value) {
            addCriterion("safeKey_email like", value, "safekeyEmail");
            return (Criteria) this;
        }

        public Criteria andSafekeyEmailNotLike(String value) {
            addCriterion("safeKey_email not like", value, "safekeyEmail");
            return (Criteria) this;
        }

        public Criteria andSafekeyEmailIn(List<String> values) {
            addCriterion("safeKey_email in", values, "safekeyEmail");
            return (Criteria) this;
        }

        public Criteria andSafekeyEmailNotIn(List<String> values) {
            addCriterion("safeKey_email not in", values, "safekeyEmail");
            return (Criteria) this;
        }

        public Criteria andSafekeyEmailBetween(String value1, String value2) {
            addCriterion("safeKey_email between", value1, value2, "safekeyEmail");
            return (Criteria) this;
        }

        public Criteria andSafekeyEmailNotBetween(String value1, String value2) {
            addCriterion("safeKey_email not between", value1, value2, "safekeyEmail");
            return (Criteria) this;
        }

        public Criteria andSafekeyMobileIsNull() {
            addCriterion("safeKey_mobile is null");
            return (Criteria) this;
        }

        public Criteria andSafekeyMobileIsNotNull() {
            addCriterion("safeKey_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andSafekeyMobileEqualTo(String value) {
            addCriterion("safeKey_mobile =", value, "safekeyMobile");
            return (Criteria) this;
        }

        public Criteria andSafekeyMobileNotEqualTo(String value) {
            addCriterion("safeKey_mobile <>", value, "safekeyMobile");
            return (Criteria) this;
        }

        public Criteria andSafekeyMobileGreaterThan(String value) {
            addCriterion("safeKey_mobile >", value, "safekeyMobile");
            return (Criteria) this;
        }

        public Criteria andSafekeyMobileGreaterThanOrEqualTo(String value) {
            addCriterion("safeKey_mobile >=", value, "safekeyMobile");
            return (Criteria) this;
        }

        public Criteria andSafekeyMobileLessThan(String value) {
            addCriterion("safeKey_mobile <", value, "safekeyMobile");
            return (Criteria) this;
        }

        public Criteria andSafekeyMobileLessThanOrEqualTo(String value) {
            addCriterion("safeKey_mobile <=", value, "safekeyMobile");
            return (Criteria) this;
        }

        public Criteria andSafekeyMobileLike(String value) {
            addCriterion("safeKey_mobile like", value, "safekeyMobile");
            return (Criteria) this;
        }

        public Criteria andSafekeyMobileNotLike(String value) {
            addCriterion("safeKey_mobile not like", value, "safekeyMobile");
            return (Criteria) this;
        }

        public Criteria andSafekeyMobileIn(List<String> values) {
            addCriterion("safeKey_mobile in", values, "safekeyMobile");
            return (Criteria) this;
        }

        public Criteria andSafekeyMobileNotIn(List<String> values) {
            addCriterion("safeKey_mobile not in", values, "safekeyMobile");
            return (Criteria) this;
        }

        public Criteria andSafekeyMobileBetween(String value1, String value2) {
            addCriterion("safeKey_mobile between", value1, value2, "safekeyMobile");
            return (Criteria) this;
        }

        public Criteria andSafekeyMobileNotBetween(String value1, String value2) {
            addCriterion("safeKey_mobile not between", value1, value2, "safekeyMobile");
            return (Criteria) this;
        }

        public Criteria andExpireMobileIsNull() {
            addCriterion("expire_mobile is null");
            return (Criteria) this;
        }

        public Criteria andExpireMobileIsNotNull() {
            addCriterion("expire_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andExpireMobileEqualTo(Date value) {
            addCriterion("expire_mobile =", value, "expireMobile");
            return (Criteria) this;
        }

        public Criteria andExpireMobileNotEqualTo(Date value) {
            addCriterion("expire_mobile <>", value, "expireMobile");
            return (Criteria) this;
        }

        public Criteria andExpireMobileGreaterThan(Date value) {
            addCriterion("expire_mobile >", value, "expireMobile");
            return (Criteria) this;
        }

        public Criteria andExpireMobileGreaterThanOrEqualTo(Date value) {
            addCriterion("expire_mobile >=", value, "expireMobile");
            return (Criteria) this;
        }

        public Criteria andExpireMobileLessThan(Date value) {
            addCriterion("expire_mobile <", value, "expireMobile");
            return (Criteria) this;
        }

        public Criteria andExpireMobileLessThanOrEqualTo(Date value) {
            addCriterion("expire_mobile <=", value, "expireMobile");
            return (Criteria) this;
        }

        public Criteria andExpireMobileIn(List<Date> values) {
            addCriterion("expire_mobile in", values, "expireMobile");
            return (Criteria) this;
        }

        public Criteria andExpireMobileNotIn(List<Date> values) {
            addCriterion("expire_mobile not in", values, "expireMobile");
            return (Criteria) this;
        }

        public Criteria andExpireMobileBetween(Date value1, Date value2) {
            addCriterion("expire_mobile between", value1, value2, "expireMobile");
            return (Criteria) this;
        }

        public Criteria andExpireMobileNotBetween(Date value1, Date value2) {
            addCriterion("expire_mobile not between", value1, value2, "expireMobile");
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