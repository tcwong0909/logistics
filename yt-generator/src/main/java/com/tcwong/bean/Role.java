package com.tcwong.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Role implements Serializable {
    private Integer roleid;

    private String rolename;

    private String rolepurview;

    private static final long serialVersionUID = 1L;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRolepurview() {
        return rolepurview;
    }

    public void setRolepurview(String rolepurview) {
        this.rolepurview = rolepurview;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleid=").append(roleid);
        sb.append(", rolename=").append(rolename);
        sb.append(", rolepurview=").append(rolepurview);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}