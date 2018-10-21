package com.nf147.model;

import java.util.Date;

public class DeliveryReceipt {
    private Integer deliveryReceiptId;

    private String startCity;

    private String endCity;

    private String midCity;

    private Date makeDtae;

    private String remarks;

    public Integer getDeliveryReceiptId() {
        return deliveryReceiptId;
    }

    public void setDeliveryReceiptId(Integer deliveryReceiptId) {
        this.deliveryReceiptId = deliveryReceiptId;
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

    public Date getMakeDtae() {
        return makeDtae;
    }

    public void setMakeDtae(Date makeDtae) {
        this.makeDtae = makeDtae;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}