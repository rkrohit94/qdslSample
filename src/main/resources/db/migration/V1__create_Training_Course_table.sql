CREATE TABLE `Training_Course` (
  `id`            INT           NOT NULL  AUTO_INCREMENT,
  `version`       INT           NOT NULL  DEFAULT 0,
  `training_name` VARCHAR(255)  NOT NULL,
  `capacity`      INT           NOT NULL,
  `training_date`  TIMESTAMP     NOT NULL,
  `passphrase`    VARCHAR(255)  NOT NULL,
  `created_date`  TIMESTAMP     NOT NULL  DEFAULT NOW(),
  `modified_date` TIMESTAMP     NOT NULL  DEFAULT NOW(),
  PRIMARY KEY (`id`));