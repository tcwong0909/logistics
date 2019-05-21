package com.tcwong.bean;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Syslog implements Serializable {
    private Integer logid;

    private Integer fkTypeid;

    private Integer fkUserid;

    private String procname;

    private String ip;

    private Date checkintime;

    private Integer isexception;

    private String behavior;

    private String parameters;

    private String exception;

    private static final long serialVersionUID = 1L;

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public Integer getFkTypeid() {
        return fkTypeid;
    }

    public void setFkTypeid(Integer fkTypeid) {
        this.fkTypeid = fkTypeid;
    }

    public Integer getFkUserid() {
        return fkUserid;
    }

    public void setFkUserid(Integer fkUserid) {
        this.fkUserid = fkUserid;
    }

    public String getProcname() {
        return procname;
    }

    public void setProcname(String procname) {
        this.procname = procname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getCheckintime() {
        return checkintime;
    }

    public void setCheckintime(Date checkintime) {
        this.checkintime = checkintime;
    }

    public Integer getIsexception() {
        return isexception;
    }

    public void setIsexception(Integer isexception) {
        this.isexception = isexception;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logid=").append(logid);
        sb.append(", fkTypeid=").append(fkTypeid);
        sb.append(", fkUserid=").append(fkUserid);
        sb.append(", procname=").append(procname);
        sb.append(", ip=").append(ip);
        sb.append(", checkintime=").append(checkintime);
        sb.append(", isexception=").append(isexception);
        sb.append(", behavior=").append(behavior);
        sb.append(", parameters=").append(parameters);
        sb.append(", exception=").append(exception);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}