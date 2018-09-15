package com.ulrich.matthiae.spring.clouddemo.weatherservice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ulrich.matthiae.spring.clouddemo.weatherservice.models.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/weather")
public class WeatherController {

    private final Environment environment;

    @Autowired
    public WeatherController(Environment environment) {
        this.environment = environment;
    }

    @RequestMapping(value = "/current", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "fetchDefaultWeather")
    public Weather getCurrentWeather() {
        LocalDateTime now = LocalDateTime.now();

        BigDecimal temperatureCelcius = new BigDecimal(now.getSecond() / 1.5D).setScale(1, RoundingMode.HALF_UP);
        int humidityPercentage = now.getMinute();
        Integer localServerPort = Integer.parseInt(environment.getProperty("local.server.port"));

        return new Weather(temperatureCelcius.doubleValue(), humidityPercentage, localServerPort);
    }

    private Weather fetchDefaultWeather() {
        return new Weather(25.0, 50, 0);
    }
}
