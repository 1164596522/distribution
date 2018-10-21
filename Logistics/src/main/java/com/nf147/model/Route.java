package com.nf147.model;

public class Route {
    private Integer routeId;

    private String routeName;

    private Integer startProvinceId;

    private Integer startCityId;

    private Integer midProvinceId;

    private Integer midCityId;

    private Integer endProvinceId;

    private Integer endCityId;

    private Double transportPrice;

    private String remarks;

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName == null ? null : routeName.trim();
    }

    public Integer getStartProvinceId() {
        return startProvinceId;
    }

    public void setStartProvinceId(Integer startProvinceId) {
        this.startProvinceId = startProvinceId;
    }

    public Integer getStartCityId() {
        return startCityId;
    }

    public void setStartCityId(Integer startCityId) {
        this.startCityId = startCityId;
    }

    public Integer getMidProvinceId() {
        return midProvinceId;
    }

    public void setMidProvinceId(Integer midProvinceId) {
        this.midProvinceId = midProvinceId;
    }

    public Integer getMidCityId() {
        return midCityId;
    }

    public void setMidCityId(Integer midCityId) {
        this.midCityId = midCityId;
    }

    public Integer getEndProvinceId() {
        return endProvinceId;
    }

    public void setEndProvinceId(Integer endProvinceId) {
        this.endProvinceId = endProvinceId;
    }

    public Integer getEndCityId() {
        return endCityId;
    }

    public void setEndCityId(Integer endCityId) {
        this.endCityId = endCityId;
    }

    public Double getTransportPrice() {
        return transportPrice;
    }

    public void setTransportPrice(Double transportPrice) {
        this.transportPrice = transportPrice;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}