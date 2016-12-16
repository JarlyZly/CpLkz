package com.jarly.mall.model;

import java.util.Date;

public class Member {
    private Long id;

    private String username;

    private String password;

    private String nickName;

    private Boolean gender;

    private String name;

    private Date birth;

    private String cardNumber;

    private Boolean bearStatus;

    private String email;

    private String mobile;

    private String address;

    private Boolean memberRank;

    private Long point;

    private String path;

    private Date expectedDate;

    private Boolean isMember;

    private Long pointTotal;

    private Date createDate;

    private Date modifyDate;

    private Byte delState;

    private Integer area;

    private Boolean isActivate;

    private String safekeyEmail;

    private String safekeyMobile;

    private Date expireMobile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public Boolean getBearStatus() {
        return bearStatus;
    }

    public void setBearStatus(Boolean bearStatus) {
        this.bearStatus = bearStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Boolean getMemberRank() {
        return memberRank;
    }

    public void setMemberRank(Boolean memberRank) {
        this.memberRank = memberRank;
    }

    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Date getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(Date expectedDate) {
        this.expectedDate = expectedDate;
    }

    public Boolean getIsMember() {
        return isMember;
    }

    public void setIsMember(Boolean isMember) {
        this.isMember = isMember;
    }

    public Long getPointTotal() {
        return pointTotal;
    }

    public void setPointTotal(Long pointTotal) {
        this.pointTotal = pointTotal;
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

    public Byte getDelState() {
        return delState;
    }

    public void setDelState(Byte delState) {
        this.delState = delState;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Boolean getIsActivate() {
        return isActivate;
    }

    public void setIsActivate(Boolean isActivate) {
        this.isActivate = isActivate;
    }

    public String getSafekeyEmail() {
        return safekeyEmail;
    }

    public void setSafekeyEmail(String safekeyEmail) {
        this.safekeyEmail = safekeyEmail == null ? null : safekeyEmail.trim();
    }

    public String getSafekeyMobile() {
        return safekeyMobile;
    }

    public void setSafekeyMobile(String safekeyMobile) {
        this.safekeyMobile = safekeyMobile == null ? null : safekeyMobile.trim();
    }

    public Date getExpireMobile() {
        return expireMobile;
    }

    public void setExpireMobile(Date expireMobile) {
        this.expireMobile = expireMobile;
    }
}