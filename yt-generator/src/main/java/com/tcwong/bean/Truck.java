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

    private Date checkintime;

    private Integer isdelete;

    private Date altertime;

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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", truckid=").append(truckid);
        sb.append(", number=").append(number);
        sb.append(", buydate=").append(buydate);
        sb.append(", type=").append(type);
        sb.append(", length=").append(length);
        sb.append(", tonnage=").append(tonnage);
        sb.append(", fkTeamid=").append(fkTeamid);
        sb.append(", state=").append(state);
        sb.append(", remark=").append(remark);
        sb.append(", checkintime=").append(checkintime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", altertime=").append(altertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}