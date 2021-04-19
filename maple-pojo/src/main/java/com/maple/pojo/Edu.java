package com.maple.pojo;

import java.io.Serializable;
import java.util.Date;

public class Edu  implements Serializable {
    private Integer id;

    private String userid;

    private String eduname;

    private String edulevel;

    private String edupro;

    private Date startdate;

    private Date enddate;

    private String content;

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

    public String getEduname() {
        return eduname;
    }

    public void setEduname(String eduname) {
        this.eduname = eduname == null ? null : eduname.trim();
    }

    public String getEdulevel() {
        return edulevel;
    }

    public void setEdulevel(String edulevel) {
        this.edulevel = edulevel == null ? null : edulevel.trim();
    }

    public String getEdupro() {
        return edupro;
    }

    public void setEdupro(String edupro) {
        this.edupro = edupro == null ? null : edupro.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}