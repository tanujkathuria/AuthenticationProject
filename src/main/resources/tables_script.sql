USE `authenticationDB`
;
/****** Object:  Table `User`    Script Date: 01-09-2019 16:29:09 ******/
/**http://localhost:8080/login?user=tanuj@gmail.com&pass=tanuj
HTTP://localhost:8080/DeleteRisk/RSK-003
**/

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

/****** Object:  Table `RiskDetails`    Script Date: 01-09-2019 16:29:09 ******/
CREATE TABLE `RiskDetails`(
  `RiskId` varchar(200)  NOT NULL,
  `Title` varchar(200) NULL,
  `Status` varchar(200) NULL,
  `level` varchar(200) NULL,
  `Owner` varchar(200) NULL,
  `Manager` varchar(200) NULL,
  `Organization` varchar(200) NULL,
  `CreatedOn` datetime NULL,
  `CreatedBy` varchar(200) NULL,
  `ApprovedBy` varchar(200) NULL,
  `ApprovedOn` datetime NULL,
   PRIMARY KEY (`RiskId` ASC)
);

insert into RiskDetails (`RiskId`,`Title`,`Status`,`level`,`Owner`,`Manager`,`Organization`,`CreatedOn`,`CreatedBy`,`ApprovedBy`,`ApprovedOn`)
 values ('RSK-001','Bad Loan','Approved','Level-1','Sam Mathew','Anee D','Finance', CURDATE(),'Sam Mathew','Anee D',CURDATE());

insert into RiskDetails (`RiskId`,`Title`,`Status`,`level`,`Owner`,`Manager`,`Organization`,`CreatedOn`,`CreatedBy`,`ApprovedBy`,`ApprovedOn`)
 values ('RSK-002','Loan Recovery','Rejected','Level-2','Andrew','Lone','Finance', CURDATE(),'Andrew','Lone',CURDATE());
