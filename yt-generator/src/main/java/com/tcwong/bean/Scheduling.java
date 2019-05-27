package com.tcwong.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class Scheduling implements Serializable {
    private Integer schedulingid;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date starttime;

    private Integer fkCarriersid;

    private Integer fkTruckid;

    private Float oilcost;

    private Float toll;

    private Float fine;

    private Float othercost;

    private Float totalcost;

    private Integer fkUserid;

    private String remark;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date checkintime;

    private Integer isdelete;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date altertime;

    private Carriers carriers;

    @Override
    public String toString() {
        return "Scheduling{" +
                "schedulingid=" + schedulingid +
                ", starttime=" + starttime +
                ", fkCarriersid=" + fkCarriersid +
                ", fkTruckid=" + fkTruckid +
                ", oilcost=" + oilcost +
                ", toll=" + toll +
                ", fine=" + fine +
                ", othercost=" + othercost +
                ", totalcost=" + totalcost +
                ", fkUserid=" + fkUserid +
                ", remark='" + remark + '\'' +
                ", checkintime=" + checkintime +
                ", isdelete=" + isdelete +
                ", altertime=" + altertime +
                ", carriers=" + carriers +
                '}';
    }

    public Carriers getCarriers() {
        return carriers;
    }

    public void setCarriers(Carriers carriers) {
        this.carriers = carriers;
    }

    private static final long serialVersionUID = 1L;

    public Integer getSchedulingid() {
        return schedulingid;
    }

    public void setSchedulingid(Integer schedulingid) {
        this.schedulingid = schedulingid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Integer getFkCarriersid() {
        return fkCarriersid;
    }

    public void setFkCarriersid(Integer fkCarriersid) {
        this.fkCarriersid = fkCarriersid;
    }

    public Integer getFkTruckid() {
        return fkTruckid;
    }

    public void setFkTruckid(Integer fkTruckid) {
        this.fkTruckid = fkTruckid;
    }

    public Float getOilcost() {
        return oilcost;
    }

    public void setOilcost(Float oilcost) {
        this.oilcost = oilcost;
    }

    public Float getToll() {
        return toll;
    }

    public void setToll(Float toll) {
        this.toll = toll;
    }

    public Float getFine() {
        return fine;
    }

    public void setFine(Float fine) {
        this.fine = fine;
    }

    public Float getOthercost() {
        return othercost;
    }

    public void setOthercost(Float othercost) {
        this.othercost = othercost;
    }

    public Float getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(Float totalcost) {
        this.totalcost = totalcost;
    }

    public Integer getFkUserid() {
        return fkUserid;
    }

    public void setFkUserid(Integer fkUserid) {
        this.fkUserid = fkUserid;
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