package com.eazybytes;

import com.eazybytes.beans.Vehicle;
import com.eazybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Vehicle name is: "+veh1.getName());

        Vehicle veh2 = context.getBean("hondaVehicle", Vehicle.class);
        System.out.println("Vehicle name is: "+veh2.getName());

        Vehicle veh3 = context.getBean("ferrariVehicle", Vehicle.class);
        System.out.println("Vehicle name is: "+veh3.getName());
    }
}