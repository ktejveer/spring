package com.eazybytes.eazyschool.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

    @GetMapping(value = {"", "/", "/home"})
    public String displayHomePage(){
        log.info("displayHomePage : Method started : HomeController");
        log.info("displayHomePage : Method end : HomeController");
        return "This is Home Controller";
    }
}
