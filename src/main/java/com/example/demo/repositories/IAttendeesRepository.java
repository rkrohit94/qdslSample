package com.example.demo.repositories;

import com.example.demo.entities.Attendees;
import org.springframework.data.repository.CrudRepository;

public interface IAttendeesRepository extends CrudRepository<Attendees,Integer> {
}
