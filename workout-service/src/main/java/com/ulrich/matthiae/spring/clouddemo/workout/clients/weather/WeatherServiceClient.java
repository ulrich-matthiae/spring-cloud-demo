package com.ulrich.matthiae.spring.clouddemo.workout.clients.weather;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "weather-service", url = "localhost:8201")
public interface WeatherServiceClient {

    @GetMapping("/weather/current")
    Weather getCurrentWeather();
}
