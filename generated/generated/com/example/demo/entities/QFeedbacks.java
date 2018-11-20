package com.example.demo.entities;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QFeedbacks is a Querydsl query type for Feedbacks
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QFeedbacks extends EntityPathBase<Feedbacks> {

    private static final long serialVersionUID = -1993137029L;

    public static final QFeedbacks feedbacks = new QFeedbacks("feedbacks");

    public final NumberPath<Integer> attendeesId = createNumber("attendeesId", Integer.class);

    public final StringPath comments = createString("comments");

    public final DateTimePath<java.util.Date> createdDate = createDateTime("createdDate", java.util.Date.class);

    public final StringPath facilitatorEffectiveness = createString("facilitatorEffectiveness");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final DateTimePath<java.util.Date> modifiedDate = createDateTime("modifiedDate", java.util.Date.class);

    public final StringPath overallRating = createString("overallRating");

    public final StringPath programEffectiveness = createString("programEffectiveness");

    public final StringPath trainerName = createString("trainerName");

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QFeedbacks(String variable) {
        super(Feedbacks.class, forVariable(variable));
    }

    public QFeedbacks(Path<? extends Feedbacks> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFeedbacks(PathMetadata<?> metadata) {
        super(Feedbacks.class, metadata);
    }

}

