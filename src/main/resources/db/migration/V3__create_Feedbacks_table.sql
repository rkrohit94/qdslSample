CREATE TABLE `feedbacks` (
  `id`                          INT           NOT NULL  AUTO_INCREMENT,
  `version`                     INT           NOT NULL  DEFAULT 0,
  `attendees_id`                INT           NOT NULL,
  `program_effectiveness`       VARCHAR(1000) NOT NULL,
  `facilitator_effectiveness`   VARCHAR(1000) NOT NULL,
  `comments`                    VARCHAR(1000) NOT NULL,
  `overall_rating`              VARCHAR(1000) NOT NULL,
  `created_date`                TIMESTAMP     NOT NULL  DEFAULT NOW(),
  `modified_date`               TIMESTAMP     NOT NULL  DEFAULT NOW(),
  PRIMARY KEY (`id`));