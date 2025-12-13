package com.eazybytes;

import com.eazybytes.beans.Vehicle;
import com.eazybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = context.getBean(Vehicle.class);
        Vehicle vehicle2 = context.getBean("vehicle", Vehicle.class);
        System.out.println(vehicle1);
        System.out.println(vehicle2);
    }
}