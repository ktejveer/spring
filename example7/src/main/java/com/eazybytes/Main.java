package com.eazybytes;

import com.eazybytes.beans.Vehicle;
import com.eazybytes.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Supplier<Vehicle> volkswagenSupplier = ()->{
            Vehicle volkswagen = new Vehicle();
            volkswagen.setName("Volkswagen");
            return volkswagen;
        };

        Supplier<Vehicle> audiSupplier = ()->{
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("Generated Randon Number is: "+randomNumber);

        if(randomNumber % 2 == 0){
            context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
        }else{
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }

        Vehicle volkswagen = null;
        Vehicle audi = null;
        try{
            volkswagen = context.getBean("volkswagen", Vehicle.class);
        }catch(NoSuchBeanDefinitionException exception){
            System.out.println("Error while creating volkswagen");
        }

        try{
            audi = context.getBean("audi", Vehicle.class);
        }catch(NoSuchBeanDefinitionException exception){
            System.out.println("Error while creating audi");
        }


        if(null != volkswagen){
            System.out.println("Name of the vehicle is: "+volkswagen.getName());
        }else{
            System.out.println("Name of the vehicle is: "+audi.getName());
        }

    }
}