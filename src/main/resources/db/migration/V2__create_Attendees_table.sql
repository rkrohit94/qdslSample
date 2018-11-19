CREATE TABLE `Attendees` (
  `id`                 INT           NOT NULL  AUTO_INCREMENT,
  `version`            INT           NOT NULL  DEFAULT 0,
  `ntid`               VARCHAR(255)  NOT NULL,
  `dcio`               VARCHAR(255)  NOT NULL,
  `training_course_id` INT           NOT NULL,
  `attendence_time`    TIMESTAMP     NULL,
  `created_date`       TIMESTAMP     NOT NULL  DEFAULT NOW(),
  `modified_date`      TIMESTAMP     NOT NULL  DEFAULT NOW(),
  PRIMARY KEY (`id`));