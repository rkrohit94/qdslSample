package com.example.demo.entities;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "attendees")
public class Attendees {
    private int id;
    private int version;
    private String ntid;
    private String dcio;
    private int trainingCourseId;
    private Date attendenceTime;
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
    public String getNtid() {
        return ntid;
    }
    public void setNtid(String ntid) {
        this.ntid = ntid;
    }

    @NotNull
    public String getDcio() {
        return dcio;
    }
    public void setDcio(String dcio) {
        this.dcio = dcio;
    }

    @NotNull
    public int getTrainingCourseId() {
        return trainingCourseId;
    }
    public void setTrainingCourseId(int trainingCourseId) {
        this.trainingCourseId = trainingCourseId;
    }

    @NotNull
    public Date getAttendenceTime() {
        return attendenceTime;
    }
    public void setAttendenceTime(Date attendenceTime) {
        this.attendenceTime = attendenceTime;
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
