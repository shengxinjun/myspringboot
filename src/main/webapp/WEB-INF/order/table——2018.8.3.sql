/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-09-04 15:29:50
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
  `user_id` int(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('16', 'asd', '3', '3', '2018-08-03');
INSERT INTO `order` VALUES ('17', 'd', '23', '232', '2018-08-03');
INSERT INTO `order` VALUES ('18', 'ad', '23', '32', '2018-08-03');
INSERT INTO `order` VALUES ('19', 'fada', '32', '32', '2018-08-03');
INSERT INTO `order` VALUES ('20', 'dsa', '32', '32', '2018-08-03');
INSERT INTO `order` VALUES ('23', '2', '2', '2', '2018-09-04');
INSERT INTO `order` VALUES ('24', '2', null, null, null);
INSERT INTO `order` VALUES ('25', '2', '1', '222', '2018-09-12');
INSERT INTO `order` VALUES ('26', '2', null, null, null);
INSERT INTO `order` VALUES ('27', '2', null, null, null);
INSERT INTO `order` VALUES ('28', '2', null, null, null);
INSERT INTO `order` VALUES ('29', '2', null, null, null);
INSERT INTO `order` VALUES ('30', '2', null, null, null);
INSERT INTO `order` VALUES ('31', '2', null, null, null);
INSERT INTO `order` VALUES ('32', '2', null, null, null);
INSERT INTO `order` VALUES ('33', '2', null, null, null);
INSERT INTO `order` VALUES ('34', '2', null, null, null);
INSERT INTO `order` VALUES ('35', '2', null, null, null);
INSERT INTO `order` VALUES ('36', '2', null, null, null);
INSERT INTO `order` VALUES ('37', '2', null, null, null);
INSERT INTO `order` VALUES ('38', '2', null, null, null);
INSERT INTO `order` VALUES ('39', '2', null, null, null);
INSERT INTO `order` VALUES ('40', '2', null, null, null);
INSERT INTO `order` VALUES ('41', '2', null, null, null);
INSERT INTO `order` VALUES ('42', '2', null, null, null);
INSERT INTO `order` VALUES ('43', '2', null, null, null);
INSERT INTO `order` VALUES ('44', '2', null, null, null);
INSERT INTO `order` VALUES ('45', '2', null, null, null);
INSERT INTO `order` VALUES ('46', '2', null, null, null);
INSERT INTO `order` VALUES ('47', '2', null, null, null);

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
