package com.example.demo.services;

import com.example.demo.entities.Feedbacks;
import com.example.demo.model.FacilitatorEffectiveness;
import com.example.demo.model.FeedbackModel;
import com.example.demo.model.OverallRating;
import com.example.demo.model.ProgramEffectiveness;
import com.example.demo.repositories.IFeedbacksRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbacksService {
    @Autowired
    private IFeedbacksRepository iFeedbacksRepository;

    public Feedbacks saveFeedbacks(FeedbackModel feedbackModel){

        Feedbacks feedbacks = new Feedbacks();

        feedbacks.setAttendeesId(feedbackModel.getAttendeesId());
        feedbacks.setComments(feedbackModel.getComments());
        feedbacks.setFacilitatorEffectiveness(ConvertArrayToJSONStringFacilitatorEffectiveness(feedbackModel.getFacilitatorEffectiveness()));
        feedbacks.setOverallRating(ConvertArrayToJSONStringOverallRating(feedbackModel.getOverallRating()));
        feedbacks.setProgramEffectiveness(ConvertArrayToJSONStringProgramEffectiveness(feedbackModel.getProgramEffectiveness()));
        feedbacks.setTrainerName(feedbackModel.getTrainerName());
        return this.iFeedbacksRepository.save(feedbacks);
    }

    private String ConvertArrayToJSONStringFacilitatorEffectiveness(List<FacilitatorEffectiveness> listOfObject) {

        String json = "";

        try {

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        json = ow.writeValueAsString(listOfObject);
        }catch (Exception ex) {
            ex.printStackTrace();
        }

        return json;
    }

    private String ConvertArrayToJSONStringProgramEffectiveness(List<ProgramEffectiveness> listOfObject) {

        String json = "";

        try {

            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            json = ow.writeValueAsString(listOfObject);
        }catch (Exception ex) {
            ex.printStackTrace();
        }

        return json;
    }

    private String ConvertArrayToJSONStringOverallRating(List<OverallRating> overallRatings) {
        String json = "";

        try {

            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            json = ow.writeValueAsString(overallRatings);
        }catch (Exception ex) {
            ex.printStackTrace();
        }

        return json;
    }
}
