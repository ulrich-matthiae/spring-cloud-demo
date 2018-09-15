package com.ulrich.matthiae.spring.clouddemo.workout.clients.weather;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "zuul-server")
@RibbonClient(name = "weather-service")
public interface WeatherServiceClient {

    @GetMapping("/weather-service/weather/current")
    Weather getCurrentWeather();
}
