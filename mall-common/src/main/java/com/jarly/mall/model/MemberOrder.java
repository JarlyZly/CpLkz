package com.jarly.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class MemberOrder {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String address;

    private BigDecimal amountPaid;

    private String areaName;

    private String consignee;

    private BigDecimal couponDiscount;

    private Date expire;

    private BigDecimal fee;

    private BigDecimal freight;

    private String invoiceTitle;

    private Boolean isAllocatedStock;

    private Boolean isInvoice;

    private Date lockExpire;

    private String memo;

    private BigDecimal offsetAmount;

    private Byte orderType;

    private Integer orderStatus;

    private String paymentMethodName;

    private Integer paymentStatus;

    private String phone;

    private Long point;

    private String promotion;

    private BigDecimal promotionDiscount;

    private String shippingMethodName;

    private Integer shippingStatus;

    private String deliveryCorpName;

    private String sn;

    private String zipCode;

    private Long area;

    private Long couponCode;

    private Long member;

    private Long operator;

    private Long paymentMethod;

    private Date payDate;

    private Long shippingMethod;

    private Long experienceCenter;

    private Boolean isArayacak;

    private String experienceCenterName;

    private BigDecimal installPrice;

    private Boolean isInstall;

    private Long reductionContent;

    private Date sendDate;

    private BigDecimal reductionPrice;

    private Date receiveDate;

    private String tradeNo;

    private Long deliveryCenter;

    private String deliveryCenterName;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public BigDecimal getCouponDiscount() {
        return couponDiscount;
    }

    public void setCouponDiscount(BigDecimal couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    public Boolean getIsAllocatedStock() {
        return isAllocatedStock;
    }

    public void setIsAllocatedStock(Boolean isAllocatedStock) {
        this.isAllocatedStock = isAllocatedStock;
    }

    public Boolean getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Boolean isInvoice) {
        this.isInvoice = isInvoice;
    }

    public Date getLockExpire() {
        return lockExpire;
    }

    public void setLockExpire(Date lockExpire) {
        this.lockExpire = lockExpire;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public BigDecimal getOffsetAmount() {
        return offsetAmount;
    }

    public void setOffsetAmount(BigDecimal offsetAmount) {
        this.offsetAmount = offsetAmount;
    }

    public Byte getOrderType() {
        return orderType;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    public void setPaymentMethodName(String paymentMethodName) {
        this.paymentMethodName = paymentMethodName == null ? null : paymentMethodName.trim();
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion == null ? null : promotion.trim();
    }

    public BigDecimal getPromotionDiscount() {
        return promotionDiscount;
    }

    public void setPromotionDiscount(BigDecimal promotionDiscount) {
        this.promotionDiscount = promotionDiscount;
    }

    public String getShippingMethodName() {
        return shippingMethodName;
    }

    public void setShippingMethodName(String shippingMethodName) {
        this.shippingMethodName = shippingMethodName == null ? null : shippingMethodName.trim();
    }

    public Integer getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(Integer shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public String getDeliveryCorpName() {
        return deliveryCorpName;
    }

    public void setDeliveryCorpName(String deliveryCorpName) {
        this.deliveryCorpName = deliveryCorpName == null ? null : deliveryCorpName.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    public Long getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(Long couponCode) {
        this.couponCode = couponCode;
    }

    public Long getMember() {
        return member;
    }

    public void setMember(Long member) {
        this.member = member;
    }

    public Long getOperator() {
        return operator;
    }

    public void setOperator(Long operator) {
        this.operator = operator;
    }

    public Long getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Long paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Long getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(Long shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Long getExperienceCenter() {
        return experienceCenter;
    }

    public void setExperienceCenter(Long experienceCenter) {
        this.experienceCenter = experienceCenter;
    }

    public Boolean getIsArayacak() {
        return isArayacak;
    }

    public void setIsArayacak(Boolean isArayacak) {
        this.isArayacak = isArayacak;
    }

    public String getExperienceCenterName() {
        return experienceCenterName;
    }

    public void setExperienceCenterName(String experienceCenterName) {
        this.experienceCenterName = experienceCenterName == null ? null : experienceCenterName.trim();
    }

    public BigDecimal getInstallPrice() {
        return installPrice;
    }

    public void setInstallPrice(BigDecimal installPrice) {
        this.installPrice = installPrice;
    }

    public Boolean getIsInstall() {
        return isInstall;
    }

    public void setIsInstall(Boolean isInstall) {
        this.isInstall = isInstall;
    }

    public Long getReductionContent() {
        return reductionContent;
    }

    public void setReductionContent(Long reductionContent) {
        this.reductionContent = reductionContent;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public BigDecimal getReductionPrice() {
        return reductionPrice;
    }

    public void setReductionPrice(BigDecimal reductionPrice) {
        this.reductionPrice = reductionPrice;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public Long getDeliveryCenter() {
        return deliveryCenter;
    }

    public void setDeliveryCenter(Long deliveryCenter) {
        this.deliveryCenter = deliveryCenter;
    }

    public String getDeliveryCenterName() {
        return deliveryCenterName;
    }

    public void setDeliveryCenterName(String deliveryCenterName) {
        this.deliveryCenterName = deliveryCenterName == null ? null : deliveryCenterName.trim();
    }

    public Long getRefund() {
        return refund;
    }

    public void setRefund(Long refund) {
        this.refund = refund;
    }
}