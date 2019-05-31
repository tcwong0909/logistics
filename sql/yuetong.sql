/*
SQLyog Ultimate v12.4.3 (64 bit)
MySQL - 5.7.17-log : Database - yuetong
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`yuetong` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `yuetong`;

/*Table structure for table `carriers` */

DROP TABLE IF EXISTS `carriers`;

CREATE TABLE `carriers` (
  `carriersID` int(11) NOT NULL AUTO_INCREMENT,
  `sendCompany` varchar(63) DEFAULT NULL,
  `sendAddress` varchar(127) DEFAULT NULL,
  `sendLinkMan` varchar(31) DEFAULT NULL,
  `sendPhone` varchar(15) DEFAULT NULL,
  `receiveCompany` varchar(127) DEFAULT NULL,
  `fk_receiveAddress` varchar(127) DEFAULT NULL,
  `receiveLinkMan` varchar(31) DEFAULT NULL,
  `receivePhone` varchar(31) DEFAULT NULL,
  `leaverDate` datetime DEFAULT NULL,
  `receiveDate` datetime DEFAULT NULL,
  `finishedState` int(11) DEFAULT NULL,
  `insuranceCost` float DEFAULT NULL,
  `transportCost` float DEFAULT NULL,
  `otherCost` float DEFAULT NULL,
  `totalCost` float DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `fk_userID` int(11) DEFAULT NULL,
  `checkInTime` datetime DEFAULT NULL,
  `isDelete` int(11) DEFAULT NULL,
  `alterTime` datetime DEFAULT NULL,
  PRIMARY KEY (`carriersID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `carriers` */

/*Table structure for table `contact` */

DROP TABLE IF EXISTS `contact`;

CREATE TABLE `contact` (
  `contactID` int(11) NOT NULL AUTO_INCREMENT,
  `fk_truckID` int(11) DEFAULT NULL,
  `fk_driverID` int(11) DEFAULT NULL,
  PRIMARY KEY (`contactID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `contact` */

/*Table structure for table `driver` */

DROP TABLE IF EXISTS `driver`;

CREATE TABLE `driver` (
  `driverID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(31) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `birth` date DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `IDCard` varchar(31) DEFAULT NULL,
  `fk_teamID` int(11) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `checkInTime` datetime DEFAULT NULL,
  `isDelete` int(11) DEFAULT NULL,
  `alterTime` datetime DEFAULT NULL,
  PRIMARY KEY (`driverID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `driver` */

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `goodsID` int(11) NOT NULL AUTO_INCREMENT,
  `goodsName` varchar(31) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `weight` float DEFAULT NULL,
  `volume` float DEFAULT NULL,
  `fk_carriersID` int(11) DEFAULT NULL,
  `isDelete` int(11) DEFAULT NULL,
  PRIMARY KEY (`goodsID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `goods` */

/*Table structure for table `logdic` */

DROP TABLE IF EXISTS `logdic`;

CREATE TABLE `logdic` (
  `typeID` int(11) NOT NULL AUTO_INCREMENT,
  `typeName` varchar(31) DEFAULT NULL,
  PRIMARY KEY (`typeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `logdic` */

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `roleID` int(11) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(31) DEFAULT NULL,
  `rolePurview` varchar(31) DEFAULT NULL,
  PRIMARY KEY (`roleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role` */

/*Table structure for table `scheduling` */

DROP TABLE IF EXISTS `scheduling`;

CREATE TABLE `scheduling` (
  `schedulingID` int(11) NOT NULL AUTO_INCREMENT,
  `startTime` datetime DEFAULT NULL,
  `fk_carriersID` int(11) DEFAULT NULL,
  `fk_truckID` int(11) DEFAULT NULL,
  `oilCost` float DEFAULT NULL,
  `toll` float DEFAULT NULL,
  `fine` float DEFAULT NULL,
  `otherCost` float DEFAULT NULL,
  `totalCost` float DEFAULT NULL,
  `fk_userID` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `checkInTime` datetime DEFAULT NULL,
  `isDelete` int(11) DEFAULT NULL,
  `alterTime` datetime DEFAULT NULL,
  PRIMARY KEY (`schedulingID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `scheduling` */

/*Table structure for table `syslog` */

DROP TABLE IF EXISTS `syslog`;

CREATE TABLE `syslog` (
  `logID` int(11) NOT NULL AUTO_INCREMENT,
  `behavior` text,
  `fk_typeID` int(11) DEFAULT NULL,
  `fk_userID` int(11) DEFAULT NULL,
  `parameters` text,
  `procName` varchar(255) DEFAULT NULL,
  `IP` varchar(63) DEFAULT NULL,
  `checkInTime` datetime DEFAULT NULL,
  `exception` text,
  `isException` int(11) DEFAULT NULL,
  PRIMARY KEY (`logID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `syslog` */

/*Table structure for table `truck` */

DROP TABLE IF EXISTS `truck`;

CREATE TABLE `truck` (
  `truckID` int(11) NOT NULL AUTO_INCREMENT,
  `number` varchar(63) DEFAULT NULL,
  `buyDate` datetime DEFAULT NULL,
  `type` varchar(31) DEFAULT NULL,
  `length` varchar(31) DEFAULT NULL,
  `tonnage` int(11) DEFAULT NULL,
  `fk_teamID` int(11) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `checkInTime` datetime DEFAULT NULL,
  `isDelete` int(11) DEFAULT NULL,
  `alterTime` datetime DEFAULT NULL,
  PRIMARY KEY (`truckID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `truck` */

/*Table structure for table `truckteam` */

DROP TABLE IF EXISTS `truckteam`;

CREATE TABLE `truckteam` (
  `teamID` int(11) NOT NULL AUTO_INCREMENT,
  `teamName` varchar(63) DEFAULT NULL,
  `leader` varchar(63) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `checkInTime` datetime DEFAULT NULL,
  `isDelete` int(11) DEFAULT NULL,
  `alterTime` datetime DEFAULT NULL,
  PRIMARY KEY (`teamID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `truckteam` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userID` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(31) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `account` varchar(127) DEFAULT NULL,
  `password` varchar(127) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `email` varchar(63) DEFAULT NULL,
  `fk_roleID` int(11) DEFAULT NULL,
  `checkInTime` datetime DEFAULT NULL,
  `isDelete` int(11) DEFAULT NULL,
  `alterTime` datetime DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
