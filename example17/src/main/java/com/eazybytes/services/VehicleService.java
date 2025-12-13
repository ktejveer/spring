package com.eazybytes.services;

import com.eazybytes.beans.interfaces.Speaker;
import com.eazybytes.beans.interfaces.Tyres;
import com.eazybytes.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleService {

    @Autowired
    private Speaker speaker;
    @Autowired
    private Tyres tyres;

    private Logger logger = Logger.getLogger(VehicleService.class.getName());
    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public String moveVehicle(boolean vehicleStarted){
        String status = null;
        if(vehicleStarted){
            status = tyres.rotate();
        }else{
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
        }
        return status;
    }

    public String playMusic(boolean vehicleStarted, Song song){
        String music = null;
        if(vehicleStarted){
            music = speaker.makeSound(song);
        }else{
            logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
        }
        return music;
    }

    public String applyBreak(boolean vehicleStarted){
        if(vehicleStarted){
            return "Break applied";
        }
        return "Vehicle is not moving!";
    }
}
