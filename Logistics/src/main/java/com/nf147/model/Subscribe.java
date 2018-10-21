package com.nf147.model;

public class Subscribe {
    private Integer orderId;

    private Integer deliveryReceiptId;

    private Integer carId;

    private Integer cuId;

    private String postName;

    private String postTel;

    private String postAddr;

    private String getName;

    private String getTel;

    private String getAddr;

    private String goodsName;

    private Double goodsWeight;

    private Integer orderType;

    private Integer orderState;

    private Double transportPrice;

    private Double deliveryPrice;

    private Double totalPrice;

    private String remarks;

    private String startCity;

    private String endCity;

    private String midCity;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getDeliveryReceiptId() {
        return deliveryReceiptId;
    }

    public void setDeliveryReceiptId(Integer deliveryReceiptId) {
        this.deliveryReceiptId = deliveryReceiptId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getCuId() {
        return cuId;
    }

    public void setCuId(Integer cuId) {
        this.cuId = cuId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    public String getPostTel() {
        return postTel;
    }

    public void setPostTel(String postTel) {
        this.postTel = postTel == null ? null : postTel.trim();
    }

    public String getPostAddr() {
        return postAddr;
    }

    public void setPostAddr(String postAddr) {
        this.postAddr = postAddr == null ? null : postAddr.trim();
    }

    public String getGetName() {
        return getName;
    }

    public void setGetName(String getName) {
        this.getName = getName == null ? null : getName.trim();
    }

    public String getGetTel() {
        return getTel;
    }

    public void setGetTel(String getTel) {
        this.getTel = getTel == null ? null : getTel.trim();
    }

    public String getGetAddr() {
        return getAddr;
    }

    public void setGetAddr(String getAddr) {
        this.getAddr = getAddr == null ? null : getAddr.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Double getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Double getTransportPrice() {
        return transportPrice;
    }

    public void setTransportPrice(Double transportPrice) {
        this.transportPrice = transportPrice;
    }

    public Double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(Double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity == null ? null : startCity.trim();
    }

    public String getEndCity() {
        return endCity;
    }

    public void setEndCity(String endCity) {
        this.endCity = endCity == null ? null : endCity.trim();
    }

    public String getMidCity() {
        return midCity;
    }

    public void setMidCity(String midCity) {
        this.midCity = midCity == null ? null : midCity.trim();
    }
}