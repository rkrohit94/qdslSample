package com.example.demo.controllers;

import com.example.demo.entities.Person;
import com.example.demo.entities.TrainingCourse;
import com.example.demo.services.TrainingCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TrainingCourseController {

    @Autowired
    private TrainingCourseService trainingCourseService;

    @RequestMapping(value = "/listTraining", method = RequestMethod.GET)
    public Iterable<TrainingCourse> findAllTraining(){
        return this.trainingCourseService.findAllTraining();
    }
}
