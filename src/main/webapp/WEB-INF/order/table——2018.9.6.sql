/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-09-06 18:18:41
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
INSERT INTO `code_message` VALUES ('100', '参数不能为空');
INSERT INTO `code_message` VALUES ('101', '用户不存在');
INSERT INTO `code_message` VALUES ('102', '密码错误');
INSERT INTO `code_message` VALUES ('103', '用户已存在');
INSERT INTO `code_message` VALUES ('104', '用户不存在');
INSERT INTO `code_message` VALUES ('105', '验证码不正确');

-- ----------------------------
-- Table structure for `email_info`
-- ----------------------------
DROP TABLE IF EXISTS `email_info`;
CREATE TABLE `email_info` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `sender` varchar(255) DEFAULT NULL,
  `receiver` varchar(255) DEFAULT NULL,
  `context` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  `send_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of email_info
-- ----------------------------
INSERT INTO `email_info` VALUES ('7', null, '498740190@qq.com', '验证码为：728248', '728248', '找回密码', '2018-09-06 00:00:00');
INSERT INTO `email_info` VALUES ('8', null, '498740190@qq.com', '你的密码为：111', null, 'topest level---ace system', '2018-09-06 00:00:00');
INSERT INTO `email_info` VALUES ('9', null, '498740190@qq.com', '验证码为：959082', '959082', '找回密码', '2018-09-06 21:00:00');
INSERT INTO `email_info` VALUES ('10', null, '498740190@qq.com', '你的密码为：111', null, 'topest level---ace system', '2018-09-06 00:00:00');
INSERT INTO `email_info` VALUES ('11', null, '498740190@qq.com', '验证码为：434250', '434250', '找回密码', '2018-09-06 00:00:00');
INSERT INTO `email_info` VALUES ('14', null, '164883349@qq.com', '验证码为：181383', '181383', '找回密码', '2018-09-06 00:00:00');
INSERT INTO `email_info` VALUES ('15', null, '164883349@qq.com', '你的新密码为：128666', null, 'topest level---ace system', '2018-09-06 00:00:00');

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `total_price` float(255,0) DEFAULT NULL,
  `user_id` int(255) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('16', 'asd', '3', '3', '2018-08-03 00:00:00');
INSERT INTO `order` VALUES ('18', 'ad', '23', '32', '2018-08-03 00:00:00');
INSERT INTO `order` VALUES ('19', 'fada', '32', '32', '2018-08-03 00:00:00');
INSERT INTO `order` VALUES ('20', 'dsa', '32', '32', '2018-08-03 00:00:00');
INSERT INTO `order` VALUES ('23', '2', '2', '2', '2018-09-04 00:00:00');
INSERT INTO `order` VALUES ('24', '2', null, null, null);
INSERT INTO `order` VALUES ('25', '2', '1', '222', '2018-09-12 00:00:00');
INSERT INTO `order` VALUES ('26', '2', '5', '21', '2018-09-28 00:00:00');
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
INSERT INTO `order` VALUES ('48', '反反复复', '4', '222', '2018-09-14 00:00:00');

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

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `imgs` varchar(255) DEFAULT NULL,
  `last_login_date` datetime DEFAULT NULL,
  `register_date` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `role` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '盛新军', '111', '18360916461', null, null, null, '498740190@qq.com', null);
INSERT INTO `user` VALUES ('4', 'sxj', '98544FC40293F2C9148832BA8FF045B3', '17895216461', null, null, '2018-09-06 00:00:00', '164883349@qq.com', null);
INSERT INTO `user` VALUES ('9', '18111111111', '1B938654C49BE5D739FCE14B3F4F4DEF', '18111111111', null, null, '2018-09-06 18:17:54', '18111111111', null);
