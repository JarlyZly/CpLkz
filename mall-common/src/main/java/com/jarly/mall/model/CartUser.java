package com.jarly.mall.model;

import java.util.Date;

public class CartUser {
    private Long id;

    private Long uid;

    private Long itemId;

    private Long skuId;

    private Integer num;

    private String itemName;

    private String thumbnail;

    private Integer categoryId;

    private Byte delState;

    private Date createTime;

    private Date updateTime;

    private Boolean buyType;

    private String saleProps;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Byte getDelState() {
        return delState;
    }

    public void setDelState(Byte delState) {
        this.delState = delState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getBuyType() {
        return buyType;
    }

    public void setBuyType(Boolean buyType) {
        this.buyType = buyType;
    }

    public String getSaleProps() {
        return saleProps;
    }

    public void setSaleProps(String saleProps) {
        this.saleProps = saleProps == null ? null : saleProps.trim();
    }
}