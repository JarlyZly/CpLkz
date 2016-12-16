package com.jarly.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String image;

    private String memo;

    private String name;

    private String unit;

    private Long brand;

    private Long productCategory;

    private Float score;

    private BigDecimal marketPrice;

    private String code;

    private String productAttribute;

    private Integer objectSize;

    private Byte isMarketable;

    private String subhead;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Long getBrand() {
        return brand;
    }

    public void setBrand(Long brand) {
        this.brand = brand;
    }

    public Long getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Long productCategory) {
        this.productCategory = productCategory;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute == null ? null : productAttribute.trim();
    }

    public Integer getObjectSize() {
        return objectSize;
    }

    public void setObjectSize(Integer objectSize) {
        this.objectSize = objectSize;
    }

    public Byte getIsMarketable() {
        return isMarketable;
    }

    public void setIsMarketable(Byte isMarketable) {
        this.isMarketable = isMarketable;
    }

    public String getSubhead() {
        return subhead;
    }

    public void setSubhead(String subhead) {
        this.subhead = subhead == null ? null : subhead.trim();
    }
}