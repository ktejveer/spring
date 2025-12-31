package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.model.Holiday;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class HolidayServic {

    public List<Holiday> getHolidays(boolean federal, boolean festival){
        log.info("getHolidays : method started : HolidayServic");
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

        log.info("getHolidays : method end : HolidayServic");
        if(federal == true && festival==true){
            return holidays;
        }
        if(federal == true){
            return holidays.stream().filter(holiday-> holiday.getType() == Holiday.Type.FEDERAL).collect(Collectors.toList());
        }

        if(festival == true){
            return holidays.stream().filter(holiday-> holiday.getType() == Holiday.Type.FESTIVAL).collect(Collectors.toList());
        }
        return new ArrayList<>();

//        throw new RuntimeException("Flow is failing to test global exception handling logic");
    }
}
