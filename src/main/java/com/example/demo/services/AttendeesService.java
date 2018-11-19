package com.example.demo.services;

import com.example.demo.entities.Attendees;
import com.example.demo.repositories.IAttendeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendeesService {

    @Autowired
    private IAttendeesRepository iAttendeesRepository;

    public Attendees saveAttendees(Attendees attendees){
        return this.iAttendeesRepository.save(attendees);
    }
}
