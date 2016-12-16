package com.jarly.mall.model;

public class AttributeOption {
    private Integer id;

    private Long attribute;

    private String options;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getAttribute() {
        return attribute;
    }

    public void setAttribute(Long attribute) {
        this.attribute = attribute;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options == null ? null : options.trim();
    }
}