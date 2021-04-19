package com.maple.pojo;

import java.io.Serializable;

public class Resume implements Serializable {
    private Integer id;

    private String userid;

    private String peradv;

    private String startpd;

    private String endpd;

    private String industryid;

    private String socialurl;

    private Integer provinceid;

    private String cityid;

    private String postionid;

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

    public String getPeradv() {
        return peradv;
    }

    public void setPeradv(String peradv) {
        this.peradv = peradv == null ? null : peradv.trim();
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

    public String getIndustryid() {
        return industryid;
    }

    public void setIndustryid(String industryid) {
        this.industryid = industryid == null ? null : industryid.trim();
    }

    public String getSocialurl() {
        return socialurl;
    }

    public void setSocialurl(String socialurl) {
        this.socialurl = socialurl == null ? null : socialurl.trim();
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    public String getPostionid() {
        return postionid;
    }

    public void setPostionid(String postionid) {
        this.postionid = postionid == null ? null : postionid.trim();
    }
}