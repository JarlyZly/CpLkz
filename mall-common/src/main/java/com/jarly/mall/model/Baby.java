package com.jarly.mall.model;

import java.util.Date;

public class Baby {
    private Long id;

    private String babyName;

    private Boolean babyGender;

    private Date babyBirth;

    private Long memberId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBabyName() {
        return babyName;
    }

    public void setBabyName(String babyName) {
        this.babyName = babyName == null ? null : babyName.trim();
    }

    public Boolean getBabyGender() {
        return babyGender;
    }

    public void setBabyGender(Boolean babyGender) {
        this.babyGender = babyGender;
    }

    public Date getBabyBirth() {
        return babyBirth;
    }

    public void setBabyBirth(Date babyBirth) {
        this.babyBirth = babyBirth;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
}