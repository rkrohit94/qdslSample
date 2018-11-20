package com.example.demo.controllers;

import com.example.demo.entities.Attendees;
import com.example.demo.entities.Person;
import com.example.demo.entities.TrainingCourse;
import com.example.demo.services.AttendeesService;
import com.example.demo.services.FeedbacksService;
import com.example.demo.services.TrainingCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TrainingCourseController {

    @Autowired
    private TrainingCourseService trainingCourseService;
    @Autowired
    private AttendeesService attendeesService;

    @Autowired
    private FeedbacksService feedbacksService;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/listTraining", method = RequestMethod.GET)
    public Iterable<TrainingCourse> findAllTraining(){
        return this.trainingCourseService.findAllTraining();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/markAttendence/{trainingId}", method = RequestMethod.GET)
    public String  findAllTraining(@PathVariable int trainingId){

        return this.attendeesService.sendMailForAttendence(trainingId);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/findTrainingByNtid/{ntid}", method = RequestMethod.GET)
    public TrainingCourse findAllTrainingByNtid(@PathVariable String ntid){
        return this.trainingCourseService.findForNtid(ntid);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/findTrainingCourseBasedOnId/{trainingId}", method = RequestMethod.GET)
    public Optional<TrainingCourse> findTrainingCourseBasedOnId(@PathVariable int trainingId){
        return this.trainingCourseService.findTrainingCourseBasedOnId(trainingId);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/sendfeedbackRequest/{trainingId}", method = RequestMethod.GET)
    public String  sendMail(@PathVariable int trainingId){
        return this.feedbacksService.sendMailForFeedback(trainingId);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/send-reminder/{trainingId}" , method = RequestMethod.GET)
    public String sendReminder(@PathVariable int trainingId){
        return this.attendeesService.sendMailForReminder(trainingId);
    }

}
