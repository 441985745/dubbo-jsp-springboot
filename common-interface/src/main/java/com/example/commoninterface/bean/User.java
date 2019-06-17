package com.example.commoninterface.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Data
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

}
