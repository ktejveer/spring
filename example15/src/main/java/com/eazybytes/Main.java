package com.eazybytes;

import com.eazybytes.beans.Vehicle;
import com.eazybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("In Main before getting vehicle");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("In Main after getting vehicle");
    }
}