package com.carwashmetro.carwashmetro.domain.user;

public enum UserStatus {

    ACTIVE("CÉDULA CIUDADANÍA"),
    INACTIVE("CÉDULA EXTRANJERÍA"),
    SUSPENDED ("SUSPENDIDO");

    private final String value;

    UserStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}