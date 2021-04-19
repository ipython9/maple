package com.maple.pojo;

import java.io.Serializable;
import java.util.Date;

public class Job implements Serializable {
    private Integer id;

    private String compid;

    private String userid;

    private String name;

    private String postionid;

    private Integer skill;

    private Integer province;

    private String city;

    private String jobreq;

    private String nature;

    private String level;

    private String exp;

    private String content;

    private String startpd;

    private String endpd;

    private Integer status;

    private Date creatine;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompid() {
        return compid;
    }

    public void setCompid(String compid) {
        this.compid = compid == null ? null : compid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPostionid() {
        return postionid;
    }

    public void setPostionid(String postionid) {
        this.postionid = postionid == null ? null : postionid.trim();
    }

    public Integer getSkill() {
        return skill;
    }

    public void setSkill(Integer skill) {
        this.skill = skill;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getJobreq() {
        return jobreq;
    }

    public void setJobreq(String jobreq) {
        this.jobreq = jobreq == null ? null : jobreq.trim();
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature == null ? null : nature.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp == null ? null : exp.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getStartpd() {
        return startpd;
    }

    public void setStartpd(String startpd) {
        this.startpd = startpd == null ? null : startpd.trim();
    }

    public String getEndpd() {
        return endpd;
    }

    public void setEndpd(String endpd) {
        this.endpd = endpd == null ? null : endpd.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatine() {
        return creatine;
    }

    public void setCreatine(Date creatine) {
        this.creatine = creatine;
    }
}