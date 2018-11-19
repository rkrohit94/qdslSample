CREATE TABLE `Feedbacks` (
  `id`                          INT           NOT NULL  AUTO_INCREMENT,
  `version`                     INT           NOT NULL  DEFAULT 0,
  `attendees_id`                INT           NOT NULL,
  `program_effectiveness`       INT           NOT NULL,
  `facilitator_effectiveness`   INT           NOT NULL,
  `comments`                    VARCHAR(500)  NOT NULL,
  `overall_rating`              INT           NOT NULL,
  `created_date`                TIMESTAMP     NOT NULL  DEFAULT NOW(),
  `modified_date`               TIMESTAMP     NOT NULL  DEFAULT NOW(),
  PRIMARY KEY (`id`));