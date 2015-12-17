CREATE SCHEMA `resume_schema` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE IF NOT EXISTS `resume_schema`.`Category` (
`id` INT NOT NULL AUTO_INCREMENT ,
`rubric_number` INT NOT NULL ,
`rubric_name` VARCHAR(45) NULL ,
PRIMARY KEY (`id`) );

CREATE TABLE IF NOT EXISTS `resume_schema`.`Resume` (
`id` INT NOT NULL AUTO_INCREMENT ,
`resume_name` VARCHAR(45) NULL ,
`enrolment_date` DATE NULL ,
`category_id` INT ,
`owner_id` INT,
`wanted_salary` INT,
`age` INT,
`personal_qualities` VARCHAR(45) NULL,
`institution` VARCHAR(45) NULL,
`education_specialty` VARCHAR(45) NULL,
`education_description` VARCHAR(45) NULL,
`experience` VARCHAR(45) NULL,
`skills` VARCHAR(45) NULL,
PRIMARY KEY (`id`) );