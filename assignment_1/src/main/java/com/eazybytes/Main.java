package com.eazybytes;

import com.eazybytes.beans.Person;
import com.eazybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println("Person Name: "+person.getName());
        System.out.println("Person vehicle name: "+person.getVehicle().getName());
        person.getVehicle().getVehicleService().playMusic();
        person.getVehicle().getVehicleService().run();
    }
}