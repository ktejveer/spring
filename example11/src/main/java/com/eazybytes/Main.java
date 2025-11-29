package com.eazybytes;

import com.eazybytes.beans.Person;
import com.eazybytes.beans.Vehicle;
import com.eazybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name is: "+vehicle.getName());

        Person person = context.getBean(Person.class);
        System.out.println("Person name is: "+person.getName());
        System.out.println("Person having: " + person.getVehicle().getName());
    }
}