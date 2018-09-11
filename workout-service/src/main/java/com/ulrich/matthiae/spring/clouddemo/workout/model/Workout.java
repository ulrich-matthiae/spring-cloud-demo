package com.ulrich.matthiae.spring.clouddemo.workout.model;

import lombok.Data;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDateTime;

@Data
@Entity
public class Workout {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer userId;

    private LocalDateTime completionDate;

    @Enumerated(value = EnumType.STRING)
    private WorkoutType workoutType;

    private Duration duration;

    @Enumerated(value = EnumType.STRING)
    private Intensity intensity;

    private Integer caloriesBurned;

    private Double temperatureCelcius;

    private Integer humidityPercentage;
}
