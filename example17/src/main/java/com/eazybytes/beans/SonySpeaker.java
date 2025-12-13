package com.eazybytes.beans;

import com.eazybytes.beans.interfaces.Speaker;
import com.eazybytes.model.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Primary
@Component
public class SonySpeaker implements Speaker {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public String makeSound(Song song) {
        logger.info("Playing " + song.getTitle() + " with SonySpeaker.");
        return song.getTitle();
    }
}
