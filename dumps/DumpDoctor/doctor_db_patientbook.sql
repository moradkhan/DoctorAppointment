CREATE DATABASE  IF NOT EXISTS `doctor_db` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `doctor_db`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win32 (AMD64)
--
-- Host: localhost    Database: doctor_db
-- ------------------------------------------------------
-- Server version	5.7.15-log

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
-- Table structure for table `patientbook`
--

DROP TABLE IF EXISTS `patientbook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patientbook` (
  `appointId` int(11) NOT NULL,
  `category` varchar(20) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `bDate` date DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL,
  `patientId` int(11) DEFAULT NULL,
  `doctorName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`appointId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patientbook`
--

LOCK TABLES `patientbook` WRITE;
/*!40000 ALTER TABLE `patientbook` DISABLE KEYS */;
INSERT INTO `patientbook` VALUES (100,'General','Physician','2018-02-10','3:15-4:45',1003,'Dr. Ujjol Mondol'),(101,'Heart','Cardiologist','2018-02-07','4:00-4:30',1001,'Dr. Rafiq Hossain'),(102,'Bone','Dentist','2018-02-04','4:00-4:30',1002,'Dr. Mominul Haque');
/*!40000 ALTER TABLE `patientbook` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-07  0:53:31
