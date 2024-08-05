package com.carwashmetro.carwashmetro.domain.user;

public enum DniType {

    CC("CÉDULA CIUDADANÍA"),
    CE("CÉDULA EXTRANJERÍA"),
    TI("TARJETA IDENTIDAD"),
    TE("TARJETA EXTRANJERÍA");

    private final String value;

    DniType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}