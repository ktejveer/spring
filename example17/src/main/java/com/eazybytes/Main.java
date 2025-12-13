package com.eazybytes;

import com.eazybytes.services.VehicleService;
import com.eazybytes.config.ProjectConfig;
import com.eazybytes.model.Song;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicleService = context.getBean(VehicleService.class);
        System.out.println(vehicleService.getClass());
        Song song = new Song();
        song.setTitle("Tere Bina");
        song.setSingerName("Annu Malik");

        boolean vehicleStarted = true;
        String moveVehicleStatus = vehicleService.moveVehicle(vehicleStarted);
        String playMusicStatus = vehicleService.playMusic(vehicleStarted, song);
        String applyBreaks = vehicleService.applyBreak(vehicleStarted);
    }
}