package com.nf147.model;

public class DeliveryPlace {
    private Integer depId;

    private String depName;

    private Integer mqId;

    private Integer privanceId;

    private Integer cityId;

    private String depTel;

    private String depAddr;

    private String remarks;

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName == null ? null : depName.trim();
    }

    public Integer getMqId() {
        return mqId;
    }

    public void setMqId(Integer mqId) {
        this.mqId = mqId;
    }

    public Integer getPrivanceId() {
        return privanceId;
    }

    public void setPrivanceId(Integer privanceId) {
        this.privanceId = privanceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getDepTel() {
        return depTel;
    }

    public void setDepTel(String depTel) {
        this.depTel = depTel == null ? null : depTel.trim();
    }

    public String getDepAddr() {
        return depAddr;
    }

    public void setDepAddr(String depAddr) {
        this.depAddr = depAddr == null ? null : depAddr.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}