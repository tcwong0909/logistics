package com.tcwong.bean;

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

    private Logdic logdic;

    private User user;

    @Override
    public String toString() {
        return "Syslog{" +
                "logid=" + logid +
                ", fkTypeid=" + fkTypeid +
                ", fkUserid=" + fkUserid +
                ", procname='" + procname + '\'' +
                ", ip='" + ip + '\'' +
                ", checkintime=" + checkintime +
                ", isexception=" + isexception +
                ", behavior='" + behavior + '\'' +
                ", parameters='" + parameters + '\'' +
                ", exception='" + exception + '\'' +
                ", logdic=" + logdic +
                ", user=" + user +
                '}';
    }

    public Logdic getLogdic() {
        return logdic;
    }

    public void setLogdic(Logdic logdic) {
        this.logdic = logdic;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Syslog(Integer fkTypeid, Integer fkUserid, String procname, String ip, Date checkintime,
                  Integer isexception, String behavior, String parameters, String exception) {
        this.fkTypeid = fkTypeid;
        this.fkUserid = fkUserid;
        this.procname = procname;
        this.ip = ip;
        this.checkintime = checkintime;
        this.isexception = isexception;
        this.behavior = behavior;
        this.parameters = parameters;
        this.exception = exception;
    }

    public Syslog() {
    }

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

}