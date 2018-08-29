/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-08-03 17:22:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `code_message`
-- ----------------------------
DROP TABLE IF EXISTS `code_message`;
CREATE TABLE `code_message` (
  `code` int(255) NOT NULL,
  `message` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of code_message
-- ----------------------------
INSERT INTO `code_message` VALUES ('1', '参数不能为空');

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `total_price` float(255,0) DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('1', 'fafs', '2233', '323332', '2018-08-03');
INSERT INTO `order` VALUES ('2', 'fff', '3232', '323', '2018-08-03');
INSERT INTO `order` VALUES ('3', '333', '23', '232', '2018-08-03');
INSERT INTO `order` VALUES ('4', '333', '2323', '3223', '2018-08-03');
INSERT INTO `order` VALUES ('5', '333', '23', '32', '2018-08-03');
INSERT INTO `order` VALUES ('6', 'f', '33', '3232', '2018-08-03');
INSERT INTO `order` VALUES ('7', 'f', '2323', '23', '2018-08-03');
INSERT INTO `order` VALUES ('8', 'ds', '3232', '3223', '2018-08-03');
INSERT INTO `order` VALUES ('9', 'ds', '32', '23', '2018-08-03');
INSERT INTO `order` VALUES ('10', 'fs', '32', '32', '2018-08-03');
INSERT INTO `order` VALUES ('11', 'fsd', '3223', '323', '2018-08-03');
INSERT INTO `order` VALUES ('12', 'fad', '3223', '3232', '2018-08-03');
INSERT INTO `order` VALUES ('13', 'sda', '32', '3', '2018-08-03');
INSERT INTO `order` VALUES ('14', 'fad', '3223', '2323', '2018-08-03');
INSERT INTO `order` VALUES ('15', 's', '23', '32', '2018-08-03');
INSERT INTO `order` VALUES ('16', 'asd', '3', '3', '2018-08-03');
INSERT INTO `order` VALUES ('17', 'd', '23', '232', '2018-08-03');
INSERT INTO `order` VALUES ('18', 'ad', '23', '32', '2018-08-03');
INSERT INTO `order` VALUES ('19', 'fada', '32', '32', '2018-08-03');
INSERT INTO `order` VALUES ('20', 'dsa', '32', '32', '2018-08-03');

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `price` float(255,0) DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL,
  `order_id` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
