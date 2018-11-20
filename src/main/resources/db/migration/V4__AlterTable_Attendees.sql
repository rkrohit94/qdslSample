ALTER TABLE attendees ADD CONSTRAINT fk_training_course_id  FOREIGN KEY (training_course_id)  REFERENCES training_course(id);
ALTER TABLE feedbacks ADD CONSTRAINT fk_attendees_id  FOREIGN KEY (attendees_id)  REFERENCES attendees(id);