package com.tcwong.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Goods implements Serializable {
    private Integer goodsid;

    private String goodsname;

    private Integer amount;

    private Float weight;

    private Float volume;

    private Integer fkCarriersid;

    private Integer isdelete;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public Integer getFkCarriersid() {
        return fkCarriersid;
    }

    public void setFkCarriersid(Integer fkCarriersid) {
        this.fkCarriersid = fkCarriersid;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsid=").append(goodsid);
        sb.append(", goodsname=").append(goodsname);
        sb.append(", amount=").append(amount);
        sb.append(", weight=").append(weight);
        sb.append(", volume=").append(volume);
        sb.append(", fkCarriersid=").append(fkCarriersid);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}