package com.tcwong.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class Driver implements Serializable {
    private Integer driverid;

    private String name;

    private Integer sex;

    @JSONField(format = "yyyy-MM-dd")
    private Date birth;

    private String phone;

    private String idcard;

    private Integer fkTeamid;

    private Integer state;

    private String remark;

    @JSONField(format = "yyyy-MM-dd")
    private Date checkintime;

    private Integer isdelete;

    @JSONField(format = "yyyy-MM-dd")
    private Date altertime;

    private Truckteam truckteam;

    @Override
    public String toString() {
        return "Driver{" +
                "driverid=" + driverid +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birth=" + birth +
                ", phone='" + phone + '\'' +
                ", idcard='" + idcard + '\'' +
                ", fkTeamid=" + fkTeamid +
                ", state=" + state +
                ", remark='" + remark + '\'' +
                ", checkintime=" + checkintime +
                ", isdelete=" + isdelete +
                ", altertime=" + altertime +
                ", truckteam=" + truckteam +
                '}';
    }

    public Truckteam getTruckteam() {
        return truckteam;
    }

    public void setTruckteam(Truckteam truckteam) {
        this.truckteam = truckteam;
    }

    private static final long serialVersionUID = 1L;

    public Integer getDriverid() {
        return driverid;
    }

    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Integer getFkTeamid() {
        return fkTeamid;
    }

    public void setFkTeamid(Integer fkTeamid) {
        this.fkTeamid = fkTeamid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

}