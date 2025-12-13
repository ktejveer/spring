package com.eazybytes.beans;

import com.eazybytes.beans.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MichelinTyres implements Tyres {

    @Override
    public void rotate() {
        System.out.println("Running with Micheline Tyres.");
    }
}
