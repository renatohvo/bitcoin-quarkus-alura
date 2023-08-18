CREATE DATABASE IF NOT EXISTS bitcoin;
USE bitcoin;
CREATE TABLE IF NOT EXISTS `Usuario` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`nome` VARCHAR(255) NOT NULL,
	`cpf` VARCHAR(255) NOT NULL,
	`username` VARCHAR(255) NOT NULL,
	`password` VARCHAR(255) NOT NULL,
	`role` VARCHAR(55) NULL,
	PRIMARY KEY(`id`)) ENGINE=InnoDB;
	
CREATE TABLE IF NOT EXISTS `Ordem` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`preco` float(6,2) NOT NULL,
	`tipo` VARCHAR(255) NOT NULL,
	`data` timestamp NOT NULL,
	`status` VARCHAR(255) NOT NULL,
	`user_id` bigint NOT NULL,
	PRIMARY KEY (`id`),
	FOREIGN KEY (`user_id`) REFERENCES `Usuario` (`id`)) ENGINE=InnoDB;
