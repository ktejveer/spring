package com.eazybytes.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(value = 1)
public class VehicleStartCheckAspect {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Before("execution(* com.eazybytes.services.*.*(..)) && args(vehicleStarted,..)")
    public void checkVehicleStarted(JoinPoint joinPoint, boolean vehicleStarted) throws Throwable{
        if(!vehicleStarted){
            throw new RuntimeException("Vehicle not started");
        }
    }
}
