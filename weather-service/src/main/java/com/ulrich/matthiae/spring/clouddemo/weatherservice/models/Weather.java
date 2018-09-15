package com.ulrich.matthiae.spring.clouddemo.weatherservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Weather {
    private Double temperatureCelcius;
    private Integer humidityPercentage;
    private Integer portNumber;
}
