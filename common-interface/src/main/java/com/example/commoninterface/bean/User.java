package com.example.commoninterface.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class User implements Serializable {
    private String id;

    private String username;

    private String realname;

    private String pwd;

    private String email;

    private BigDecimal emailstatus;

    private String emailcode;

    private Date notafter;

    private BigDecimal emaillinkstate;

    private BigDecimal delflag;

    private BigDecimal groupid;

    private String crtuser;

    private Date crtdate;

    private String uptuser;

    private Date uptdate;

    private String agencyid;

    private String storehouseid;

    private BigDecimal isadmin;

    private String phone;

    private String address;

    private String addressDetail;
    private String idcardFront;
    private String idcardBack;
    private String contractnum;

    public String getIdcardFront() {
        return idcardFront;
    }

    public void setIdcardFront(String idcardFront) {
        this.idcardFront = idcardFront;
    }

    public String getIdcardBack() {
        return idcardBack;
    }

    public void setIdcardBack(String idcardBack) {
        this.idcardBack = idcardBack;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public BigDecimal getEmailstatus() {
        return emailstatus;
    }

    public void setEmailstatus(BigDecimal emailstatus) {
        this.emailstatus = emailstatus;
    }

    public String getEmailcode() {
        return emailcode;
    }

    public void setEmailcode(String emailcode) {
        this.emailcode = emailcode == null ? null : emailcode.trim();
    }

    public Date getNotafter() {
        return notafter;
    }

    public void setNotafter(Date notafter) {
        this.notafter = notafter;
    }

    public BigDecimal getEmaillinkstate() {
        return emaillinkstate;
    }

    public void setEmaillinkstate(BigDecimal emaillinkstate) {
        this.emaillinkstate = emaillinkstate;
    }

    public BigDecimal getDelflag() {
        return delflag;
    }

    public void setDelflag(BigDecimal delflag) {
        this.delflag = delflag;
    }

    public BigDecimal getGroupid() {
        return groupid;
    }

    public void setGroupid(BigDecimal groupid) {
        this.groupid = groupid;
    }

    public String getCrtuser() {
        return crtuser;
    }

    public void setCrtuser(String crtuser) {
        this.crtuser = crtuser == null ? null : crtuser.trim();
    }

    public Date getCrtdate() {
        return crtdate;
    }

    public void setCrtdate(Date crtdate) {
        this.crtdate = crtdate;
    }

    public String getUptuser() {
        return uptuser;
    }

    public void setUptuser(String uptuser) {
        this.uptuser = uptuser == null ? null : uptuser.trim();
    }

    public Date getUptdate() {
        return uptdate;
    }

    public void setUptdate(Date uptdate) {
        this.uptdate = uptdate;
    }

    public String getAgencyid() {
        return agencyid;
    }

    public String getContractnum() {
        return contractnum;
    }

    public void setContractnum(String contractnum) {
        this.contractnum = contractnum;
    }

    public void setAgencyid(String agencyid) {
        this.agencyid = agencyid == null ? null : agencyid.trim();
    }

    public String getStorehouseid() {
        return storehouseid;
    }

    public void setStorehouseid(String storehouseid) {
        this.storehouseid = storehouseid == null ? null : storehouseid.trim();
    }

    public BigDecimal getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(BigDecimal isadmin) {
        this.isadmin = isadmin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}
