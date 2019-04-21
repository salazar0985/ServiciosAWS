package com.springaws.servicios.serviciosartifact.mvc.model.dto;

public class ServicePaymentDto {

    private Integer servicePaymentId;
    private Integer serviceId;
    private Integer payFormId;
    private Integer currencyId;
    private String amount;
    private Boolean active;
    private String payFormStr;
    private String currencyStr;


    public ServicePaymentDto() {
    }

    public ServicePaymentDto(String payFormStr, String currencyStr) {
        this.payFormStr = payFormStr;
        this.currencyStr = currencyStr;
    }

    public Integer getServicePaymentId() {
        return servicePaymentId;
    }

    public void setServicePaymentId(Integer servicePaymentId) {
        this.servicePaymentId = servicePaymentId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getPayFormId() {
        return payFormId;
    }

    public void setPayFormId(Integer payFormId) {
        this.payFormId = payFormId;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getPayFormStr() {
        return payFormStr;
    }

    public void setPayFormStr(String payFormStr) {
        this.payFormStr = payFormStr;
    }

    public String getCurrencyStr() {
        return currencyStr;
    }

    public void setCurrencyStr(String currencyStr) {
        this.currencyStr = currencyStr;
    }
}
