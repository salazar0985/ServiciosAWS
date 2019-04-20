package com.springaws.servicios.serviciosartifact.mvc.model.dto;

public class CurrencyTypeDto {

    private Integer currencyId;
    private String key;
    private String description;

    public CurrencyTypeDto() {
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CurrencyTypeDto{" +
                "currencyId=" + currencyId +
                ", key='" + key + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
