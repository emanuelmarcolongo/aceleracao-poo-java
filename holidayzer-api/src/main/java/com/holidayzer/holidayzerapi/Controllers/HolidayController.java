package com.holidayzer.holidayzerapi.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holidayzer.holidayzerapi.Holiday;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/holidays")
public class HolidayController {

    @GetMapping()
    public String getHollidays() {
        return Holiday.getAllHolidays();
    }

    @GetMapping("/{date}")
    public String checkHolliday(@PathVariable String date) {
        return Holiday.verifyHoliday(date);
    }

}
