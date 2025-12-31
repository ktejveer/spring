package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Holiday;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HolidayController {

    @GetMapping("/holidays")
    public List<Holiday> displayHolidays(){
        List<Holiday> holidays = Arrays.asList(
            new Holiday("Jan 1", "New Year's Day", Holiday.Type.FESTIVAL),
                new Holiday("Oct 31", "Halloween", Holiday.Type.FESTIVAL),
                new Holiday("Nov 24", "Thanksgiving Day", Holiday.Type.FESTIVAL),
                new Holiday("Dec 25", "Christmas", Holiday.Type.FESTIVAL),
                new Holiday("Jan 17", "Martin Luther King Jr. Day", Holiday.Type.FEDERAL),
                new Holiday("July 4", "Independence Day", Holiday.Type.FEDERAL),
                new Holiday("Sept 5", "Labor Day", Holiday.Type.FEDERAL),
                new Holiday("Nov 11", "Veterans Day", Holiday.Type.FEDERAL)
        );
        return holidays;
    }
}
