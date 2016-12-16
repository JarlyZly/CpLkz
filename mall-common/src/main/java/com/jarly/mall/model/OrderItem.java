package com.jarly.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderItem {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private String fullName;

    private String name;

    private BigDecimal price;

    private BigDecimal netpay;

    private Integer tenancy;

    private Boolean isNew;

    private BigDecimal prePaid;

    private BigDecimal tailPaid;

    private BigDecimal leasePaid;

    private Integer quantity;

    private Integer returnQuantity;

    private Integer shippedQuantity;

    private Integer warehouseQuantity;

    private String sn;

    private String thumbnail;

    private Integer weight;

    private Long orders;

    private Long product;

    private Long skuId;

    private Integer itemStatus;

    private Date sendTime;

    private Date startTime;

    private Date endTime;

    private Date applyReturnTime;

    private Date customerGetTime;

    private Date refundAgreeTime;

    private Date refundApplyTime;

    private Date refundSuccessTime;

    private String reason;

    private String instruction;

    private String path;

    private String imgurl1;

    private String imgurl2;

    private String imgurl3;

    private String imgurl4;

    private Long promotion;

    private BigDecimal promotionPrice;

    private BigDecimal depositPaid;

    private Date bookDate;

    private Boolean isFullPay;

    private BigDecimal refundsAmount;

    private Boolean buyType;

    private String saleProps;

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getNetpay() {
        return netpay;
    }

    public void setNetpay(BigDecimal netpay) {
        this.netpay = netpay;
    }

    public Integer getTenancy() {
        return tenancy;
    }

    public void setTenancy(Integer tenancy) {
        this.tenancy = tenancy;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public BigDecimal getPrePaid() {
        return prePaid;
    }

    public void setPrePaid(BigDecimal prePaid) {
        this.prePaid = prePaid;
    }

    public BigDecimal getTailPaid() {
        return tailPaid;
    }

    public void setTailPaid(BigDecimal tailPaid) {
        this.tailPaid = tailPaid;
    }

    public BigDecimal getLeasePaid() {
        return leasePaid;
    }

    public void setLeasePaid(BigDecimal leasePaid) {
        this.leasePaid = leasePaid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getReturnQuantity() {
        return returnQuantity;
    }

    public void setReturnQuantity(Integer returnQuantity) {
        this.returnQuantity = returnQuantity;
    }

    public Integer getShippedQuantity() {
        return shippedQuantity;
    }

    public void setShippedQuantity(Integer shippedQuantity) {
        this.shippedQuantity = shippedQuantity;
    }

    public Integer getWarehouseQuantity() {
        return warehouseQuantity;
    }

    public void setWarehouseQuantity(Integer warehouseQuantity) {
        this.warehouseQuantity = warehouseQuantity;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getApplyReturnTime() {
        return applyReturnTime;
    }

    public void setApplyReturnTime(Date applyReturnTime) {
        this.applyReturnTime = applyReturnTime;
    }

    public Date getCustomerGetTime() {
        return customerGetTime;
    }

    public void setCustomerGetTime(Date customerGetTime) {
        this.customerGetTime = customerGetTime;
    }

    public Date getRefundAgreeTime() {
        return refundAgreeTime;
    }

    public void setRefundAgreeTime(Date refundAgreeTime) {
        this.refundAgreeTime = refundAgreeTime;
    }

    public Date getRefundApplyTime() {
        return refundApplyTime;
    }

    public void setRefundApplyTime(Date refundApplyTime) {
        this.refundApplyTime = refundApplyTime;
    }

    public Date getRefundSuccessTime() {
        return refundSuccessTime;
    }

    public void setRefundSuccessTime(Date refundSuccessTime) {
        this.refundSuccessTime = refundSuccessTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction == null ? null : instruction.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getImgurl1() {
        return imgurl1;
    }

    public void setImgurl1(String imgurl1) {
        this.imgurl1 = imgurl1 == null ? null : imgurl1.trim();
    }

    public String getImgurl2() {
        return imgurl2;
    }

    public void setImgurl2(String imgurl2) {
        this.imgurl2 = imgurl2 == null ? null : imgurl2.trim();
    }

    public String getImgurl3() {
        return imgurl3;
    }

    public void setImgurl3(String imgurl3) {
        this.imgurl3 = imgurl3 == null ? null : imgurl3.trim();
    }

    public String getImgurl4() {
        return imgurl4;
    }

    public void setImgurl4(String imgurl4) {
        this.imgurl4 = imgurl4 == null ? null : imgurl4.trim();
    }

    public Long getPromotion() {
        return promotion;
    }

    public void setPromotion(Long promotion) {
        this.promotion = promotion;
    }

    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public BigDecimal getDepositPaid() {
        return depositPaid;
    }

    public void setDepositPaid(BigDecimal depositPaid) {
        this.depositPaid = depositPaid;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    public Boolean getIsFullPay() {
        return isFullPay;
    }

    public void setIsFullPay(Boolean isFullPay) {
        this.isFullPay = isFullPay;
    }

    public BigDecimal getRefundsAmount() {
        return refundsAmount;
    }

    public void setRefundsAmount(BigDecimal refundsAmount) {
        this.refundsAmount = refundsAmount;
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

    public Long getRefund() {
        return refund;
    }

    public void setRefund(Long refund) {
        this.refund = refund;
    }
}