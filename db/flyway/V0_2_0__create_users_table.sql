USE `flyway_sample`;
CREATE TABLE IF NOT EXISTS `users` (
  `user_id` BIGINT NOT NULL,
  `user_name` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`user_id`))
ENGINE = InnoDB;
