package com.ulrich.matthiae.spring.clouddemo.workout.clients.weather;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Weather {
    private Double temperatureCelcius;
    private Integer humidityPercentage;
    private Integer portNumber;
}
