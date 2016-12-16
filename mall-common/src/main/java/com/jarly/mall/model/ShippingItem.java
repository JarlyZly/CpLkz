package com.jarly.mall.model;

import java.util.Date;

public class ShippingItem {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String name;

    private Integer quantity;

    private String sn;

    private Long shipping;

    private Long orderItem;

    private String trackingNo;

    private Long logicompany;

    private String logiinfo;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public Long getShipping() {
        return shipping;
    }

    public void setShipping(Long shipping) {
        this.shipping = shipping;
    }

    public Long getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(Long orderItem) {
        this.orderItem = orderItem;
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo == null ? null : trackingNo.trim();
    }

    public Long getLogicompany() {
        return logicompany;
    }

    public void setLogicompany(Long logicompany) {
        this.logicompany = logicompany;
    }

    public String getLogiinfo() {
        return logiinfo;
    }

    public void setLogiinfo(String logiinfo) {
        this.logiinfo = logiinfo == null ? null : logiinfo.trim();
    }
}