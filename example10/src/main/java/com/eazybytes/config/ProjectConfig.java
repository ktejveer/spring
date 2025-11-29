package com.eazybytes.config;

import com.eazybytes.beans.Person;
import com.eazybytes.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle(){
        var vehicle = new Vehicle();
        vehicle.setName("Audi Car");
        return vehicle;
    }

    @Bean
    public Person person(Vehicle vehicle){
        var person = new Person();
        person.setName("Amit");
        person.setVehicle(vehicle);
        return person;
    }
}
