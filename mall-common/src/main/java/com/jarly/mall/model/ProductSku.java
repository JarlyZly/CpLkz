package com.jarly.mall.model;

import java.math.BigDecimal;
import java.util.Date;

public class ProductSku {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    private Long productId;

    private String saleProps;

    private String vids;

    private String image;

    private Integer stock;

    private String stockMemo;

    private Integer stockwarning;

    private String sku;

    private Integer allocatedStock;

    private Integer sales;

    private BigDecimal price;

    private BigDecimal unitPrice;

    private BigDecimal depositPrice;

    private BigDecimal deposit;

    private BigDecimal earnest;

    private Boolean isList;

    private Boolean isRecommend;

    private Byte isMarketable;

    private Boolean isNew;

    private Boolean isOld;

    private Boolean isSell;

    private Boolean isLease;

    private Boolean isBook;

    private BigDecimal weight;

    private String fullName;

    private String sn;

    private String originid;

    private String rentPrice;

    private BigDecimal vipPrice;

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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getSaleProps() {
        return saleProps;
    }

    public void setSaleProps(String saleProps) {
        this.saleProps = saleProps == null ? null : saleProps.trim();
    }

    public String getVids() {
        return vids;
    }

    public void setVids(String vids) {
        this.vids = vids == null ? null : vids.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getStockMemo() {
        return stockMemo;
    }

    public void setStockMemo(String stockMemo) {
        this.stockMemo = stockMemo == null ? null : stockMemo.trim();
    }

    public Integer getStockwarning() {
        return stockwarning;
    }

    public void setStockwarning(Integer stockwarning) {
        this.stockwarning = stockwarning;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public Integer getAllocatedStock() {
        return allocatedStock;
    }

    public void setAllocatedStock(Integer allocatedStock) {
        this.allocatedStock = allocatedStock;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getDepositPrice() {
        return depositPrice;
    }

    public void setDepositPrice(BigDecimal depositPrice) {
        this.depositPrice = depositPrice;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public BigDecimal getEarnest() {
        return earnest;
    }

    public void setEarnest(BigDecimal earnest) {
        this.earnest = earnest;
    }

    public Boolean getIsList() {
        return isList;
    }

    public void setIsList(Boolean isList) {
        this.isList = isList;
    }

    public Boolean getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Boolean isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Byte getIsMarketable() {
        return isMarketable;
    }

    public void setIsMarketable(Byte isMarketable) {
        this.isMarketable = isMarketable;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Boolean getIsOld() {
        return isOld;
    }

    public void setIsOld(Boolean isOld) {
        this.isOld = isOld;
    }

    public Boolean getIsSell() {
        return isSell;
    }

    public void setIsSell(Boolean isSell) {
        this.isSell = isSell;
    }

    public Boolean getIsLease() {
        return isLease;
    }

    public void setIsLease(Boolean isLease) {
        this.isLease = isLease;
    }

    public Boolean getIsBook() {
        return isBook;
    }

    public void setIsBook(Boolean isBook) {
        this.isBook = isBook;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getOriginid() {
        return originid;
    }

    public void setOriginid(String originid) {
        this.originid = originid == null ? null : originid.trim();
    }

    public String getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(String rentPrice) {
        this.rentPrice = rentPrice == null ? null : rentPrice.trim();
    }

    public BigDecimal getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(BigDecimal vipPrice) {
        this.vipPrice = vipPrice;
    }
}