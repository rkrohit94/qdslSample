package com.example.demo.repositories;

import com.example.demo.entities.Feedbacks;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IFeedbacksRepository extends CrudRepository<Feedbacks,Integer> {

    String sql1 = "SELECT feedbacks.* FROM feedbacks, attendees,training_course\n" +
            "WHERE feedbacks.attendees_id = attendees.id\n" +
            "AND attendees.training_course_id = training_course.id\n" +
            "AND training_course_id =?1";
    @Query(value = sql1, nativeQuery = true)
    List<Feedbacks> getFeedBack(int trainingId);
}
