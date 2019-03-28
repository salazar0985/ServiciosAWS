package com.springaws.servicios.serviciosartifact.mvc.model.dto;

public class ServiceFieldDto {

    private Integer serviceFieldId;
    private Integer serviceId;
    private Integer dataTypeId;
    private String fieldName;
    private Boolean active;

    public ServiceFieldDto() {
    }

    public Integer getServiceFieldId() {
        return serviceFieldId;
    }

    public void setServiceFieldId(Integer serviceFieldId) {
        this.serviceFieldId = serviceFieldId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getDataTypeId() {
        return dataTypeId;
    }

    public void setDataTypeId(Integer dataTypeId) {
        this.dataTypeId = dataTypeId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
