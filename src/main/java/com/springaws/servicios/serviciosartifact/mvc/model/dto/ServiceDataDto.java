package com.springaws.servicios.serviciosartifact.mvc.model.dto;

import java.util.Date;
import java.util.List;

public class ServiceDataDto {

    private Integer serviceId;
    private Integer serviceStatusId;
    private String serviceName;
    private String strKey;
    private String description;
    private Date registryDate;
    private Date updateDate;
    private Boolean active;

    private List<ServiceFieldDto> fieldList; // Un servicio puede tener diversos campos y formas de pago
    private List<ServicePaymentDto> paymentList;

    public ServiceDataDto() {
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getServiceStatusId() {
        return serviceStatusId;
    }

    public void setServiceStatusId(Integer serviceStatusId) {
        this.serviceStatusId = serviceStatusId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getStrKey() {
        return strKey;
    }

    public void setStrKey(String strKey) {
        this.strKey = strKey;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRegistryDate() {
        return registryDate;
    }

    public void setRegistryDate(Date registryDate) {
        this.registryDate = registryDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<ServiceFieldDto> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<ServiceFieldDto> fieldList) {
        this.fieldList = fieldList;
    }

    public List<ServicePaymentDto> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<ServicePaymentDto> paymentList) {
        this.paymentList = paymentList;
    }

    @Override
    public String toString() {
        return "ServiceDataDto{" +
                "serviceId=" + serviceId +
                ", serviceStatusId=" + serviceStatusId +
                ", serviceName='" + serviceName + '\'' +
                ", strKey='" + strKey + '\'' +
                ", description='" + description + '\'' +
                ", registryDate=" + registryDate +
                ", updateDate=" + updateDate +
                ", active=" + active +
                '}';
    }
}
