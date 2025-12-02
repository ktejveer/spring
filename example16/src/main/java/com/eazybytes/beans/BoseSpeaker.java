package com.eazybytes.beans;

import com.eazybytes.beans.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class BoseSpeaker implements Speaker {

    @Override
    public void makeSound() {
        System.out.println("Playing with BoseSpeaker.");
    }
}
