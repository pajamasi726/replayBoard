/*
Navicat MariaDB Data Transfer

Source Server         : MYDB
Source Server Version : 100021
Source Host           : localhost:3306
Source Database       : board

Target Server Type    : MariaDB
Target Server Version : 100021
File Encoding         : 65001

Date: 2015-11-13 19:00:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `id` varchar(20) NOT NULL,
  `pass` varchar(20) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
