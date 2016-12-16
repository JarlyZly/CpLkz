package com.jarly.mall.model;

import java.util.Date;

public class QuickRegister {
    private Long id;

    private Long staffId;

    private Byte gestationTime;

    private Date createDate;

    private Long memberId;

    private Byte gestationType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Byte getGestationTime() {
        return gestationTime;
    }

    public void setGestationTime(Byte gestationTime) {
        this.gestationTime = gestationTime;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Byte getGestationType() {
        return gestationType;
    }

    public void setGestationType(Byte gestationType) {
        this.gestationType = gestationType;
    }
}