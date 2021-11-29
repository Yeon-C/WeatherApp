package com.tts.weatherapp.controller;

import com.tts.weatherapp.domain.Response;
import com.tts.weatherapp.service.WeatherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    //get request
    @GetMapping("/") //index endpoint
    public String getIndex(Model model){
        Response response = weatherService.getForecast("30308");
        model.addAttribute(("data"), response);
        return "index";
    }
}

















