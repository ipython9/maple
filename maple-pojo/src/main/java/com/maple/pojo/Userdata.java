package com.maple.pojo;

import java.io.Serializable;

public class Userdata implements Serializable {
    private Integer id;
//接受任务的用户id
    private String userid;
//任务的编号
    private Integer dataid;
//接受任务数量
    private Integer num;
//开始的索引
    private Integer startnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getDataid() {
        return dataid;
    }

    public void setDataid(Integer dataid) {
        this.dataid = dataid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getStartnum() {
        return startnum;
    }

    public void setStartnum(Integer startnum) {
        this.startnum = startnum;
    }
}