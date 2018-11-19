CREATE TABLE `Persons` (
  `id`            INT           NOT NULL  AUTO_INCREMENT,
  `version`       INT           NOT NULL  DEFAULT 0,
  `first_name`    VARCHAR(255)  NOT NULL,
  `last_name`     VARCHAR(255)  NOT NULL,
  `age`           INT           NOT NULL,
  `city`          VARCHAR(255)  NOT NULL,
  `gender`        VARCHAR(255)  NOT NULL,
  `email`         VARCHAR(255)  NOT NULL,
  `created_date`  TIMESTAMP     NOT NULL  DEFAULT NOW(),
  `modified_date` TIMESTAMP     NOT NULL  DEFAULT NOW(),
  PRIMARY KEY (`id`));