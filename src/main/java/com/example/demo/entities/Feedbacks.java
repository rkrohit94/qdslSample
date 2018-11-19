package com.example.demo.entities;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "Feedbacks")
public class Feedbacks {
    private int id;
    private int version;
    private int attendeesId;
    private int programEffectiveness;
    private int facilitatorEffectiveness;
    private String comments;
    private int overallRating;
    private Date createdDate;
    private Date modifiedDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Version
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }

    @NotNull
    public int getAttendeesId() {
        return attendeesId;
    }
    public void setAttendeesId(int attendeesId) {
        this.attendeesId = attendeesId;
    }

    @NotNull
    public int getProgramEffectiveness() {
        return programEffectiveness;
    }
    public void setProgramEffectiveness(int programEffectiveness) {
        this.programEffectiveness = programEffectiveness;
    }

    @NotNull
    public int getFacilitatorEffectiveness() {
        return facilitatorEffectiveness;
    }
    public void setFacilitatorEffectiveness(int facilitatorEffectiveness) {
        this.facilitatorEffectiveness = facilitatorEffectiveness;
    }

    @NotNull
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }

    @NotNull
    public int getOverallRating() {
        return overallRating;
    }
    public void setOverallRating(int overallRating) {
        this.overallRating = overallRating;
    }

    @CreationTimestamp
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @UpdateTimestamp
    public Date getModifiedDate() {
        return modifiedDate;
    }
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
