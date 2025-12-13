package com.eazybytes.beans;

import com.eazybytes.beans.interfaces.Speaker;
import com.eazybytes.beans.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleService {

    @Autowired
    private Speaker speaker;
    @Autowired
    private Tyres tyres;

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

    public void playMusic(){
        this.speaker.makeSound();
    }

    public void run(){
        this.tyres.rotate();
    }
}
