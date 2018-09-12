package com.ulrich.matthiae.spring.clouddemo;

import com.ulrich.matthiae.spring.clouddemo.workout.WorkoutRepository;
import com.ulrich.matthiae.spring.clouddemo.workout.model.Intensity;
import com.ulrich.matthiae.spring.clouddemo.workout.model.Workout;
import com.ulrich.matthiae.spring.clouddemo.workout.model.WorkoutType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DataLoader implements ApplicationRunner {
    private final WorkoutRepository workoutRepository;

    @Autowired
    public DataLoader(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        workoutRepository.save(new Workout(
                1,
                LocalDateTime.parse("2018-06-08 15:35:39", formatter),
                WorkoutType.RUNNING,
                Duration.parse("PT1H30M"),
                Intensity.MEDIUM,
                598,
                25.0,
                63));

        workoutRepository.save(new Workout(
                1,
                LocalDateTime.parse("2018-06-09 17:42:30", formatter),
                WorkoutType.CYCLING,
                Duration.parse("PT2H30M"),
                Intensity.LOW,
                698,
                32.0,
                88));
    }
}
