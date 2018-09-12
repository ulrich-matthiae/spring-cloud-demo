package com.ulrich.matthiae.spring.clouddemo.workout.clients.weather;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.web.server.LocalServerPort;

@Data
@NoArgsConstructor
public class Weather {
    private Double temperatureCelcius;
    private Integer humidityPercentage;
    private Integer portNumber;
}
