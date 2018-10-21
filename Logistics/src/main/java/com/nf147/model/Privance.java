package com.nf147.model;

public class Privance {
    private Integer privanceId;

    private String privanceName;

    public Integer getPrivanceId() {
        return privanceId;
    }

    public void setPrivanceId(Integer privanceId) {
        this.privanceId = privanceId;
    }

    public String getPrivanceName() {
        return privanceName;
    }

    public void setPrivanceName(String privanceName) {
        this.privanceName = privanceName == null ? null : privanceName.trim();
    }
}