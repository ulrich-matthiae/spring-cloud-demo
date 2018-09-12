package com.ulrich.matthiae.spring.clouddemo.workout.clients.weather;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "weather-service")
@RibbonClient(name = "weather-service")
public interface WeatherServiceClient {

    @GetMapping("/weather/current")
    Weather getCurrentWeather();
}
