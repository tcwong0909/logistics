package com.tcwong.bean;

import com.alibaba.fastjson.annotation.JSONField;

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
    @JSONField(format = "yyyy-MM-dd")
    private Date leaverdate;

    @JSONField(format = "yyyy-MM-dd")
    private Date receivedate;

    @JSONField(format = "yyyy-MM-dd")
    private Integer finishedstate;

    private Float insurancecost;

    private Float transportcost;

    private Float othercost;

    private Float totalcost;

    private String remark;

    private Integer fkUserid;

    @JSONField(format = "yyyy-MM-dd")
    private Date checkintime;

    private Integer isdelete;
    @JSONField(format = "yyyy-MM-dd")
    private Date altertime;

    private Goods goods;

    @Override
    public String toString() {
        return "Carriers{" +
                "carriersid=" + carriersid +
                ", sendcompany='" + sendcompany + '\'' +
                ", sendaddress='" + sendaddress + '\'' +
                ", sendlinkman='" + sendlinkman + '\'' +
                ", sendphone='" + sendphone + '\'' +
                ", receivecompany='" + receivecompany + '\'' +
                ", fkReceiveaddress='" + fkReceiveaddress + '\'' +
                ", receivelinkman='" + receivelinkman + '\'' +
                ", receivephone='" + receivephone + '\'' +
                ", leaverdate=" + leaverdate +
                ", receivedate=" + receivedate +
                ", finishedstate=" + finishedstate +
                ", insurancecost=" + insurancecost +
                ", transportcost=" + transportcost +
                ", othercost=" + othercost +
                ", totalcost=" + totalcost +
                ", remark='" + remark + '\'' +
                ", fkUserid=" + fkUserid +
                ", checkintime=" + checkintime +
                ", isdelete=" + isdelete +
                ", altertime=" + altertime +
                ", goods=" + goods +
                '}';
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

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

}