package com.maple.pojo;

import java.io.Serializable;

public class Content implements Serializable {
    private Long id;

    private String url;

    private Integer grade;

    private Integer status;

    private byte[] picpath;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public byte[] getPicpath() {
        return picpath;
    }

    public void setPicpath(byte[] picpath) {
        this.picpath = picpath;
    }
}