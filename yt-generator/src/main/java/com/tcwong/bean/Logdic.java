package com.tcwong.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Logdic implements Serializable {
    private Integer typeid;

    private String typename;

    private static final long serialVersionUID = 1L;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", typeid=").append(typeid);
        sb.append(", typename=").append(typename);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}