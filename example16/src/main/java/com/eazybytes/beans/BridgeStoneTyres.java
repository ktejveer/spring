package com.eazybytes.beans;

import com.eazybytes.beans.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class BridgeStoneTyres implements Tyres {

    @Override
    public void rotate() {
        System.out.println("Running with BridgeStone Tyres.");
    }
}
