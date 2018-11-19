package com.example.demo.entities;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "Training_Course")
public class TrainingCourse {
    private int id;
    private int version;
    private String trainingName;
    private int capacity;
    private Date trainingDate;
    private String passphrase;
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
    public String getTrainingName() {
        return trainingName;
    }
    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    @NotNull
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @NotNull
    public Date getTrainingDate() {
        return trainingDate;
    }
    public void setTrainingDate(Date trainingDate) {
        this.trainingDate = trainingDate;
    }

    @NotNull
    public String getPassphrase() {
        return passphrase;
    }
    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
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
