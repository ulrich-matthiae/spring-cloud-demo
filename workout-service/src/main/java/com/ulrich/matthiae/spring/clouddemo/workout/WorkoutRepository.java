package com.ulrich.matthiae.spring.clouddemo.workout;

import com.ulrich.matthiae.spring.clouddemo.workout.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Integer> {

    @RestResource
    List<Workout> findAllByUserId(@Param("userId") Integer userId);
}
