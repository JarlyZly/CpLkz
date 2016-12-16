package com.jarly.mall.model;

import java.util.Date;

public class SpecificationValue {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private Integer orders;

    private String name;

    private Long specification;

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

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getSpecification() {
        return specification;
    }

    public void setSpecification(Long specification) {
        this.specification = specification;
    }
}