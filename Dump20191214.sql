-- MySQL dump 10.13  Distrib 5.7.28, for Linux (x86_64)
--
-- Host: localhost    Database: moshiur1251962
-- ------------------------------------------------------
-- Server version	5.7.28

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
-- Table structure for table `basic_cost`
--

DROP TABLE IF EXISTS `basic_cost`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `basic_cost` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `apartment_rent` int(11) DEFAULT NULL,
  `electricity` int(45) DEFAULT NULL,
  `gas` int(11) DEFAULT NULL,
  `cleaner` int(11) DEFAULT NULL,
  `maid` int(11) DEFAULT NULL,
  `news_paper` int(11) DEFAULT NULL,
  `wifi` varchar(45) DEFAULT NULL,
  `extra` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `basic_cost`
--

LOCK TABLES `basic_cost` WRITE;
/*!40000 ALTER TABLE `basic_cost` DISABLE KEYS */;
INSERT INTO `basic_cost` VALUES (1,12000,25,45,569,666,666,'666','499','2019-12-04'),(2,12000,25,45,569,666,666,'666','499','2019-12-04');
/*!40000 ALTER TABLE `basic_cost` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deposit_1`
--

DROP TABLE IF EXISTS `deposit_1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deposit_1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deposit_1`
--

LOCK TABLES `deposit_1` WRITE;
/*!40000 ALTER TABLE `deposit_1` DISABLE KEYS */;
/*!40000 ALTER TABLE `deposit_1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `meal1`
--

DROP TABLE IF EXISTS `meal1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `meal1` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_meal1_1_idx` (`name`),
  CONSTRAINT `fk_meal1_1` FOREIGN KEY (`name`) REFERENCES `members` (`name`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meal1`
--

LOCK TABLES `meal1` WRITE;
/*!40000 ALTER TABLE `meal1` DISABLE KEYS */;
/*!40000 ALTER TABLE `meal1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `members`
--

DROP TABLE IF EXISTS `members`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `members` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `nid` int(20) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `phone_number` int(15) DEFAULT NULL,
  `emergency_number` int(15) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`,`name`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `members`
--

LOCK TABLES `members` WRITE;
/*!40000 ALTER TABLE `members` DISABLE KEYS */;
INSERT INTO `members` VALUES (1,'jj',14,11111,'jjhjh',22222,55555555,'2019-12-05'),(2,'ahmed',25,55555,'dhaka',555555,555555,'2019-12-05');
/*!40000 ALTER TABLE `members` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nn`
--

DROP TABLE IF EXISTS `nn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nn` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `meal` double DEFAULT '0',
  `bazar` varchar(45) DEFAULT '0',
  `rent` varchar(45) DEFAULT '0',
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_nn_1_idx` (`name`),
  CONSTRAINT `fk_nn_1` FOREIGN KEY (`name`) REFERENCES `members` (`name`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nn`
--

LOCK TABLES `nn` WRITE;
/*!40000 ALTER TABLE `nn` DISABLE KEYS */;
INSERT INTO `nn` VALUES (4,'ahmed',2,'0','0','2019-12-05'),(5,'jj',0,'0','200','2019-12-11'),(6,'ahmed',2,'0','0','2019-12-05'),(7,'ahmed',0,'200','0','2019-12-04'),(8,'jj',0,'50','0','2019-12-04'),(9,'ahmed',0,'0','5000','2019-12-20');
/*!40000 ALTER TABLE `nn` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'moshiur1251962'
--

--
-- Dumping routines for database 'moshiur1251962'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-14  0:08:30
