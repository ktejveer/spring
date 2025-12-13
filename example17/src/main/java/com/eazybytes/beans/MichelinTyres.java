package com.eazybytes.beans;

import com.eazybytes.beans.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Primary
@Component
public class MichelinTyres implements Tyres {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public String rotate() {
        logger.info("Running with Micheline Tyres.");
        return "Rotating Micheline Tyres.";
    }
}
