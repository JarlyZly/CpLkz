package com.jarly.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class FreightTemplate {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private BigDecimal doorFee;

    private BigDecimal logisticsUnitPrice;

    private BigDecimal charge;

    private BigDecimal renew;

    private Long area;

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

    public BigDecimal getDoorFee() {
        return doorFee;
    }

    public void setDoorFee(BigDecimal doorFee) {
        this.doorFee = doorFee;
    }

    public BigDecimal getLogisticsUnitPrice() {
        return logisticsUnitPrice;
    }

    public void setLogisticsUnitPrice(BigDecimal logisticsUnitPrice) {
        this.logisticsUnitPrice = logisticsUnitPrice;
    }

    public BigDecimal getCharge() {
        return charge;
    }

    public void setCharge(BigDecimal charge) {
        this.charge = charge;
    }

    public BigDecimal getRenew() {
        return renew;
    }

    public void setRenew(BigDecimal renew) {
        this.renew = renew;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }
}