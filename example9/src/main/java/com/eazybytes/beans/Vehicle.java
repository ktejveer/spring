package com.eazybytes.beans;

import jakarta.annotation.PostConstruct;

public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
