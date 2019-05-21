package com.tcwong.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Contact implements Serializable {
    private Integer contactid;

    private Integer fkTruckid;

    private Integer fkDriverid;

    private static final long serialVersionUID = 1L;

    public Integer getContactid() {
        return contactid;
    }

    public void setContactid(Integer contactid) {
        this.contactid = contactid;
    }

    public Integer getFkTruckid() {
        return fkTruckid;
    }

    public void setFkTruckid(Integer fkTruckid) {
        this.fkTruckid = fkTruckid;
    }

    public Integer getFkDriverid() {
        return fkDriverid;
    }

    public void setFkDriverid(Integer fkDriverid) {
        this.fkDriverid = fkDriverid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", contactid=").append(contactid);
        sb.append(", fkTruckid=").append(fkTruckid);
        sb.append(", fkDriverid=").append(fkDriverid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}