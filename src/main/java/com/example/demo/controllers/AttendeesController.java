package com.example.demo.controllers;

import com.example.demo.entities.Attendees;
import com.example.demo.services.AttendeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/attendees")
public class AttendeesController {

    @Autowired
    private AttendeesService attendeesService;

    @RequestMapping(value = {"","/"} , method = RequestMethod.POST)
    public Attendees approvalWorkFlow(@RequestBody Attendees attendees){
        return this.attendeesService.saveAttendees(attendees);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/findAttendeeBasedOnId/{attendeeId}", method = RequestMethod.GET)
    public Optional<Attendees> findAttendeeBasedOnId(@PathVariable int attendeeId){
        return this.attendeesService.findAttendeeBasedOnId(attendeeId);
    }
}
