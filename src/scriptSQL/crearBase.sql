-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema seguridad
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema seguridad
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `seguridad` DEFAULT CHARACTER SET utf8 ;
USE `seguridad` ;

-- -----------------------------------------------------
-- Table `seguridad`.`Funciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `seguridad`.`Funciones` (
  `idFunciones` INT NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idFunciones`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `seguridad`.`Roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `seguridad`.`Roles` (
  `idRoles` INT NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idRoles`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `seguridad`.`RolesFunciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `seguridad`.`RolesFunciones` (
  `idRolesFunciones` INT NOT NULL,
  `Funciones_idFunciones` INT NOT NULL,
  `Roles_idRoles` INT NOT NULL,
  PRIMARY KEY (`idRolesFunciones`),
  INDEX `fk_RolesFunciones_Funciones_idx` (`Funciones_idFunciones` ASC) ,
  INDEX `fk_RolesFunciones_Roles1_idx` (`Roles_idRoles` ASC) ,
  CONSTRAINT `fk_RolesFunciones_Funciones`
    FOREIGN KEY (`Funciones_idFunciones`)
    REFERENCES `seguridad`.`Funciones` (`idFunciones`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_RolesFunciones_Roles1`
    FOREIGN KEY (`Roles_idRoles`)
    REFERENCES `seguridad`.`Roles` (`idRoles`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `seguridad`.`Usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `seguridad`.`Usuarios` (
  `idUsuarios` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `user` VARCHAR(45) NOT NULL,
  `pass` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUsuarios`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `seguridad`.`UsuariosRoles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `seguridad`.`UsuariosRoles` (
  `idUsuariosRoles` INT NOT NULL,
  `Usuarios_idUsuarios` INT NOT NULL,
  `Roles_idRoles` INT NOT NULL,
  PRIMARY KEY (`idUsuariosRoles`),
  INDEX `fk_UsuariosRoles_Usuarios1_idx` (`Usuarios_idUsuarios` ASC) ,
  INDEX `fk_UsuariosRoles_Roles1_idx` (`Roles_idRoles` ASC) ,
  CONSTRAINT `fk_UsuariosRoles_Usuarios1`
    FOREIGN KEY (`Usuarios_idUsuarios`)
    REFERENCES `seguridad`.`Usuarios` (`idUsuarios`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_UsuariosRoles_Roles1`
    FOREIGN KEY (`Roles_idRoles`)
    REFERENCES `seguridad`.`Roles` (`idRoles`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
