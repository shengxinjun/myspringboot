/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-09-07 17:30:57
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
INSERT INTO `code_message` VALUES ('106', '今日邮件已达上限');
INSERT INTO `code_message` VALUES ('107', '该用户被限制登录');

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
  `ip` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of email_info
-- ----------------------------
INSERT INTO `email_info` VALUES ('7', null, '498740190@qq.com', '验证码为：728248', '728248', '找回密码', '2018-09-06 00:00:00', null);
INSERT INTO `email_info` VALUES ('8', null, '498740190@qq.com', '你的密码为：111', null, 'topest level---ace system', '2018-09-06 00:00:00', null);
INSERT INTO `email_info` VALUES ('9', null, '498740190@qq.com', '验证码为：959082', '959082', '找回密码', '2018-09-06 21:00:00', null);
INSERT INTO `email_info` VALUES ('10', null, '498740190@qq.com', '你的密码为：111', null, 'topest level---ace system', '2018-09-06 00:00:00', null);
INSERT INTO `email_info` VALUES ('11', null, '498740190@qq.com', '验证码为：434250', '434250', '找回密码', '2018-09-06 00:00:00', null);
INSERT INTO `email_info` VALUES ('14', null, '164883349@qq.com', '验证码为：181383', '181383', '找回密码', '2018-09-06 00:00:00', null);
INSERT INTO `email_info` VALUES ('15', null, '164883349@qq.com', '你的新密码为：128666', null, 'topest level---ace system', '2018-09-06 00:00:00', null);
INSERT INTO `email_info` VALUES ('16', null, '164883349@qq.com', '验证码为：723240', '723240', '找回密码', '2018-09-07 10:11:23', null);
INSERT INTO `email_info` VALUES ('17', null, '164883349@qq.com', '验证码为：971331', '971331', '找回密码', '2018-09-07 10:12:23', null);
INSERT INTO `email_info` VALUES ('18', null, '164883349@qq.com', '验证码为：365054', '365054', '找回密码', '2018-09-07 10:12:57', null);
INSERT INTO `email_info` VALUES ('19', null, '164883349@qq.com', '验证码为：504829', '504829', '找回密码', '2018-09-07 10:14:31', null);
INSERT INTO `email_info` VALUES ('20', null, '164883349@qq.com', '验证码为：888378', '888378', '找回密码', '2018-09-07 10:15:49', '49.77.179.176');
INSERT INTO `email_info` VALUES ('21', null, '164883349@qq.com', '验证码为：145973', '145973', '找回密码', '2018-09-07 10:15:59', '49.77.179.176');
INSERT INTO `email_info` VALUES ('29', null, '498740190@qq.com', '验证码为：818768', '818768', '找回密码', '2018-09-07 10:20:41', '49.77.179.176');
INSERT INTO `email_info` VALUES ('30', null, '498740190@qq.com', '验证码为：135698', '135698', '找回密码', '2018-09-07 10:38:17', '49.77.179.176');
INSERT INTO `email_info` VALUES ('31', null, '164883349@qq.com', '验证码为：826611', '826611', '找回密码', '2018-09-07 10:40:23', '49.77.179.176');
INSERT INTO `email_info` VALUES ('32', null, '164883349@qq.com', '验证码为：339406', '339406', '找回密码', '2018-09-07 10:42:06', '49.77.179.176');
INSERT INTO `email_info` VALUES ('33', null, '164883349@qq.com', '验证码为：642976', '642976', '找回密码', '2018-09-07 10:42:23', '49.77.179.176');
INSERT INTO `email_info` VALUES ('34', null, '498740190@qq.com', '验证码为：541668', '541668', '找回密码', '2018-09-07 10:43:50', '49.77.179.176');
INSERT INTO `email_info` VALUES ('35', null, '498740190@qq.com', '验证码为：786840', '786840', '找回密码', '2018-09-07 10:46:22', '49.77.179.176');
INSERT INTO `email_info` VALUES ('36', null, '498740190@qq.com', '你的新密码为：421729', null, 'topest level---ace system', '2018-09-07 10:46:40', null);

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `total_price` float(255,0) DEFAULT NULL,
  `user_id` int(255) DEFAULT NULL,
  `deleted` int(11) DEFAULT '0',
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('16', 'asd', '3', '3', '0', '2018-08-03 00:00:00');
INSERT INTO `order` VALUES ('18', 'ad', '23', '32', '0', '2018-08-03 00:00:00');
INSERT INTO `order` VALUES ('19', 'fada', '32', '32', '0', '2018-08-03 00:00:00');
INSERT INTO `order` VALUES ('20', 'dsa', '32', '32', '0', '2018-08-03 00:00:00');
INSERT INTO `order` VALUES ('23', '2', '2', '2', '0', '2018-09-04 00:00:00');
INSERT INTO `order` VALUES ('24', '2', null, null, '0', null);
INSERT INTO `order` VALUES ('25', '2', '1', '222', '0', '2018-09-12 00:00:00');
INSERT INTO `order` VALUES ('26', '2', '5', '21', '0', '2018-09-28 00:00:00');
INSERT INTO `order` VALUES ('28', '2', null, null, '0', null);
INSERT INTO `order` VALUES ('49', null, '2', null, '0', null);
INSERT INTO `order` VALUES ('50', null, '22222', null, '0', null);
INSERT INTO `order` VALUES ('51', 'w', null, null, '0', null);
INSERT INTO `order` VALUES ('52', 'e', null, null, '0', null);
INSERT INTO `order` VALUES ('53', 'e', null, null, '0', null);
INSERT INTO `order` VALUES ('54', 'e', null, null, '0', null);
INSERT INTO `order` VALUES ('55', 'e', null, null, '0', null);
INSERT INTO `order` VALUES ('56', 'e', null, null, '0', null);
INSERT INTO `order` VALUES ('57', 'e', null, null, '0', null);
INSERT INTO `order` VALUES ('58', 'w3w', null, null, '0', null);
INSERT INTO `order` VALUES ('59', 'e', null, null, '0', null);
INSERT INTO `order` VALUES ('60', 'wee', null, null, '0', null);
INSERT INTO `order` VALUES ('61', 'wwe', null, null, '0', null);
INSERT INTO `order` VALUES ('62', 'ewwe', null, null, '0', null);
INSERT INTO `order` VALUES ('63', 'we', null, null, '0', null);
INSERT INTO `order` VALUES ('64', 'we', null, null, '0', null);
INSERT INTO `order` VALUES ('65', 'ew', null, null, '0', null);
INSERT INTO `order` VALUES ('66', 'we', null, null, '0', null);
INSERT INTO `order` VALUES ('67', 'we', null, null, '0', null);
INSERT INTO `order` VALUES ('68', 'we', null, null, '0', null);
INSERT INTO `order` VALUES ('69', 'we', null, null, '0', null);
INSERT INTO `order` VALUES ('70', 'ew', null, null, '0', null);
INSERT INTO `order` VALUES ('71', 'we', null, null, '0', null);
INSERT INTO `order` VALUES ('72', 'we', null, null, '0', null);
INSERT INTO `order` VALUES ('73', 'ew', null, null, '0', null);

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `imgs` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` float(255,0) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `deleted` int(11) unsigned DEFAULT '0',
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `order_id` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('6', null, null, 'ds', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('7', null, null, 'ds', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('8', null, null, 'ds', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('9', null, null, 'ds', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('10', null, null, 'sd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('11', null, null, 'g', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('12', null, null, 'gf', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('13', null, null, 'gvfd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('14', null, null, 'gvfd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('15', null, null, 'bg', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('16', null, null, 'ds', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('17', null, null, 'sda', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('18', null, null, 'sd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('19', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('20', null, null, 'dsf', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('21', null, null, 'a', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('22', null, null, 'fs', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('23', null, null, 'dasd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('24', null, null, 'sd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('25', null, null, 'fsd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('26', null, null, null, null, null, null, '0', null, null);

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
  `deleted` int(11) DEFAULT '0',
  `role` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '盛新军', '091787B7502B310FB20959FA10C5E117', '18360916461', null, null, null, '498740190@qq.com', null, null);
INSERT INTO `user` VALUES ('4', 'sxj', '98544FC40293F2C9148832BA8FF045B3', '17895216461', null, null, '2018-09-06 00:00:00', '164883349@qq.com', null, null);
INSERT INTO `user` VALUES ('9', '18111111111', '1B938654C49BE5D739FCE14B3F4F4DEF', '18111111111', null, null, '2018-09-06 18:17:54', '18111111111', null, null);
