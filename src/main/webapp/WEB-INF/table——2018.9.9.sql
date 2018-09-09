/*
Navicat MySQL Data Transfer

Source Server         : estore
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-09-09 19:41:09
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
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

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
INSERT INTO `email_info` VALUES ('37', null, '498740190@qq.com', '验证码为：190840', '190840', '找回密码', '2018-09-07 20:58:02', '220.115.124.213');
INSERT INTO `email_info` VALUES ('38', null, '498740190@qq.com', '你的新密码为：730450', null, 'topest level---ace system', '2018-09-07 20:58:56', null);

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
  `type` varchar(255) DEFAULT NULL,
  `order_id` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('7', null, 'dsa', 'ds', '3', null, null, '0', '22', null);
INSERT INTO `product` VALUES ('8', null, 'sdd', 'ds', '3', null, null, '0', 'dfgds', null);
INSERT INTO `product` VALUES ('9', null, 'ff', 'ds', '3', null, null, '0', 'asdf', null);
INSERT INTO `product` VALUES ('10', null, 'das', 'sd', '3', null, null, '0', 'fdsf', null);
INSERT INTO `product` VALUES ('13', null, 'sdf', 'gvfd', '33', null, null, '0', 'fasdf', null);
INSERT INTO `product` VALUES ('14', null, 'dsa', 'gvfd', '33', null, null, '0', 'adsfa', null);
INSERT INTO `product` VALUES ('15', null, 'fafsa', 'bg', '3', null, null, '0', 'adsf', null);
INSERT INTO `product` VALUES ('16', null, 'fdsfsd', 'ds', '3', null, null, '0', 'asf', null);
INSERT INTO `product` VALUES ('17', null, 'asdf', 'sda', '3', null, null, '0', 'ad', null);
INSERT INTO `product` VALUES ('18', null, 'ds', 'sd', '3', null, null, '0', 'ads', null);
INSERT INTO `product` VALUES ('21', null, 'ds', 'a', '33', null, null, '0', 'dsf', null);
INSERT INTO `product` VALUES ('22', null, 'asfads', 'fs', '3', null, null, '0', 'sa', null);
INSERT INTO `product` VALUES ('23', null, 'afd', 'dasd', '3', null, null, '0', 'dsa', null);
INSERT INTO `product` VALUES ('24', null, 'afd', 'sd', '3', null, null, '0', 'fasdf', null);
INSERT INTO `product` VALUES ('25', null, null, 'fsd', '3', null, null, '0', 'asd', null);
INSERT INTO `product` VALUES ('27', null, null, 'd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('28', null, null, 'df', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('30', null, null, 'sf', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('31', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('32', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('33', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('34', null, null, 'fd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('35', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('36', null, null, 'dsfdf', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('37', null, null, 'd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('38', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('39', null, null, 'd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('40', null, null, 'sffd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('41', null, null, 'fd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('42', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('43', null, null, 'fd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('44', null, null, 'fd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('45', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('46', null, null, 'fds', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('47', null, null, 'fsd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('48', null, null, 'fd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('49', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('50', null, null, 'fs', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('51', null, null, 's', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('52', null, null, 'sf', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('53', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('54', null, null, 'fd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('55', null, null, 'fd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('56', null, null, 'fsd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('57', null, null, 'sdf', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('58', null, null, 'fds', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('59', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('60', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('61', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('62', null, null, 'dsf', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('63', null, null, 'fd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('64', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('65', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('66', null, null, 'fsf', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('67', null, null, 'sd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('68', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('69', null, null, 'sf', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('70', null, null, 'sf', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('71', null, null, 'fs', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('72', null, null, 'sf', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('73', null, null, 'fs', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('74', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('75', null, null, 'fs', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('76', null, null, 'sf', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('77', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('78', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('79', null, null, 'fsd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('80', null, null, 'fs', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('81', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('82', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('83', null, null, 'fsd', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('84', null, null, 'fs', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('85', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('86', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('87', null, null, 'sf', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('88', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('89', null, null, 'sf', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('90', null, null, 'sf', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('91', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('92', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('94', null, null, 'f', null, null, null, '0', null, null);
INSERT INTO `product` VALUES ('99', null, null, '我问问', '11111', null, '2018-09-19 00:00:00', '0', '11111', null);
INSERT INTO `product` VALUES ('100', null, '很甜', '苹果', '3', null, '2018-09-09 00:00:00', '0', '水果', null);
INSERT INTO `product` VALUES ('101', null, '很酸', '桔子', '2', null, null, '0', '水果', null);
INSERT INTO `product` VALUES ('102', null, '333', '333', '333', null, '2018-09-25 00:00:00', '0', '333', null);

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
INSERT INTO `user` VALUES ('1', '盛新军', 'FBCF54EF63626E185E6565FC7C391126', '18360916461', null, null, null, '498740190@qq.com', null, null);
INSERT INTO `user` VALUES ('4', 'sxj', '98544FC40293F2C9148832BA8FF045B3', '17895216461', null, null, '2018-09-06 00:00:00', '164883349@qq.com', null, null);
INSERT INTO `user` VALUES ('9', '18111111111', '1B938654C49BE5D739FCE14B3F4F4DEF', '18111111111', null, null, '2018-09-06 18:17:54', '18111111111', null, null);
