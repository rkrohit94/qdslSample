CREATE TABLE `training_course` (
  `id`                  INT           NOT NULL  AUTO_INCREMENT,
  `version`             INT           NOT NULL  DEFAULT 0,
  `training_name`       VARCHAR(255)  NOT NULL,
  `capacity`            INT           NOT NULL,
  `training_date`       TIMESTAMP     NOT NULL,
  `training_start_time` TIMESTAMP     NULL      DEFAULT NULL,
  `training_end_time`   TIMESTAMP     NULL      DEFAULT NULL,
  `passphrase`          VARCHAR(255)  NOT NULL,
  `created_date`        TIMESTAMP     NOT NULL  DEFAULT NOW(),
  `modified_date`       TIMESTAMP     NOT NULL  DEFAULT NOW(),
  PRIMARY KEY (`id`));