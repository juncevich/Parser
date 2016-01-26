DROP DATABASE IF EXISTS resume_schema;
CREATE SCHEMA `resume_schema` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE IF NOT EXISTS `resume_schema`.`Category` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `rubric_number` INT NOT NULL ,
  `rubric_name` VARCHAR(45) NULL ,
  PRIMARY KEY (`id`) );

CREATE TABLE IF NOT EXISTS `resume_schema`.`Resume` (
  `resume_id` INT NOT NULL AUTO_INCREMENT,
  `id` TEXT  ,
  `category_id` TEXT NULL ,
  `owner_id` TEXT NULL,
  `wanted_salary` TEXT NULL,
  `age` TEXT NULL,
  `personal_qualities` TEXT NULL,
  `institution` TEXT NULL,
  `education_specialty` TEXT NULL,
  `education_description` TEXT NULL,
  `experience` TEXT NULL,
  `skills` TEXT NULL,
  PRIMARY KEY (`resume_id`) );
