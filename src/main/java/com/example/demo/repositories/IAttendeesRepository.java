package com.example.demo.repositories;

import com.example.demo.entities.Attendees;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IAttendeesRepository extends CrudRepository<Attendees,Integer> {
    String sql1 = "SELECT * FROM Attendees WHERE training_course_id =?1";
    @Query(value = sql1, nativeQuery = true)
   List<Attendees> findAllAttendeesByTrainingCourseId(int trainingId);
}
