package com.example.demo.services;

import com.example.demo.entities.Feedbacks;
import com.example.demo.repositories.IFeedbacksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbacksService {
    @Autowired
    private IFeedbacksRepository iFeedbacksRepository;

    public Feedbacks saveFeedbacks(Feedbacks attendees){
        return this.iFeedbacksRepository.save(attendees);
    }
}
