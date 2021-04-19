package com.maple.pojo;

import java.io.Serializable;
import java.util.Date;

public class Compy implements Serializable {
    private Integer id;

    private String compyid;

    private String compyname;

    private String password;

    private String picpath;

    private String regaddress;

    private String industayid;

    private Integer status;

    private Date creatime;

    private String card1;

    private String card2;

    private String random1;

    private String person;

    private String intoduction;

    private String jurisname;

    private String juriscontent;

    private String jurispic;

    private String persontel;

    private String personemail;

    private String compytel;

    private String juriscard;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompyid() {
        return compyid;
    }

    public void setCompyid(String compyid) {
        this.compyid = compyid == null ? null : compyid.trim();
    }

    public String getCompyname() {
        return compyname;
    }

    public void setCompyname(String compyname) {
        this.compyname = compyname == null ? null : compyname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

    public String getRegaddress() {
        return regaddress;
    }

    public void setRegaddress(String regaddress) {
        this.regaddress = regaddress == null ? null : regaddress.trim();
    }

    public String getIndustayid() {
        return industayid;
    }

    public void setIndustayid(String industayid) {
        this.industayid = industayid == null ? null : industayid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatime() {
        return creatime;
    }

    public void setCreatime(Date creatime) {
        this.creatime = creatime;
    }

    public String getCard1() {
        return card1;
    }

    public void setCard1(String card1) {
        this.card1 = card1 == null ? null : card1.trim();
    }

    public String getCard2() {
        return card2;
    }

    public void setCard2(String card2) {
        this.card2 = card2 == null ? null : card2.trim();
    }

    public String getRandom1() {
        return random1;
    }

    public void setRandom1(String random1) {
        this.random1 = random1 == null ? null : random1.trim();
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    public String getIntoduction() {
        return intoduction;
    }

    public void setIntoduction(String intoduction) {
        this.intoduction = intoduction == null ? null : intoduction.trim();
    }

    public String getJurisname() {
        return jurisname;
    }

    public void setJurisname(String jurisname) {
        this.jurisname = jurisname == null ? null : jurisname.trim();
    }

    public String getJuriscontent() {
        return juriscontent;
    }

    public void setJuriscontent(String juriscontent) {
        this.juriscontent = juriscontent == null ? null : juriscontent.trim();
    }

    public String getJurispic() {
        return jurispic;
    }

    public void setJurispic(String jurispic) {
        this.jurispic = jurispic == null ? null : jurispic.trim();
    }

    public String getPersontel() {
        return persontel;
    }

    public void setPersontel(String persontel) {
        this.persontel = persontel == null ? null : persontel.trim();
    }

    public String getPersonemail() {
        return personemail;
    }

    public void setPersonemail(String personemail) {
        this.personemail = personemail == null ? null : personemail.trim();
    }

    public String getCompytel() {
        return compytel;
    }

    public void setCompytel(String compytel) {
        this.compytel = compytel == null ? null : compytel.trim();
    }

    public String getJuriscard() {
        return juriscard;
    }

    public void setJuriscard(String juriscard) {
        this.juriscard = juriscard == null ? null : juriscard.trim();
    }
}