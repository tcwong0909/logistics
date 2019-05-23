package com.tcwong.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class Truckteam implements Serializable {
    private Integer teamid;

    private String teamname;

    private String leader;

    private String remark;

    @JSONField(format = "yyyy-MM-dd")
    private Date checkintime;
    private Integer isdelete;
    @JSONField(format = "yyyy-MM-dd")
    private Date altertime;

    private static final long serialVersionUID = 1L;

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
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
        sb.append(", teamid=").append(teamid);
        sb.append(", teamname=").append(teamname);
        sb.append(", leader=").append(leader);
        sb.append(", remark=").append(remark);
        sb.append(", checkintime=").append(checkintime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", altertime=").append(altertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}