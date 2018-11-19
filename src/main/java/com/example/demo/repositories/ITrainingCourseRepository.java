package com.example.demo.repositories;

import com.example.demo.entities.TrainingCourse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ITrainingCourseRepository extends CrudRepository<TrainingCourse,Integer> {
    String sql1 = "SELECT Training_Course.* FROM Training_Course INNER JOIN Attendees\n" +
            "ON Training_Course.id = Attendees.training_course_id\n" +
            "WHERE ntid =?1";
    @Query(value = sql1, nativeQuery = true)
    List<TrainingCourse> findForNtid(String ntid);
}
