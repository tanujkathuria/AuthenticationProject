USE `authenticationDB`
;
/****** Object:  Table `User`    Script Date: 01-09-2019 16:29:09 ******/
/**http://localhost:8080/login?user=tanuj@gmail.com&pass=tanuj**/

insert into User (`UserEmail`,`Password`,`Roles`,`Organization`) values ('tanuj@gmail.com','tanuj','[1,2,3]','1');

CREATE TABLE `User`(
  `UserId` int AUTO_INCREMENT NOT NULL,
  `UserEmail` varchar(200) NULL,
  `Password` varchar(200) NULL,
  `Roles` varchar(200) NULL,
  `Organization` varchar(100) NULL,
  PRIMARY KEY (`UserId` ASC)
);

/****** Object:  Table `Roles`    Script Date: 01-09-2019 16:29:09 ******/
CREATE TABLE `Roles`(
  `RoleId` int  NOT NULL,
  `Add_Access` varchar(200) NULL,
  `Edit_Access` varchar(200) NULL,
  `Delete_Access` varchar(200) NULL,
   PRIMARY KEY (`RoleId` ASC)
);

insert into Roles (`RoleId`,`Add_Access`,`Edit_Access`,`Delete_Access`) values (1,'Y','Y','Y');
insert into Roles (`RoleId`,`Add_Access`,`Edit_Access`,`Delete_Access`) values (2,'Y','Y','N');
insert into Roles (`RoleId`,`Add_Access`,`Edit_Access`,`Delete_Access`) values (3,'N','N','N');
