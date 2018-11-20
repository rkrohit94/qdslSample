package com.example.demo.controllers;

import com.example.demo.entities.Feedbacks;
import com.example.demo.model.FeedbackModel;
import com.example.demo.services.FeedbacksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/feedbacks")
public class FeedbacksController {

    @Autowired
    private FeedbacksService feedbacksService;

    @RequestMapping(value = {"","/"}  , method = RequestMethod.POST)
    public Feedbacks approvalWorkFlow(@RequestBody FeedbackModel feedbackModel){
        return this.feedbacksService.saveFeedbacks(feedbackModel);
    }
}
