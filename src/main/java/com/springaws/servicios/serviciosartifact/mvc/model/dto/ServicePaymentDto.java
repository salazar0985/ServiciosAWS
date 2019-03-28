package com.springaws.servicios.serviciosartifact.mvc.model.dto;

public class ServicePaymentDto {

    private Integer servicePaymentId;
    private Integer serviceId;
    private Integer payFormId;
    private Integer currencyId;
    private String amount;
    private Boolean active;

    public ServicePaymentDto() {
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
}
