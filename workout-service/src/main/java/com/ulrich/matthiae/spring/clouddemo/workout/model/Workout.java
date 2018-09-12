package com.ulrich.matthiae.spring.clouddemo.workout.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
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

    public Workout(Integer userId, LocalDateTime completionDate, WorkoutType workoutType, Duration duration, Intensity intensity, Integer caloriesBurned, Double temperatureCelcius, Integer humidityPercentage) {
        this.userId = userId;
        this.completionDate = completionDate;
        this.workoutType = workoutType;
        this.duration = duration;
        this.intensity = intensity;
        this.caloriesBurned = caloriesBurned;
        this.temperatureCelcius = temperatureCelcius;
        this.humidityPercentage = humidityPercentage;
    }
}
