package com.ulrich.matthiae.spring.clouddemo.workout;

import com.ulrich.matthiae.spring.clouddemo.workout.clients.weather.Weather;
import com.ulrich.matthiae.spring.clouddemo.workout.clients.weather.WeatherServiceClient;
import com.ulrich.matthiae.spring.clouddemo.workout.model.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URI;
import java.time.LocalDateTime;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RepositoryRestController
public class WorkoutController {
    private final WorkoutRepository workoutRepository;
    private final WeatherServiceClient weatherServiceClient;

    @Autowired
    public WorkoutController(WorkoutRepository workoutRepository, WeatherServiceClient weatherServiceClient) {
        this.workoutRepository = workoutRepository;
        this.weatherServiceClient = weatherServiceClient;
    }

    @RequestMapping(method = POST, value = "/workouts")
    public ResponseEntity<?> createWorkout(@RequestBody Workout workout) {
        Weather currentWeather = weatherServiceClient.getCurrentWeather();

        workout.setTemperatureCelcius(currentWeather.getTemperatureCelcius());
        workout.setHumidityPercentage(currentWeather.getHumidityPercentage());
        workout.setPortNumber(currentWeather.getPortNumber());
        workout.setCompletionDate(LocalDateTime.now());

        Workout createdWorkout = workoutRepository.save(workout);
        return ResponseEntity.created(URI.create("/workouts/" + createdWorkout.getId())).build();
    }
}
