package com.example.demo.entities;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QTrainingCourse is a Querydsl query type for TrainingCourse
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTrainingCourse extends EntityPathBase<TrainingCourse> {

    private static final long serialVersionUID = 747894472L;

    public static final QTrainingCourse trainingCourse = new QTrainingCourse("trainingCourse");

    public final NumberPath<Integer> capacity = createNumber("capacity", Integer.class);

    public final DateTimePath<java.util.Date> createdDate = createDateTime("createdDate", java.util.Date.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final DateTimePath<java.util.Date> modifiedDate = createDateTime("modifiedDate", java.util.Date.class);

    public final StringPath passphrase = createString("passphrase");

    public final DateTimePath<java.util.Date> trainingDate = createDateTime("trainingDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> trainingEndTime = createDateTime("trainingEndTime", java.util.Date.class);

    public final StringPath trainingName = createString("trainingName");

    public final DateTimePath<java.util.Date> trainingStartTime = createDateTime("trainingStartTime", java.util.Date.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QTrainingCourse(String variable) {
        super(TrainingCourse.class, forVariable(variable));
    }

    public QTrainingCourse(Path<? extends TrainingCourse> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTrainingCourse(PathMetadata<?> metadata) {
        super(TrainingCourse.class, metadata);
    }

}

