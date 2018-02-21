USE `flyway_sample`;
CREATE TABLE IF NOT EXISTS `corporates` (
  `corporate_id` BIGINT NOT NULL,
  `corporate_name` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`corporate_id`),
  UNIQUE INDEX `corporate_name_UNIQUE` (`corporate_name` ASC))
ENGINE = InnoDB;
