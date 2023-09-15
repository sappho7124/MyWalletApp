package com.ManuelPedraa.mywalleapp;

public class Account {

    public Account(String name, String typeAccount, Double currentValue, String imageUrl) {
        this.name = name;
        this.typeAccount = typeAccount;
        this.currentValue = currentValue;
        this.imageUrl = imageUrl;
    }

    private String name;
    private String typeAccount;
    private Double currentValue;
    private String imageUrl;

    public String getInageUrl() {
        return imageUrl;
    }

    public void setInageUrl(String inageUrl) {
        this.imageUrl = inageUrl;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }
}
