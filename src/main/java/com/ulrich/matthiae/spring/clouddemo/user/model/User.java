package com.ulrich.matthiae.spring.clouddemo.user.model;

import com.ulrich.matthiae.spring.clouddemo.workout.model.Workout;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    private String userName;

    private String name;

    private LocalDate dateOfBirth;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @OneToMany
    @JoinColumn(name = "workouts_id")
    private List<Workout> workouts;
}
