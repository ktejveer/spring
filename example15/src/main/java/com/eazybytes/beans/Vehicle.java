package com.eazybytes.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Vehicle {

    private String name;

    public Vehicle(){
        System.out.println("Vehicle Object created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
