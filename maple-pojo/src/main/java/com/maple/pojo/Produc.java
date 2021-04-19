package com.maple.pojo;

import java.io.Serializable;

public class Produc  implements Serializable {
    private Integer id;

    private String compyid;

    private String produname;

    private String producontent;

    private String produurl;

    private String produpic;

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

    public String getProduname() {
        return produname;
    }

    public void setProduname(String produname) {
        this.produname = produname == null ? null : produname.trim();
    }

    public String getProducontent() {
        return producontent;
    }

    public void setProducontent(String producontent) {
        this.producontent = producontent == null ? null : producontent.trim();
    }

    public String getProduurl() {
        return produurl;
    }

    public void setProduurl(String produurl) {
        this.produurl = produurl == null ? null : produurl.trim();
    }

    public String getProdupic() {
        return produpic;
    }

    public void setProdupic(String produpic) {
        this.produpic = produpic == null ? null : produpic.trim();
    }
}