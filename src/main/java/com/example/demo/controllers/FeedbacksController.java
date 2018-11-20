package com.example.demo.controllers;

import com.example.demo.entities.Feedbacks;
import com.example.demo.model.FeedbackModel;
import com.example.demo.services.FeedbacksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/feedbacks")
@CrossOrigin(origins = "http://localhost:3000")
public class FeedbacksController {

    @Autowired
    private FeedbacksService feedbacksService;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = {"","/"}  , method = RequestMethod.POST)
    public Feedbacks approvalWorkFlow(@RequestBody FeedbackModel feedbackModel){
        return this.feedbacksService.saveFeedbacks(feedbackModel);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = {"/report/{trainingId}"}  , method = RequestMethod.GET)
    public List<Feedbacks> getFeedBack(@PathVariable int trainingId){
        return this.feedbacksService.getFeedBack(trainingId);
    }
}
