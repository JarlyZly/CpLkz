package com.jarly.mall.model;

import java.util.Date;

public class AdminResource {
    private Integer id;

    private String resourceName;

    private Integer sort;

    private String rootPath;

    private String showPath;

    private Boolean status;

    private Date createTime;

    private Date updateTime;

    private Boolean property;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRootPath() {
        return rootPath;
    }

    public void setRootPath(String rootPath) {
        this.rootPath = rootPath == null ? null : rootPath.trim();
    }

    public String getShowPath() {
        return showPath;
    }

    public void setShowPath(String showPath) {
        this.showPath = showPath == null ? null : showPath.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getProperty() {
        return property;
    }

    public void setProperty(Boolean property) {
        this.property = property;
    }
}