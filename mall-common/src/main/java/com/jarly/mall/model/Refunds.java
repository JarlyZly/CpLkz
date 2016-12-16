package com.jarly.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class Refunds {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String account;

    private BigDecimal amount;

    private String memo;

    private String operator;

    private Long orders;

    private Long items;

    private Long refund;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getItems() {
        return items;
    }

    public void setItems(Long items) {
        this.items = items;
    }

    public Long getRefund() {
        return refund;
    }

    public void setRefund(Long refund) {
        this.refund = refund;
    }
}