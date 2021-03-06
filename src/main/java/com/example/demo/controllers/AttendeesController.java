package com.example.demo.controllers;

import com.example.demo.entities.Attendees;
import com.example.demo.services.AttendeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Map;

@RestController
@RequestMapping(value = "/attendees")
public class AttendeesController {

    @Autowired
    private AttendeesService attendeesService;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = {"","/"} , method = RequestMethod.POST)
    public Attendees approvalWorkFlow(@RequestBody Attendees attendees){
        return this.attendeesService.saveAttendees(attendees);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/findAttendeeBasedOnNtid/{Ntid}", method = RequestMethod.GET)
    public Optional<Attendees> findAttendeeBasedOnNtid(@PathVariable String Ntid){
        return this.attendeesService.findAttendeeBasedOnNtid(Ntid);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = {"/mark-attendence"} , method = RequestMethod.POST)
    public Map<String,String> markAttendence(@RequestBody Attendees attendees, @RequestParam String passPharse){
        return this.attendeesService.markAttendence(attendees,passPharse);
    }
}
