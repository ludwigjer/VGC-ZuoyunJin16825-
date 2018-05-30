-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: vgc
-- ------------------------------------------------------
-- Server version	5.7.19-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `assignmentsgradebook`
--

DROP TABLE IF EXISTS `assignmentsgradebook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assignmentsgradebook` (
  `StudentID` int(6) NOT NULL,
  `AssignmentsDate` date NOT NULL,
  `AssignmentsResults` decimal(3,0) DEFAULT NULL,
  `CoursesID` int(4) NOT NULL,
  PRIMARY KEY (`AssignmentsDate`,`StudentID`,`CoursesID`),
  KEY `StudentID` (`StudentID`),
  KEY `CoursesID` (`CoursesID`),
  CONSTRAINT `assignmentsgradebook_ibfk_1` FOREIGN KEY (`StudentID`) REFERENCES `student` (`StudentID`),
  CONSTRAINT `assignmentsgradebook_ibfk_2` FOREIGN KEY (`CoursesID`) REFERENCES `courses` (`CoursesID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignmentsgradebook`
--

LOCK TABLES `assignmentsgradebook` WRITE;
/*!40000 ALTER TABLE `assignmentsgradebook` DISABLE KEYS */;
INSERT INTO `assignmentsgradebook` VALUES (168250,'2017-11-01',85,1004),(268340,'2017-11-01',54,1004),(456435,'2017-11-01',64,1004),(523397,'2017-11-01',35,1004),(535457,'2017-11-01',48,1004),(565324,'2017-11-01',37,1004),(567347,'2017-11-01',52,1004),(665643,'2017-11-01',55,1004),(865654,'2017-11-01',15,1004),(456435,'2017-11-02',14,1004),(168250,'2017-11-15',95,1001),(268340,'2017-11-15',21,1001),(456435,'2017-11-15',21,1001),(523397,'2017-11-15',51,1001),(535457,'2017-11-15',48,1001),(565324,'2017-11-15',43,1001),(567347,'2017-11-15',51,1001),(665643,'2017-11-15',11,1001),(865654,'2017-11-15',14,1001),(168250,'2017-11-16',99,1002),(268340,'2017-11-16',71,1002),(456435,'2017-11-16',26,1002),(523397,'2017-11-16',21,1002),(535457,'2017-11-16',28,1002),(565324,'2017-11-16',75,1002),(567347,'2017-11-16',31,1002),(665643,'2017-11-16',91,1002),(865654,'2017-11-16',9,1002),(168250,'2017-11-17',100,1003),(268340,'2017-11-17',73,1003),(456435,'2017-11-17',73,1003),(523397,'2017-11-17',75,1003),(535457,'2017-11-17',17,1003),(565324,'2017-11-17',36,1003),(567347,'2017-11-17',75,1003),(665643,'2017-11-17',15,1003),(865654,'2017-11-17',10,1003),(168250,'2018-01-11',98,1003),(268340,'2018-01-11',76,1003),(456435,'2018-01-11',47,1003),(523397,'2018-01-11',28,1003),(535457,'2018-01-11',26,1003),(565324,'2018-01-11',24,1003),(567347,'2018-01-11',61,1003),(665643,'2018-01-11',68,1003),(865654,'2018-01-11',18,1003),(168250,'2018-01-16',100,1002),(268340,'2018-01-16',86,1002),(456435,'2018-01-16',17,1002),(523397,'2018-01-16',10,1002),(535457,'2018-01-16',49,1002),(565324,'2018-01-16',23,1002),(567347,'2018-01-16',82,1002),(665643,'2018-01-16',80,1002),(865654,'2018-01-16',50,1002),(168250,'2018-01-17',100,1001),(268340,'2018-01-17',1,1001),(456435,'2018-01-17',17,1001),(523397,'2018-01-17',90,1001),(535457,'2018-01-17',37,1001),(565324,'2018-01-17',98,1001),(567347,'2018-01-17',64,1001),(665643,'2018-01-17',70,1001),(865654,'2018-01-17',10,1001);
/*!40000 ALTER TABLE `assignmentsgradebook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `branches`
--

DROP TABLE IF EXISTS `branches`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `branches` (
  `BranchesID` decimal(2,0) NOT NULL,
  `BranchesADD` varchar(40) NOT NULL,
  `TEL` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`BranchesID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branches`
--

LOCK TABLES `branches` WRITE;
/*!40000 ALTER TABLE `branches` DISABLE KEYS */;
INSERT INTO `branches` VALUES (11,'344 Hedge Street',138457642),(12,'4806 Goff Avenue',138759863),(13,'1298 Keyser Ridge Road',138756389);
/*!40000 ALTER TABLE `branches` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `courses` (
  `CoursesID` int(4) NOT NULL,
  `CoursesName` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`CoursesID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
INSERT INTO `courses` VALUES (1001,'Programming'),(1002,'Web design'),(1003,'Operating System'),(1004,'Database'),(1006,'Java'),(1007,'C++'),(1107,'Programming2');
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `examsgradebook`
--

DROP TABLE IF EXISTS `examsgradebook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `examsgradebook` (
  `StudentID` int(6) NOT NULL,
  `ExamsDate` date NOT NULL,
  `ExamsResults` decimal(3,0) DEFAULT NULL,
  `CoursesID` int(4) NOT NULL,
  PRIMARY KEY (`ExamsDate`,`StudentID`,`CoursesID`),
  KEY `StudentID` (`StudentID`),
  KEY `CoursesID` (`CoursesID`),
  CONSTRAINT `examsgradebook_ibfk_1` FOREIGN KEY (`StudentID`) REFERENCES `student` (`StudentID`),
  CONSTRAINT `examsgradebook_ibfk_2` FOREIGN KEY (`CoursesID`) REFERENCES `courses` (`CoursesID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `examsgradebook`
--

LOCK TABLES `examsgradebook` WRITE;
/*!40000 ALTER TABLE `examsgradebook` DISABLE KEYS */;
INSERT INTO `examsgradebook` VALUES (168250,'2012-11-30',0,1003),(168250,'2017-11-01',85,1004),(268340,'2017-11-01',54,1004),(456435,'2017-11-01',64,1004),(523397,'2017-11-01',35,1004),(535457,'2017-11-01',48,1004),(565324,'2017-11-01',37,1004),(567347,'2017-11-01',52,1004),(665643,'2017-11-01',55,1004),(865654,'2017-11-01',15,1004),(168250,'2017-11-15',95,1001),(268340,'2017-11-15',21,1001),(456435,'2017-11-15',21,1001),(523397,'2017-11-15',51,1001),(535457,'2017-11-15',48,1001),(565324,'2017-11-15',43,1001),(567347,'2017-11-15',51,1001),(665643,'2017-11-15',11,1001),(865654,'2017-11-15',14,1001),(168250,'2017-11-16',99,1002),(268340,'2017-11-16',71,1002),(456435,'2017-11-16',26,1002),(523397,'2017-11-16',21,1002),(535457,'2017-11-16',28,1002),(565324,'2017-11-16',75,1002),(567347,'2017-11-16',31,1002),(665643,'2017-11-16',91,1002),(865654,'2017-11-16',9,1002),(168250,'2017-11-17',100,1003),(268340,'2017-11-17',73,1003),(456435,'2017-11-17',73,1003),(523397,'2017-11-17',75,1003),(535457,'2017-11-17',17,1003),(565324,'2017-11-17',36,1003),(567347,'2017-11-17',75,1003),(665643,'2017-11-17',15,1003),(865654,'2017-11-17',10,1003),(168250,'2018-01-11',98,1003),(268340,'2018-01-11',76,1003),(456435,'2018-01-11',47,1003),(523397,'2018-01-11',28,1003),(535457,'2018-01-11',26,1003),(565324,'2018-01-11',24,1003),(567347,'2018-01-11',61,1003),(665643,'2018-01-11',68,1003),(865654,'2018-01-11',18,1003),(168250,'2018-01-16',100,1002),(268340,'2018-01-16',86,1002),(456435,'2018-01-16',17,1002),(523397,'2018-01-16',10,1002),(535457,'2018-01-16',49,1002),(565324,'2018-01-16',23,1002),(567347,'2018-01-16',82,1002),(665643,'2018-01-16',80,1002),(865654,'2018-01-16',50,1002),(168250,'2018-01-17',100,1001),(268340,'2018-01-17',12,1001),(456435,'2018-01-17',17,1001),(523397,'2018-01-17',90,1001),(535457,'2018-01-17',37,1001),(565324,'2018-01-17',98,1001),(567347,'2018-01-17',64,1001),(665643,'2018-01-17',70,1001),(865654,'2018-01-17',10,1001);
/*!40000 ALTER TABLE `examsgradebook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `faculty`
--

DROP TABLE IF EXISTS `faculty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `faculty` (
  `FacultyID` int(6) NOT NULL,
  `FacultyFName` varchar(20) DEFAULT NULL,
  `FacultyLName` varchar(20) DEFAULT NULL,
  `PhoneNumber` int(10) NOT NULL,
  PRIMARY KEY (`FacultyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `faculty`
--

LOCK TABLES `faculty` WRITE;
/*!40000 ALTER TABLE `faculty` DISABLE KEYS */;
INSERT INTO `faculty` VALUES (501,'Ludwig','Jer',893678370),(502,'Kassiopeia','Volya',823434332),(503,'Aurelianus','Hinnerk',867645247),(504,'Kresten','Tory',835656764),(508,'Wigand','Sigihild',843654554),(510,'Bill','Mith',843655854),(560,'Kar','Coco',843679354),(570,'Kill','Wow',843675354),(580,'Hell','Leik',844549354);
/*!40000 ALTER TABLE `faculty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `ID` int(6) NOT NULL,
  `Password` varchar(30) DEFAULT NULL,
  `Priority` int(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (0,'123456',0),(501,'123456',1),(168250,'123456',2);
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paymentandattendance`
--

DROP TABLE IF EXISTS `paymentandattendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paymentandattendance` (
  `StudentID` int(6) NOT NULL,
  `Feesowed` double(9,2) DEFAULT NULL,
  `Attendance` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`StudentID`),
  CONSTRAINT `paymentandattendance_ibfk_1` FOREIGN KEY (`StudentID`) REFERENCES `student` (`StudentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paymentandattendance`
--

LOCK TABLES `paymentandattendance` WRITE;
/*!40000 ALTER TABLE `paymentandattendance` DISABLE KEYS */;
INSERT INTO `paymentandattendance` VALUES (168250,0.00,'100%'),(268340,9999.41,'70%'),(456435,5.00,'10%'),(523397,4500.52,'30%'),(535457,0.54,'16%'),(565324,1.00,'1%'),(567347,5000.20,'60%'),(665643,1111.50,'88%'),(865654,52.00,'10%');
/*!40000 ALTER TABLE `paymentandattendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `StudentID` int(6) NOT NULL,
  `StudentFName` varchar(20) DEFAULT NULL,
  `StudentLName` varchar(20) DEFAULT NULL,
  `Address` varchar(30) DEFAULT NULL,
  `PhoneNumber` decimal(10,0) DEFAULT NULL,
  `EnrollmenttDate` date DEFAULT NULL,
  PRIMARY KEY (`StudentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (168250,'Zuoyun','Jin','168 The hardwick',899688370,'2016-07-15'),(268340,'Freddie','Lakshman','206 Deans Lane',812368766,'2015-04-16'),(456435,'Corynn','Maria','4966 Holly Street',824378887,'2017-12-30'),(523397,'Nana','zotz','2000 Crummit Lane',866556452,'2013-01-16'),(535457,'Ziya','Elisa','1289 Crestview Manor',845685987,'2012-01-19'),(564624,'Iig','tan','4459 Lin Oen Lane',843653645,'2016-05-12'),(565324,'Irving','Shinta','4169 Lynn Ogden Lane1',843787645,'2014-01-12'),(567347,'Quetzalli','Lea','971 Quilly Lane',823475653,'2015-02-10'),(665643,'Micha','Tine','94 Lewis Street',844534344,'2017-07-13'),(865654,'Kars','Cook','145 Blackrock',887433443,'2017-07-10');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `timetable`
--

DROP TABLE IF EXISTS `timetable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `timetable` (
  `CoursesID` int(4) NOT NULL,
  `FacultyID` int(6) NOT NULL,
  `Mon` varchar(1) DEFAULT NULL,
  `Tues` varchar(1) DEFAULT NULL,
  `Wed` varchar(1) DEFAULT NULL,
  `Thur` varchar(1) DEFAULT NULL,
  `Fri` varchar(1) DEFAULT NULL,
  `BranchesID` decimal(2,0) DEFAULT NULL,
  PRIMARY KEY (`CoursesID`),
  KEY `FacultyID` (`FacultyID`),
  KEY `BranchesID` (`BranchesID`),
  CONSTRAINT `timetable_ibfk_1` FOREIGN KEY (`CoursesID`) REFERENCES `courses` (`CoursesID`),
  CONSTRAINT `timetable_ibfk_2` FOREIGN KEY (`FacultyID`) REFERENCES `faculty` (`FacultyID`),
  CONSTRAINT `timetable_ibfk_3` FOREIGN KEY (`BranchesID`) REFERENCES `branches` (`BranchesID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timetable`
--

LOCK TABLES `timetable` WRITE;
/*!40000 ALTER TABLE `timetable` DISABLE KEYS */;
INSERT INTO `timetable` VALUES (1001,501,'N','Y','N','Y','N',11),(1002,502,'Y','N','Y','N','Y',13),(1003,503,'N','N','N','N','Y',12),(1004,504,'Y','Y','Y','Y','N',12);
/*!40000 ALTER TABLE `timetable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-29 22:41:01
