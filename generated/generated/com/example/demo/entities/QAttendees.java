package com.example.demo.entities;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAttendees is a Querydsl query type for Attendees
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAttendees extends EntityPathBase<Attendees> {

    private static final long serialVersionUID = -705992218L;

    public static final QAttendees attendees = new QAttendees("attendees");

    public final DateTimePath<java.util.Date> attendenceTime = createDateTime("attendenceTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> createdDate = createDateTime("createdDate", java.util.Date.class);

    public final StringPath dcio = createString("dcio");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final DateTimePath<java.util.Date> modifiedDate = createDateTime("modifiedDate", java.util.Date.class);

    public final StringPath ntid = createString("ntid");

    public final NumberPath<Integer> trainingCourseId = createNumber("trainingCourseId", Integer.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QAttendees(String variable) {
        super(Attendees.class, forVariable(variable));
    }

    public QAttendees(Path<? extends Attendees> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAttendees(PathMetadata<?> metadata) {
        super(Attendees.class, metadata);
    }

}

