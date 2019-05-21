package com.tcwong.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Scheduling implements Serializable {
    private Integer schedulingid;

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

    private Date checkintime;

    private Integer isdelete;

    private Date altertime;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schedulingid=").append(schedulingid);
        sb.append(", starttime=").append(starttime);
        sb.append(", fkCarriersid=").append(fkCarriersid);
        sb.append(", fkTruckid=").append(fkTruckid);
        sb.append(", oilcost=").append(oilcost);
        sb.append(", toll=").append(toll);
        sb.append(", fine=").append(fine);
        sb.append(", othercost=").append(othercost);
        sb.append(", totalcost=").append(totalcost);
        sb.append(", fkUserid=").append(fkUserid);
        sb.append(", remark=").append(remark);
        sb.append(", checkintime=").append(checkintime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", altertime=").append(altertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}