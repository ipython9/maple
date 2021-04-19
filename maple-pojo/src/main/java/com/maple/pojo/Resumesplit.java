package com.maple.pojo;

import java.io.Serializable;

public class Resumesplit implements Serializable {
    private Integer id;

    private String resumeid;

    private Integer status;

    private Integer dataid;

    private Integer recomend;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResumeid() {
        return resumeid;
    }

    public void setResumeid(String resumeid) {
        this.resumeid = resumeid == null ? null : resumeid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDataid() {
        return dataid;
    }

    public void setDataid(Integer dataid) {
        this.dataid = dataid;
    }

    public Integer getRecomend() {
        return recomend;
    }

    public void setRecomend(Integer recomend) {
        this.recomend = recomend;
    }
}