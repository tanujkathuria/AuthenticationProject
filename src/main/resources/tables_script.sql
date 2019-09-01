USE `authenticationDB`
;
/****** Object:  Table `User`    Script Date: 01-09-2019 16:29:09 ******/

insert into User (`UserEmail`,`Password`,`Roles`,`Organization`) values ('tanuj@gmail.com','tanuj','[1,2,3]','1');

CREATE TABLE `User`(
  `UserId` int AUTO_INCREMENT NOT NULL,
  `UserEmail` varchar(200) NULL,
  `Password` varchar(200) NULL,
  `Roles` varchar(200) NULL,
  `Organization` varchar(100) NULL,
  PRIMARY KEY (`UserId` ASC)
);
