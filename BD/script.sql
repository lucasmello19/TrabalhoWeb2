-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema Web2
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Web2` ;

-- -----------------------------------------------------
-- Schema Web2
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Web2` DEFAULT CHARACTER SET latin1 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`tb_perfil`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`tb_perfil` ;

CREATE TABLE IF NOT EXISTS `mydb`.`tb_perfil` (
  `perfil_id` INT NOT NULL,
  `descricao` CHAR(1) NOT NULL,
  PRIMARY KEY (`perfil_id`),
  UNIQUE INDEX `perfil_id_UNIQUE` (`perfil_id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`tb_login`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`tb_login` ;

CREATE TABLE IF NOT EXISTS `mydb`.`tb_login` (
  `login_id` INT NOT NULL,
  `senha` VARCHAR(15) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`login_id`),
  UNIQUE INDEX `login_id_UNIQUE` (`login_id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`tb_estado`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`tb_estado` ;

CREATE TABLE IF NOT EXISTS `mydb`.`tb_estado` (
  `estado_id` INT NOT NULL,
  `sigla` CHAR(2) NULL,
  `nome` VARCHAR(100) NULL,
  PRIMARY KEY (`estado_id`),
  UNIQUE INDEX `estado_id_UNIQUE` (`estado_id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`tb_cidade`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`tb_cidade` ;

CREATE TABLE IF NOT EXISTS `mydb`.`tb_cidade` (
  `cidade_id` INT NOT NULL,
  `nome` VARCHAR(100) NULL,
  `fk_estado_id` INT NOT NULL,
  PRIMARY KEY (`cidade_id`, `fk_estado_id`),
  UNIQUE INDEX `cidade_id_UNIQUE` (`cidade_id` ASC),
  INDEX `fk_tb_cidade_tb_estado1_idx` (`fk_estado_id` ASC),
  CONSTRAINT `fk_tb_cidade_tb_estado1`
    FOREIGN KEY (`fk_estado_id`)
    REFERENCES `mydb`.`tb_estado` (`estado_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`tb_usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`tb_usuario` ;

CREATE TABLE IF NOT EXISTS `mydb`.`tb_usuario` (
  `user_id` INT NOT NULL,
  `nome_completo` VARCHAR(100) NOT NULL,
  `cpf` VARCHAR(15) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `rua` VARCHAR(45) NOT NULL,
  `numero` INT NOT NULL,
  `bairro` VARCHAR(45) NOT NULL,
  `cep` VARCHAR(45) NOT NULL,
  `complemento` VARCHAR(45) NOT NULL,
  `telefone` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  `fk_perfil_id` INT NOT NULL,
  `fk_login_id` INT NOT NULL,
  `fk_cidade_id` INT NOT NULL,
  `fk_estado_id` INT NOT NULL,
  PRIMARY KEY (`user_id`, `fk_perfil_id`, `fk_login_id`, `fk_cidade_id`, `fk_estado_id`),
  INDEX `fk_tb_usuario_tb_perfil1_idx` (`fk_perfil_id` ASC),
  INDEX `fk_tb_usuario_tb_login1_idx` (`fk_login_id` ASC),
  UNIQUE INDEX `user_id_UNIQUE` (`user_id` ASC),
  INDEX `fk_tb_usuario_tb_cidade1_idx` (`fk_cidade_id` ASC, `fk_estado_id` ASC),
  CONSTRAINT `fk_tb_usuario_tb_perfil1`
    FOREIGN KEY (`fk_perfil_id`)
    REFERENCES `mydb`.`tb_perfil` (`perfil_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_usuario_tb_login1`
    FOREIGN KEY (`fk_login_id`)
    REFERENCES `mydb`.`tb_login` (`login_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_usuario_tb_cidade1`
    FOREIGN KEY (`fk_cidade_id` , `fk_estado_id`)
    REFERENCES `mydb`.`tb_cidade` (`cidade_id` , `fk_estado_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`tb_categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`tb_categoria` ;

CREATE TABLE IF NOT EXISTS `mydb`.`tb_categoria` (
  `categ_id` INT NOT NULL,
  `nome` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`categ_id`),
  UNIQUE INDEX `categ_id_UNIQUE` (`categ_id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`tb_produto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`tb_produto` ;

CREATE TABLE IF NOT EXISTS `mydb`.`tb_produto` (
  `produto_id` INT NOT NULL,
  `descricao` VARCHAR(100) NULL,
  `peso` INT NOT NULL,
  `fk_categ_id` INT NOT NULL,
  `nome` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`produto_id`, `fk_categ_id`),
  INDEX `fk_tb_produto_tb_categoria1_idx` (`fk_categ_id` ASC),
  UNIQUE INDEX `produto_id_UNIQUE` (`produto_id` ASC),
  CONSTRAINT `fk_tb_produto_tb_categoria1`
    FOREIGN KEY (`fk_categ_id`)
    REFERENCES `mydb`.`tb_categoria` (`categ_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`tb_tipo_atendimento`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`tb_tipo_atendimento` ;

CREATE TABLE IF NOT EXISTS `mydb`.`tb_tipo_atendimento` (
  `tipo_atend_id` INT NOT NULL,
  `nome` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`tipo_atend_id`),
  UNIQUE INDEX `tipoAtend_id_UNIQUE` (`tipo_atend_id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`tb_atendimento`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`tb_atendimento` ;

CREATE TABLE IF NOT EXISTS `mydb`.`tb_atendimento` (
  `atendimento_id` INT NOT NULL,
  `dataHora_inicio` DATETIME NOT NULL,
  `fk_tipoAtend_id` INT NOT NULL,
  `fk_user_id` INT NOT NULL,
  `fk_perfil_id` INT NOT NULL,
  `fk_login_id` INT NOT NULL,
  `situacao` CHAR(1) NOT NULL,
  `fk_produto_id` INT NOT NULL,
  `fk_categ_id` INT NOT NULL,
  `descricao` VARCHAR(150) NOT NULL,
  `solucao` VARCHAR(100) NOT NULL,
  `dataHora_fim` DATETIME NULL,
  PRIMARY KEY (`atendimento_id`, `fk_tipoAtend_id`, `fk_user_id`, `fk_perfil_id`, `fk_login_id`, `fk_produto_id`, `fk_categ_id`, `solucao`),
  INDEX `fk_tb_atendimento_tb_tipoAtendimento_idx` (`fk_tipoAtend_id` ASC),
  INDEX `fk_tb_atendimento_tb_usuario1_idx` (`fk_user_id` ASC, `fk_perfil_id` ASC, `fk_login_id` ASC),
  INDEX `fk_tb_atendimento_tb_produto1_idx` (`fk_produto_id` ASC, `fk_categ_id` ASC),
  UNIQUE INDEX `atendimento_id_UNIQUE` (`atendimento_id` ASC),
  CONSTRAINT `fk_tb_atendimento_tb_tipoAtendimento`
    FOREIGN KEY (`fk_tipoAtend_id`)
    REFERENCES `mydb`.`tb_tipo_atendimento` (`tipo_atend_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_atendimento_tb_usuario1`
    FOREIGN KEY (`fk_user_id` , `fk_perfil_id` , `fk_login_id`)
    REFERENCES `mydb`.`tb_usuario` (`user_id` , `fk_perfil_id` , `fk_login_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_atendimento_tb_produto1`
    FOREIGN KEY (`fk_produto_id` , `fk_categ_id`)
    REFERENCES `mydb`.`tb_produto` (`produto_id` , `fk_categ_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `Web2` ;

-- -----------------------------------------------------
-- Table `Web2`.`tb_usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Web2`.`tb_usuario` ;

CREATE TABLE IF NOT EXISTS `Web2`.`tb_usuario` (
  `id_usuario` INT(11) NOT NULL AUTO_INCREMENT,
  `login_usuario` VARCHAR(50) NOT NULL,
  `senha_usuario` VARCHAR(45) NOT NULL,
  `nome_usuario` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;