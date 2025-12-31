package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Holiday;
import com.eazybytes.eazyschool.service.HolidayServic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
public class HolidayController {

    @Autowired
    private HolidayServic holidayServic;

    @GetMapping("/holidays")
    public List<Holiday> displayHolidays(@RequestParam(required = false) boolean federal, @RequestParam(required = false) boolean festival){
        log.info("displayHolidays : Method started : HolidayController");
        log.info("displayHolidays : Method end : HolidayController");
        return holidayServic.getHolidays(federal, festival);
    }

    @GetMapping("/holidays/{display}")
    public List<Holiday> displayHolidays(@PathVariable String display){
        log.info("displayHolidays with path variable : Method started : HolidayController");
        log.info("displayHolidays with path variable : Method end : HolidayController");
        if(display.equalsIgnoreCase("all")){
            return holidayServic.getHolidays(true, true);
        }

        if(display.equalsIgnoreCase("federal")){
            return holidayServic.getHolidays(true, false);
        }

        if(display.equalsIgnoreCase("festival")){
            return holidayServic.getHolidays(false, true);
        }
        return new ArrayList<>();
    }
}
