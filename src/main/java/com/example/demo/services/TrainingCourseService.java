package com.example.demo.services;

import com.example.demo.entities.TrainingCourse;
import com.example.demo.repositories.ITrainingCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainingCourseService {
    @Autowired
    private ITrainingCourseRepository trainingCourseRepository;

    public TrainingCourse saveTraining(TrainingCourse trainingCourse){
        return this.trainingCourseRepository.save(trainingCourse);
    }

    public TrainingCourse findForNtid(String ntid){
        return this.trainingCourseRepository.findForNtid(ntid);
    }
    public Iterable<TrainingCourse> findAllTraining(){
        return this.trainingCourseRepository.findAll();
    }

    public Optional<TrainingCourse> findTrainingCourseBasedOnId(int trainingId) {
        return this.trainingCourseRepository.findById(trainingId);
    }
}
