package com.example.demo.repositories;

import com.example.demo.entities.Feedbacks;
import org.springframework.data.repository.CrudRepository;

public interface IFeedbacksRepository extends CrudRepository<Feedbacks,Integer> {
}
