package com.jarly.mall.model;

public class ProductWithBLOBs extends Product {
    private String introduction;

    private String newIntroduction;

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getNewIntroduction() {
        return newIntroduction;
    }

    public void setNewIntroduction(String newIntroduction) {
        this.newIntroduction = newIntroduction == null ? null : newIntroduction.trim();
    }
}