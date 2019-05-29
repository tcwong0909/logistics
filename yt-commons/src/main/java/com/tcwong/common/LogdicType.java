package com.tcwong.common;

public enum LogdicType {
    LOGIN(1, "登录"),
    ADD(2, "添加数据"),
    DELETE(3, "删除数据"),
    UPDATE(4, "修改数据"),
    GET(5,"查询数据")
    ;


    private   Integer num;
    private   String operate;

    LogdicType(Integer num, String operate) {
        this.num = num;
        this.operate = operate;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }
}
