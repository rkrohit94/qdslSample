package com.example.demo.repositories;

import com.example.demo.entities.TrainingCourse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ITrainingCourseRepository extends CrudRepository<TrainingCourse,Integer> {

    String sql1 = "SELECT training_course.* FROM training_course INNER JOIN attendees\n" +
            "ON training_course.id = attendees.training_course_id\n" +
            "WHERE ntid =?1 and training_start_time <= now() AND  training_end_time >= now()";
    @Query(value = sql1, nativeQuery = true)
    TrainingCourse findForNtid(String ntid);
}
