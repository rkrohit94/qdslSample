package com.example.demo.model;

import java.util.List;

public class FeedbackModel {
    private int attendeesId;
    private List<ProgramEffectiveness> programEffectiveness;
    private List<FacilitatorEffectiveness> facilitatorEffectiveness;
    private String comments;
    private List<OverallRating> overallRating;

    public int getAttendeesId() {
        return attendeesId;
    }

    public void setAttendeesId(int attendeesId) {
        this.attendeesId = attendeesId;
    }

    public List<ProgramEffectiveness> getProgramEffectiveness() {
        return programEffectiveness;
    }

    public void setProgramEffectiveness(List<ProgramEffectiveness> programEffectiveness) {
        this.programEffectiveness = programEffectiveness;
    }

    public List<FacilitatorEffectiveness> getFacilitatorEffectiveness() {
        return facilitatorEffectiveness;
    }

    public void setFacilitatorEffectiveness(List<FacilitatorEffectiveness> facilitatorEffectiveness) {
        this.facilitatorEffectiveness = facilitatorEffectiveness;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<OverallRating> getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(List<OverallRating> overallRating) {
        this.overallRating = overallRating;
    }
}
