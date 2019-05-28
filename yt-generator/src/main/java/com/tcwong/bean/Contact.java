package com.tcwong.bean;

import java.io.Serializable;

public class Contact implements Serializable {
    private Integer contactid;

    private Integer fkTruckid;

    private Integer fkDriverid;

    private Truck truck;

    private Driver driver;

    private Truckteam truckteam;

    @Override
    public String toString() {
        return "Contact{" +
                "contactid=" + contactid +
                ", fkTruckid=" + fkTruckid +
                ", fkDriverid=" + fkDriverid +
                ", truck=" + truck +
                ", driver=" + driver +
                ", truckteam=" + truckteam +
                '}';
    }

    public Truckteam getTruckteam() {
        return truckteam;
    }

    public void setTruckteam(Truckteam truckteam) {
        this.truckteam = truckteam;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

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

}