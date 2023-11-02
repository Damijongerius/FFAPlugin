package com.dami.ffaplugin.LeaderBoard.Database;

public class sqlStrings {

    public static String init(String schema){
        return  "SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;\n" +
                "SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;\n" +
                "SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';\n" +
                "CREATE SCHEMA IF NOT EXISTS `"+ schema +"` DEFAULT CHARACTER SET utf8 ;\n" +
                "\n" +
                "USE `"+ schema +"` ;\n" +
                "\n" +
                "CREATE TABLE IF NOT EXISTS `"+ schema +"`.`MatchStats` (\n" +
                "  `time` DATETIME NOT NULL,\n" +
                "  `fair` TINYINT NULL,\n" +
                "  PRIMARY KEY (`time`))\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "CREATE TABLE IF NOT EXISTS `"+ schema +"`.`DeathHistory` (\n" +
                "  `UUID` CHAR(36) NOT NULL,\n" +
                "  `damageDone` FLOAT NULL,\n" +
                "  `MatchStats_time` DATETIME NOT NULL,\n" +
                "  PRIMARY KEY (`UUID`, `MatchStats_time`),\n" +
                "  INDEX `fk_DeathHistory_MatchStats1_idx` (`MatchStats_time` ASC) VISIBLE,\n" +
                "  CONSTRAINT `fk_DeathHistory_MatchStats1`\n" +
                "    FOREIGN KEY (`MatchStats_time`)\n" +
                "    REFERENCES `"+ schema +"`.`MatchStats` (`time`)\n" +
                "    ON DELETE NO ACTION\n" +
                "    ON UPDATE NO ACTION)\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "CREATE TABLE IF NOT EXISTS `"+ schema +"`.`killHistory` (\n" +
                "  `UUID` CHAR(36) NOT NULL,\n" +
                "  `damageDone` FLOAT NULL,\n" +
                "  `remainingHealth` FLOAT NULL,\n" +
                "  `MatchStats_time` DATETIME NOT NULL,\n" +
                "  PRIMARY KEY (`UUID`, `MatchStats_time`),\n" +
                "  INDEX `fk_killHistory_MatchStats1_idx` (`MatchStats_time` ASC) VISIBLE,\n" +
                "  CONSTRAINT `fk_killHistory_MatchStats1`\n" +
                "    FOREIGN KEY (`MatchStats_time`)\n" +
                "    REFERENCES `"+ schema +"`.`MatchStats` (`time`)\n" +
                "    ON DELETE NO ACTION\n" +
                "    ON UPDATE NO ACTION)\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "CREATE TABLE IF NOT EXISTS `"+ schema +"`.`assistHistory` (\n" +
                "  `UUID` CHAR(36) NOT NULL,\n" +
                "  `damageDone` FLOAT NULL,\n" +
                "  `MatchStats_time` DATETIME NOT NULL,\n" +
                "  PRIMARY KEY (`UUID`, `MatchStats_time`),\n" +
                "  INDEX `fk_assistHistory_MatchStats_idx` (`MatchStats_time` ASC) VISIBLE,\n" +
                "  CONSTRAINT `fk_assistHistory_MatchStats`\n" +
                "    FOREIGN KEY (`MatchStats_time`)\n" +
                "    REFERENCES `"+ schema +"`.`MatchStats` (`time`)\n" +
                "    ON DELETE NO ACTION\n" +
                "    ON UPDATE NO ACTION)\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "SET SQL_MODE=@OLD_SQL_MODE;\n" +
                "SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;\n" +
                "SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;";
    }

}
