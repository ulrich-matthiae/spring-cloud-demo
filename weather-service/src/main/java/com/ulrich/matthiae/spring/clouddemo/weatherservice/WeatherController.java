package com.ulrich.matthiae.spring.clouddemo.weatherservice;

import com.ulrich.matthiae.spring.clouddemo.weatherservice.models.Weather;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/weather")
public class WeatherController {

    @RequestMapping(value = "/current", method = RequestMethod.GET)
    public Weather getCurrentWeather() {
        return new Weather(26.5, 52);
    }
}
