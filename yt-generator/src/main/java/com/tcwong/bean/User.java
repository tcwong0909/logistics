package com.tcwong.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer userid;

    private String username;

    private Integer sex;

    private String account;

    private String password;

    private String phone;

    private String email;

    private Integer fkRoleid;

    private Date checkintime;

    private Integer isdelete;

    private Date altertime;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getFkRoleid() {
        return fkRoleid;
    }

    public void setFkRoleid(Integer fkRoleid) {
        this.fkRoleid = fkRoleid;
    }

    public Date getCheckintime() {
        return checkintime;
    }

    public void setCheckintime(Date checkintime) {
        this.checkintime = checkintime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Date getAltertime() {
        return altertime;
    }

    public void setAltertime(Date altertime) {
        this.altertime = altertime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", sex=").append(sex);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", fkRoleid=").append(fkRoleid);
        sb.append(", checkintime=").append(checkintime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", altertime=").append(altertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}