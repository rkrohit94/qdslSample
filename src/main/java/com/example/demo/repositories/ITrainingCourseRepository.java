package com.example.demo.repositories;

import com.example.demo.entities.TrainingCourse;
import org.springframework.data.repository.CrudRepository;

public interface ITrainingCourseRepository extends CrudRepository<TrainingCourse,Integer> {
}
