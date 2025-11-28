package com.eazybytes.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void setName(){
        this.name = "Honda";
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroying Vehicle Bean.");
    }

    public void sayHello(){
        System.out.println("Welcome, You have created Vehicle Object by @Component annotation");
    }
}
