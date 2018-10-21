package com.nf147.model;

import java.util.Date;

public class Car {
    private Integer carId;

    private Integer routeId;

    private String carType;

    private String carOrgin;

    private Date carProDate;

    private Date carBiyDate;

    private String remarks;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public String getCarOrgin() {
        return carOrgin;
    }

    public void setCarOrgin(String carOrgin) {
        this.carOrgin = carOrgin == null ? null : carOrgin.trim();
    }

    public Date getCarProDate() {
        return carProDate;
    }

    public void setCarProDate(Date carProDate) {
        this.carProDate = carProDate;
    }

    public Date getCarBiyDate() {
        return carBiyDate;
    }

    public void setCarBiyDate(Date carBiyDate) {
        this.carBiyDate = carBiyDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}