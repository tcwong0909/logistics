package com.tcwong.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Carriers implements Serializable {
    private Integer carriersid;

    private String sendcompany;

    private String sendaddress;

    private String sendlinkman;

    private String sendphone;

    private String receivecompany;

    private String fkReceiveaddress;

    private String receivelinkman;

    private String receivephone;

    private Date leaverdate;

    private Date receivedate;

    private Integer finishedstate;

    private Float insurancecost;

    private Float transportcost;

    private Float othercost;

    private Float totalcost;

    private String remark;

    private Integer fkUserid;

    private Date checkintime;

    private Integer isdelete;

    private Date altertime;

    private static final long serialVersionUID = 1L;

    public Integer getCarriersid() {
        return carriersid;
    }

    public void setCarriersid(Integer carriersid) {
        this.carriersid = carriersid;
    }

    public String getSendcompany() {
        return sendcompany;
    }

    public void setSendcompany(String sendcompany) {
        this.sendcompany = sendcompany;
    }

    public String getSendaddress() {
        return sendaddress;
    }

    public void setSendaddress(String sendaddress) {
        this.sendaddress = sendaddress;
    }

    public String getSendlinkman() {
        return sendlinkman;
    }

    public void setSendlinkman(String sendlinkman) {
        this.sendlinkman = sendlinkman;
    }

    public String getSendphone() {
        return sendphone;
    }

    public void setSendphone(String sendphone) {
        this.sendphone = sendphone;
    }

    public String getReceivecompany() {
        return receivecompany;
    }

    public void setReceivecompany(String receivecompany) {
        this.receivecompany = receivecompany;
    }

    public String getFkReceiveaddress() {
        return fkReceiveaddress;
    }

    public void setFkReceiveaddress(String fkReceiveaddress) {
        this.fkReceiveaddress = fkReceiveaddress;
    }

    public String getReceivelinkman() {
        return receivelinkman;
    }

    public void setReceivelinkman(String receivelinkman) {
        this.receivelinkman = receivelinkman;
    }

    public String getReceivephone() {
        return receivephone;
    }

    public void setReceivephone(String receivephone) {
        this.receivephone = receivephone;
    }

    public Date getLeaverdate() {
        return leaverdate;
    }

    public void setLeaverdate(Date leaverdate) {
        this.leaverdate = leaverdate;
    }

    public Date getReceivedate() {
        return receivedate;
    }

    public void setReceivedate(Date receivedate) {
        this.receivedate = receivedate;
    }

    public Integer getFinishedstate() {
        return finishedstate;
    }

    public void setFinishedstate(Integer finishedstate) {
        this.finishedstate = finishedstate;
    }

    public Float getInsurancecost() {
        return insurancecost;
    }

    public void setInsurancecost(Float insurancecost) {
        this.insurancecost = insurancecost;
    }

    public Float getTransportcost() {
        return transportcost;
    }

    public void setTransportcost(Float transportcost) {
        this.transportcost = transportcost;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getFkUserid() {
        return fkUserid;
    }

    public void setFkUserid(Integer fkUserid) {
        this.fkUserid = fkUserid;
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
        sb.append(", carriersid=").append(carriersid);
        sb.append(", sendcompany=").append(sendcompany);
        sb.append(", sendaddress=").append(sendaddress);
        sb.append(", sendlinkman=").append(sendlinkman);
        sb.append(", sendphone=").append(sendphone);
        sb.append(", receivecompany=").append(receivecompany);
        sb.append(", fkReceiveaddress=").append(fkReceiveaddress);
        sb.append(", receivelinkman=").append(receivelinkman);
        sb.append(", receivephone=").append(receivephone);
        sb.append(", leaverdate=").append(leaverdate);
        sb.append(", receivedate=").append(receivedate);
        sb.append(", finishedstate=").append(finishedstate);
        sb.append(", insurancecost=").append(insurancecost);
        sb.append(", transportcost=").append(transportcost);
        sb.append(", othercost=").append(othercost);
        sb.append(", totalcost=").append(totalcost);
        sb.append(", remark=").append(remark);
        sb.append(", fkUserid=").append(fkUserid);
        sb.append(", checkintime=").append(checkintime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", altertime=").append(altertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}