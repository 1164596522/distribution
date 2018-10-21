package com.nf147.model;

public class City {
    private Integer cityId;

    private String cityName;

    private Integer privanceId;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Integer getPrivanceId() {
        return privanceId;
    }

    public void setPrivanceId(Integer privanceId) {
        this.privanceId = privanceId;
    }
}