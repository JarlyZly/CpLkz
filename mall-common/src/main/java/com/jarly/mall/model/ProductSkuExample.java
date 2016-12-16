package com.jarly.mall.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductSkuExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
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

        public Criteria andVidsIsNull() {
            addCriterion("vids is null");
            return (Criteria) this;
        }

        public Criteria andVidsIsNotNull() {
            addCriterion("vids is not null");
            return (Criteria) this;
        }

        public Criteria andVidsEqualTo(String value) {
            addCriterion("vids =", value, "vids");
            return (Criteria) this;
        }

        public Criteria andVidsNotEqualTo(String value) {
            addCriterion("vids <>", value, "vids");
            return (Criteria) this;
        }

        public Criteria andVidsGreaterThan(String value) {
            addCriterion("vids >", value, "vids");
            return (Criteria) this;
        }

        public Criteria andVidsGreaterThanOrEqualTo(String value) {
            addCriterion("vids >=", value, "vids");
            return (Criteria) this;
        }

        public Criteria andVidsLessThan(String value) {
            addCriterion("vids <", value, "vids");
            return (Criteria) this;
        }

        public Criteria andVidsLessThanOrEqualTo(String value) {
            addCriterion("vids <=", value, "vids");
            return (Criteria) this;
        }

        public Criteria andVidsLike(String value) {
            addCriterion("vids like", value, "vids");
            return (Criteria) this;
        }

        public Criteria andVidsNotLike(String value) {
            addCriterion("vids not like", value, "vids");
            return (Criteria) this;
        }

        public Criteria andVidsIn(List<String> values) {
            addCriterion("vids in", values, "vids");
            return (Criteria) this;
        }

        public Criteria andVidsNotIn(List<String> values) {
            addCriterion("vids not in", values, "vids");
            return (Criteria) this;
        }

        public Criteria andVidsBetween(String value1, String value2) {
            addCriterion("vids between", value1, value2, "vids");
            return (Criteria) this;
        }

        public Criteria andVidsNotBetween(String value1, String value2) {
            addCriterion("vids not between", value1, value2, "vids");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockMemoIsNull() {
            addCriterion("stock_memo is null");
            return (Criteria) this;
        }

        public Criteria andStockMemoIsNotNull() {
            addCriterion("stock_memo is not null");
            return (Criteria) this;
        }

        public Criteria andStockMemoEqualTo(String value) {
            addCriterion("stock_memo =", value, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoNotEqualTo(String value) {
            addCriterion("stock_memo <>", value, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoGreaterThan(String value) {
            addCriterion("stock_memo >", value, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoGreaterThanOrEqualTo(String value) {
            addCriterion("stock_memo >=", value, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoLessThan(String value) {
            addCriterion("stock_memo <", value, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoLessThanOrEqualTo(String value) {
            addCriterion("stock_memo <=", value, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoLike(String value) {
            addCriterion("stock_memo like", value, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoNotLike(String value) {
            addCriterion("stock_memo not like", value, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoIn(List<String> values) {
            addCriterion("stock_memo in", values, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoNotIn(List<String> values) {
            addCriterion("stock_memo not in", values, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoBetween(String value1, String value2) {
            addCriterion("stock_memo between", value1, value2, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockMemoNotBetween(String value1, String value2) {
            addCriterion("stock_memo not between", value1, value2, "stockMemo");
            return (Criteria) this;
        }

        public Criteria andStockwarningIsNull() {
            addCriterion("stockWarning is null");
            return (Criteria) this;
        }

        public Criteria andStockwarningIsNotNull() {
            addCriterion("stockWarning is not null");
            return (Criteria) this;
        }

        public Criteria andStockwarningEqualTo(Integer value) {
            addCriterion("stockWarning =", value, "stockwarning");
            return (Criteria) this;
        }

        public Criteria andStockwarningNotEqualTo(Integer value) {
            addCriterion("stockWarning <>", value, "stockwarning");
            return (Criteria) this;
        }

        public Criteria andStockwarningGreaterThan(Integer value) {
            addCriterion("stockWarning >", value, "stockwarning");
            return (Criteria) this;
        }

        public Criteria andStockwarningGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockWarning >=", value, "stockwarning");
            return (Criteria) this;
        }

        public Criteria andStockwarningLessThan(Integer value) {
            addCriterion("stockWarning <", value, "stockwarning");
            return (Criteria) this;
        }

        public Criteria andStockwarningLessThanOrEqualTo(Integer value) {
            addCriterion("stockWarning <=", value, "stockwarning");
            return (Criteria) this;
        }

        public Criteria andStockwarningIn(List<Integer> values) {
            addCriterion("stockWarning in", values, "stockwarning");
            return (Criteria) this;
        }

        public Criteria andStockwarningNotIn(List<Integer> values) {
            addCriterion("stockWarning not in", values, "stockwarning");
            return (Criteria) this;
        }

        public Criteria andStockwarningBetween(Integer value1, Integer value2) {
            addCriterion("stockWarning between", value1, value2, "stockwarning");
            return (Criteria) this;
        }

        public Criteria andStockwarningNotBetween(Integer value1, Integer value2) {
            addCriterion("stockWarning not between", value1, value2, "stockwarning");
            return (Criteria) this;
        }

        public Criteria andSkuIsNull() {
            addCriterion("sku is null");
            return (Criteria) this;
        }

        public Criteria andSkuIsNotNull() {
            addCriterion("sku is not null");
            return (Criteria) this;
        }

        public Criteria andSkuEqualTo(String value) {
            addCriterion("sku =", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotEqualTo(String value) {
            addCriterion("sku <>", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThan(String value) {
            addCriterion("sku >", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThanOrEqualTo(String value) {
            addCriterion("sku >=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThan(String value) {
            addCriterion("sku <", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThanOrEqualTo(String value) {
            addCriterion("sku <=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLike(String value) {
            addCriterion("sku like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotLike(String value) {
            addCriterion("sku not like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuIn(List<String> values) {
            addCriterion("sku in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotIn(List<String> values) {
            addCriterion("sku not in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuBetween(String value1, String value2) {
            addCriterion("sku between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotBetween(String value1, String value2) {
            addCriterion("sku not between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockIsNull() {
            addCriterion("allocated_stock is null");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockIsNotNull() {
            addCriterion("allocated_stock is not null");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockEqualTo(Integer value) {
            addCriterion("allocated_stock =", value, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockNotEqualTo(Integer value) {
            addCriterion("allocated_stock <>", value, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockGreaterThan(Integer value) {
            addCriterion("allocated_stock >", value, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("allocated_stock >=", value, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockLessThan(Integer value) {
            addCriterion("allocated_stock <", value, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockLessThanOrEqualTo(Integer value) {
            addCriterion("allocated_stock <=", value, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockIn(List<Integer> values) {
            addCriterion("allocated_stock in", values, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockNotIn(List<Integer> values) {
            addCriterion("allocated_stock not in", values, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockBetween(Integer value1, Integer value2) {
            addCriterion("allocated_stock between", value1, value2, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andAllocatedStockNotBetween(Integer value1, Integer value2) {
            addCriterion("allocated_stock not between", value1, value2, "allocatedStock");
            return (Criteria) this;
        }

        public Criteria andSalesIsNull() {
            addCriterion("sales is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("sales is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Integer value) {
            addCriterion("sales =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Integer value) {
            addCriterion("sales <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Integer value) {
            addCriterion("sales >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Integer value) {
            addCriterion("sales <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Integer value) {
            addCriterion("sales <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Integer> values) {
            addCriterion("sales in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Integer> values) {
            addCriterion("sales not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Integer value1, Integer value2) {
            addCriterion("sales between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("sales not between", value1, value2, "sales");
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

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(BigDecimal value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(BigDecimal value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<BigDecimal> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceIsNull() {
            addCriterion("deposit_price is null");
            return (Criteria) this;
        }

        public Criteria andDepositPriceIsNotNull() {
            addCriterion("deposit_price is not null");
            return (Criteria) this;
        }

        public Criteria andDepositPriceEqualTo(BigDecimal value) {
            addCriterion("deposit_price =", value, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceNotEqualTo(BigDecimal value) {
            addCriterion("deposit_price <>", value, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceGreaterThan(BigDecimal value) {
            addCriterion("deposit_price >", value, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_price >=", value, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceLessThan(BigDecimal value) {
            addCriterion("deposit_price <", value, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_price <=", value, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceIn(List<BigDecimal> values) {
            addCriterion("deposit_price in", values, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceNotIn(List<BigDecimal> values) {
            addCriterion("deposit_price not in", values, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_price between", value1, value2, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_price not between", value1, value2, "depositPrice");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(BigDecimal value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(BigDecimal value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(BigDecimal value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(BigDecimal value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<BigDecimal> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<BigDecimal> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andEarnestIsNull() {
            addCriterion("earnest is null");
            return (Criteria) this;
        }

        public Criteria andEarnestIsNotNull() {
            addCriterion("earnest is not null");
            return (Criteria) this;
        }

        public Criteria andEarnestEqualTo(BigDecimal value) {
            addCriterion("earnest =", value, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestNotEqualTo(BigDecimal value) {
            addCriterion("earnest <>", value, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestGreaterThan(BigDecimal value) {
            addCriterion("earnest >", value, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("earnest >=", value, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestLessThan(BigDecimal value) {
            addCriterion("earnest <", value, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("earnest <=", value, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestIn(List<BigDecimal> values) {
            addCriterion("earnest in", values, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestNotIn(List<BigDecimal> values) {
            addCriterion("earnest not in", values, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("earnest between", value1, value2, "earnest");
            return (Criteria) this;
        }

        public Criteria andEarnestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("earnest not between", value1, value2, "earnest");
            return (Criteria) this;
        }

        public Criteria andIsListIsNull() {
            addCriterion("is_list is null");
            return (Criteria) this;
        }

        public Criteria andIsListIsNotNull() {
            addCriterion("is_list is not null");
            return (Criteria) this;
        }

        public Criteria andIsListEqualTo(Boolean value) {
            addCriterion("is_list =", value, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListNotEqualTo(Boolean value) {
            addCriterion("is_list <>", value, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListGreaterThan(Boolean value) {
            addCriterion("is_list >", value, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_list >=", value, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListLessThan(Boolean value) {
            addCriterion("is_list <", value, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListLessThanOrEqualTo(Boolean value) {
            addCriterion("is_list <=", value, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListIn(List<Boolean> values) {
            addCriterion("is_list in", values, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListNotIn(List<Boolean> values) {
            addCriterion("is_list not in", values, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListBetween(Boolean value1, Boolean value2) {
            addCriterion("is_list between", value1, value2, "isList");
            return (Criteria) this;
        }

        public Criteria andIsListNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_list not between", value1, value2, "isList");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNull() {
            addCriterion("is_recommend is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNotNull() {
            addCriterion("is_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendEqualTo(Boolean value) {
            addCriterion("is_recommend =", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotEqualTo(Boolean value) {
            addCriterion("is_recommend <>", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThan(Boolean value) {
            addCriterion("is_recommend >", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_recommend >=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThan(Boolean value) {
            addCriterion("is_recommend <", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThanOrEqualTo(Boolean value) {
            addCriterion("is_recommend <=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIn(List<Boolean> values) {
            addCriterion("is_recommend in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotIn(List<Boolean> values) {
            addCriterion("is_recommend not in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendBetween(Boolean value1, Boolean value2) {
            addCriterion("is_recommend between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_recommend not between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsMarketableIsNull() {
            addCriterion("is_marketable is null");
            return (Criteria) this;
        }

        public Criteria andIsMarketableIsNotNull() {
            addCriterion("is_marketable is not null");
            return (Criteria) this;
        }

        public Criteria andIsMarketableEqualTo(Byte value) {
            addCriterion("is_marketable =", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableNotEqualTo(Byte value) {
            addCriterion("is_marketable <>", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableGreaterThan(Byte value) {
            addCriterion("is_marketable >", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_marketable >=", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableLessThan(Byte value) {
            addCriterion("is_marketable <", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableLessThanOrEqualTo(Byte value) {
            addCriterion("is_marketable <=", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableIn(List<Byte> values) {
            addCriterion("is_marketable in", values, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableNotIn(List<Byte> values) {
            addCriterion("is_marketable not in", values, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableBetween(Byte value1, Byte value2) {
            addCriterion("is_marketable between", value1, value2, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableNotBetween(Byte value1, Byte value2) {
            addCriterion("is_marketable not between", value1, value2, "isMarketable");
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

        public Criteria andIsOldIsNull() {
            addCriterion("is_old is null");
            return (Criteria) this;
        }

        public Criteria andIsOldIsNotNull() {
            addCriterion("is_old is not null");
            return (Criteria) this;
        }

        public Criteria andIsOldEqualTo(Boolean value) {
            addCriterion("is_old =", value, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldNotEqualTo(Boolean value) {
            addCriterion("is_old <>", value, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldGreaterThan(Boolean value) {
            addCriterion("is_old >", value, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_old >=", value, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldLessThan(Boolean value) {
            addCriterion("is_old <", value, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldLessThanOrEqualTo(Boolean value) {
            addCriterion("is_old <=", value, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldIn(List<Boolean> values) {
            addCriterion("is_old in", values, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldNotIn(List<Boolean> values) {
            addCriterion("is_old not in", values, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldBetween(Boolean value1, Boolean value2) {
            addCriterion("is_old between", value1, value2, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsOldNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_old not between", value1, value2, "isOld");
            return (Criteria) this;
        }

        public Criteria andIsSellIsNull() {
            addCriterion("is_sell is null");
            return (Criteria) this;
        }

        public Criteria andIsSellIsNotNull() {
            addCriterion("is_sell is not null");
            return (Criteria) this;
        }

        public Criteria andIsSellEqualTo(Boolean value) {
            addCriterion("is_sell =", value, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellNotEqualTo(Boolean value) {
            addCriterion("is_sell <>", value, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellGreaterThan(Boolean value) {
            addCriterion("is_sell >", value, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_sell >=", value, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellLessThan(Boolean value) {
            addCriterion("is_sell <", value, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellLessThanOrEqualTo(Boolean value) {
            addCriterion("is_sell <=", value, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellIn(List<Boolean> values) {
            addCriterion("is_sell in", values, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellNotIn(List<Boolean> values) {
            addCriterion("is_sell not in", values, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellBetween(Boolean value1, Boolean value2) {
            addCriterion("is_sell between", value1, value2, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsSellNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_sell not between", value1, value2, "isSell");
            return (Criteria) this;
        }

        public Criteria andIsLeaseIsNull() {
            addCriterion("is_lease is null");
            return (Criteria) this;
        }

        public Criteria andIsLeaseIsNotNull() {
            addCriterion("is_lease is not null");
            return (Criteria) this;
        }

        public Criteria andIsLeaseEqualTo(Boolean value) {
            addCriterion("is_lease =", value, "isLease");
            return (Criteria) this;
        }

        public Criteria andIsLeaseNotEqualTo(Boolean value) {
            addCriterion("is_lease <>", value, "isLease");
            return (Criteria) this;
        }

        public Criteria andIsLeaseGreaterThan(Boolean value) {
            addCriterion("is_lease >", value, "isLease");
            return (Criteria) this;
        }

        public Criteria andIsLeaseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_lease >=", value, "isLease");
            return (Criteria) this;
        }

        public Criteria andIsLeaseLessThan(Boolean value) {
            addCriterion("is_lease <", value, "isLease");
            return (Criteria) this;
        }

        public Criteria andIsLeaseLessThanOrEqualTo(Boolean value) {
            addCriterion("is_lease <=", value, "isLease");
            return (Criteria) this;
        }

        public Criteria andIsLeaseIn(List<Boolean> values) {
            addCriterion("is_lease in", values, "isLease");
            return (Criteria) this;
        }

        public Criteria andIsLeaseNotIn(List<Boolean> values) {
            addCriterion("is_lease not in", values, "isLease");
            return (Criteria) this;
        }

        public Criteria andIsLeaseBetween(Boolean value1, Boolean value2) {
            addCriterion("is_lease between", value1, value2, "isLease");
            return (Criteria) this;
        }

        public Criteria andIsLeaseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_lease not between", value1, value2, "isLease");
            return (Criteria) this;
        }

        public Criteria andIsBookIsNull() {
            addCriterion("is_book is null");
            return (Criteria) this;
        }

        public Criteria andIsBookIsNotNull() {
            addCriterion("is_book is not null");
            return (Criteria) this;
        }

        public Criteria andIsBookEqualTo(Boolean value) {
            addCriterion("is_book =", value, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookNotEqualTo(Boolean value) {
            addCriterion("is_book <>", value, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookGreaterThan(Boolean value) {
            addCriterion("is_book >", value, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_book >=", value, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookLessThan(Boolean value) {
            addCriterion("is_book <", value, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookLessThanOrEqualTo(Boolean value) {
            addCriterion("is_book <=", value, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookIn(List<Boolean> values) {
            addCriterion("is_book in", values, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookNotIn(List<Boolean> values) {
            addCriterion("is_book not in", values, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookBetween(Boolean value1, Boolean value2) {
            addCriterion("is_book between", value1, value2, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_book not between", value1, value2, "isBook");
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

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
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

        public Criteria andOriginidIsNull() {
            addCriterion("originId is null");
            return (Criteria) this;
        }

        public Criteria andOriginidIsNotNull() {
            addCriterion("originId is not null");
            return (Criteria) this;
        }

        public Criteria andOriginidEqualTo(String value) {
            addCriterion("originId =", value, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidNotEqualTo(String value) {
            addCriterion("originId <>", value, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidGreaterThan(String value) {
            addCriterion("originId >", value, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidGreaterThanOrEqualTo(String value) {
            addCriterion("originId >=", value, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidLessThan(String value) {
            addCriterion("originId <", value, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidLessThanOrEqualTo(String value) {
            addCriterion("originId <=", value, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidLike(String value) {
            addCriterion("originId like", value, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidNotLike(String value) {
            addCriterion("originId not like", value, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidIn(List<String> values) {
            addCriterion("originId in", values, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidNotIn(List<String> values) {
            addCriterion("originId not in", values, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidBetween(String value1, String value2) {
            addCriterion("originId between", value1, value2, "originid");
            return (Criteria) this;
        }

        public Criteria andOriginidNotBetween(String value1, String value2) {
            addCriterion("originId not between", value1, value2, "originid");
            return (Criteria) this;
        }

        public Criteria andRentPriceIsNull() {
            addCriterion("rent_price is null");
            return (Criteria) this;
        }

        public Criteria andRentPriceIsNotNull() {
            addCriterion("rent_price is not null");
            return (Criteria) this;
        }

        public Criteria andRentPriceEqualTo(String value) {
            addCriterion("rent_price =", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceNotEqualTo(String value) {
            addCriterion("rent_price <>", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceGreaterThan(String value) {
            addCriterion("rent_price >", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceGreaterThanOrEqualTo(String value) {
            addCriterion("rent_price >=", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceLessThan(String value) {
            addCriterion("rent_price <", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceLessThanOrEqualTo(String value) {
            addCriterion("rent_price <=", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceLike(String value) {
            addCriterion("rent_price like", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceNotLike(String value) {
            addCriterion("rent_price not like", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceIn(List<String> values) {
            addCriterion("rent_price in", values, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceNotIn(List<String> values) {
            addCriterion("rent_price not in", values, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceBetween(String value1, String value2) {
            addCriterion("rent_price between", value1, value2, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceNotBetween(String value1, String value2) {
            addCriterion("rent_price not between", value1, value2, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceIsNull() {
            addCriterion("vip_price is null");
            return (Criteria) this;
        }

        public Criteria andVipPriceIsNotNull() {
            addCriterion("vip_price is not null");
            return (Criteria) this;
        }

        public Criteria andVipPriceEqualTo(BigDecimal value) {
            addCriterion("vip_price =", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceNotEqualTo(BigDecimal value) {
            addCriterion("vip_price <>", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceGreaterThan(BigDecimal value) {
            addCriterion("vip_price >", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vip_price >=", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceLessThan(BigDecimal value) {
            addCriterion("vip_price <", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vip_price <=", value, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceIn(List<BigDecimal> values) {
            addCriterion("vip_price in", values, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceNotIn(List<BigDecimal> values) {
            addCriterion("vip_price not in", values, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vip_price between", value1, value2, "vipPrice");
            return (Criteria) this;
        }

        public Criteria andVipPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vip_price not between", value1, value2, "vipPrice");
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