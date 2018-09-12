package com.ulrich.matthiae.spring.clouddemo.weatherservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.web.server.LocalServerPort;

@Data
@AllArgsConstructor
public class Weather {
    private Double temperatureCelcius;
    private Integer humidityPercentage;
    private String portNumber;
}
