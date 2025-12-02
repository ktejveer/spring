package com.eazybytes;

import com.eazybytes.beans.Person;
import com.eazybytes.beans.VehicleService;
import com.eazybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleService vehicleService1 = context.getBean(VehicleService.class);
        VehicleService vehicleService2 = context.getBean(VehicleService.class);
        System.out.println(vehicleService1);
        System.out.println(vehicleService2);

        System.out.println(vehicleService1.hashCode());
        System.out.println(vehicleService2.hashCode());
    }
}