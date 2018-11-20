package com.example.demo.repositories;

import com.example.demo.entities.Attendees;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface IAttendeesRepository extends CrudRepository<Attendees,Integer> {
    String sql1 = "SELECT * FROM attendees WHERE training_course_id =?1";
    @Query(value = sql1, nativeQuery = true)
   List<Attendees> findAllAttendeesByTrainingCourseId(int trainingId);

    String sql2 = "SELECT * FROM attendees WHERE ntid =?1";
    @Query(value = sql2, nativeQuery = true)
    Optional<Attendees> findAttendeeBasedOnNtid(String Ntid);

    Attendees findByNtid(String ntid);
}
