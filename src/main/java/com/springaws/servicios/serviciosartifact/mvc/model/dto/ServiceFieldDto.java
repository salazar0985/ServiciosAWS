package com.springaws.servicios.serviciosartifact.mvc.model.dto;

public class ServiceFieldDto {

    private Integer serviceFieldId;
    private Integer serviceId;
    private Integer dataTypeId;
    private String dataTypeStr;
    private String fieldName;
    private Boolean active;

    public ServiceFieldDto() {
    }

    public ServiceFieldDto(String fieldName, String dataTypeStr) {
        this.fieldName = fieldName;
        this.dataTypeStr = dataTypeStr;

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

    public String getDataTypeStr() {
        return dataTypeStr;
    }

    public void setDataTypeStr(String dataTypeStr) {
        this.dataTypeStr = dataTypeStr;
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

    @Override
    public String toString() {
        return "ServiceFieldDto{" +
                "serviceFieldId=" + serviceFieldId +
                ", serviceId=" + serviceId +
                ", dataTypeId=" + dataTypeId +
                ", dataTypeStr='" + dataTypeStr + '\'' +
                ", fieldName='" + fieldName + '\'' +
                ", active=" + active +
                '}';
    }
}
