package com.tcwong.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class Truck implements Serializable {
    private Integer truckid;

    private String number;

    @JSONField(format ="yyyy-MM-dd")
    private Date buydate;

    private String type;

    private String length;

    private Integer tonnage;

    private Integer fkTeamid;

    private Integer state;

    private String remark;

    @JSONField(format ="yyyy-MM-dd")
    private Date checkintime;

    private Integer isdelete;

    @JSONField(format ="yyyy-MM-dd")
    private Date altertime;

    private Truckteam truckteam;

    public Truckteam getTruckteam() {
        return truckteam;
    }

    public void setTruckteam(Truckteam truckteam) {
        this.truckteam = truckteam;
    }

    private static final long serialVersionUID = 1L;

    public Integer getTruckid() {
        return truckid;
    }

    public void setTruckid(Integer truckid) {
        this.truckid = truckid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getBuydate() {
        return buydate;
    }

    public void setBuydate(Date buydate) {
        this.buydate = buydate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public Integer getTonnage() {
        return tonnage;
    }

    public void setTonnage(Integer tonnage) {
        this.tonnage = tonnage;
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

    @Override
    public String toString() {
        return "Truck{" +
                "truckid=" + truckid +
                ", number='" + number + '\'' +
                ", buydate=" + buydate +
                ", type='" + type + '\'' +
                ", length='" + length + '\'' +
                ", tonnage=" + tonnage +
                ", fkTeamid=" + fkTeamid +
                ", state=" + state +
                ", remark='" + remark + '\'' +
                ", checkintime=" + checkintime +
                ", isdelete=" + isdelete +
                ", altertime=" + altertime +
                ", truckteam=" + truckteam +
                '}';
    }
}