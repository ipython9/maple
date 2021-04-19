package com.maple.pojo;

import java.io.Serializable;
import java.util.Date;

public class Pratice implements Serializable {
    private Long id;

    private String userid;

    private String compyname;

    private String industryid;

    private String department;

    private Integer postionid;

    private String postiname;

    private Date startdate;

    private Date enddate;

    private String content;

    private String grade;

    private String skillid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getCompyname() {
        return compyname;
    }

    public void setCompyname(String compyname) {
        this.compyname = compyname == null ? null : compyname.trim();
    }

    public String getIndustryid() {
        return industryid;
    }

    public void setIndustryid(String industryid) {
        this.industryid = industryid == null ? null : industryid.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Integer getPostionid() {
        return postionid;
    }

    public void setPostionid(Integer postionid) {
        this.postionid = postionid;
    }

    public String getPostiname() {
        return postiname;
    }

    public void setPostiname(String postiname) {
        this.postiname = postiname == null ? null : postiname.trim();
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getSkillid() {
        return skillid;
    }

    public void setSkillid(String skillid) {
        this.skillid = skillid == null ? null : skillid.trim();
    }
}