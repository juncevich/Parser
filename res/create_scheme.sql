CREATE SCHEMA `resume_schema` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE IF NOT EXISTS `resume_schema`.`Category` (
`id` INT NOT NULL AUTO_INCREMENT ,
`rubric_number` INT NOT NULL ,
`rubric_name` VARCHAR(45) NULL ,
PRIMARY KEY (`id`) );

CREATE TABLE IF NOT EXISTS `resume_schema`.`Resume` (
`id` INT NOT NULL AUTO_INCREMENT ,
`resume_name` VARCHAR(45) NULL ,,
`enrolment_date` DATE NULL ,
`category_id` INT ,
PRIMARY KEY (`id`) );