/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-10-31 17:20:03
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
INSERT INTO `code_message` VALUES ('108', '小题总分不能大于题型总分');
INSERT INTO `code_message` VALUES ('200', '订单状态异常');
INSERT INTO `code_message` VALUES ('300', '商品状态异常');

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
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of email_info
-- ----------------------------

-- ----------------------------
-- Table structure for `file`
-- ----------------------------
DROP TABLE IF EXISTS `file`;
CREATE TABLE `file` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `file_name` varchar(255) DEFAULT NULL COMMENT '文件名',
  `file_url` varchar(255) DEFAULT NULL COMMENT '文件url',
  `source` int(1) DEFAULT NULL COMMENT '1.order，2.product',
  `source_id` int(255) DEFAULT NULL COMMENT '父id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of file
-- ----------------------------
INSERT INTO `file` VALUES ('12', '调解进展.png', 'http://172.16.239.107/0f7f425c-94f6-4b5d-91f1-cd9edf5a869b/调解进展.png', '1', '74');
INSERT INTO `file` VALUES ('13', '调解书申请.png', 'http://172.16.239.107/6b5351d5-7bc8-4b6f-8572-3f0973e2f9fb/调解书申请.png', '1', '74');
INSERT INTO `file` VALUES ('14', '调解书申请.png', 'http://172.16.239.107/317bf0f3-c8a9-4cb9-b581-60862bcad6db/调解书申请.png', '1', '75');
INSERT INTO `file` VALUES ('15', '调解进展.png', 'http://172.16.239.107/36d5b47a-2455-423a-8835-1a8323e3dbd3/调解进展.png', '1', '75');

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
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('74', '张老板的订单', '1000', '122', '0', '2018-10-31 00:00:00');
INSERT INTO `order` VALUES ('75', '王老板的订单', '10000', '333', '0', '2018-10-31 00:00:00');

-- ----------------------------
-- Table structure for `order_item`
-- ----------------------------
DROP TABLE IF EXISTS `order_item`;
CREATE TABLE `order_item` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `imgs` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` float(255,0) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `order_id` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_item
-- ----------------------------
INSERT INTO `order_item` VALUES ('18', null, '性价比较高的一辆车', '卡罗拉', '100000', '交通工具', '74');
INSERT INTO `order_item` VALUES ('19', null, '山东红富士', '苹果', '5', '水果', '74');
INSERT INTO `order_item` VALUES ('20', null, '不出售给未成年人', '杜蕾斯', '12', '计生用品', '74');
INSERT INTO `order_item` VALUES ('21', null, '喝喝茶，晒晒太阳', '碧螺春', '300', '养生', '74');
INSERT INTO `order_item` VALUES ('22', null, '不出售给未成年人', '杜蕾斯', '12', '计生用品', '75');
INSERT INTO `order_item` VALUES ('23', null, '性价比较高的一辆车', '卡罗拉', '100000', '交通工具', '75');

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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=172 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('164', null, '山东红富士', '苹果', '5', null, '2018-10-31 17:13:29', '0', '水果');
INSERT INTO `product` VALUES ('165', null, '酸死你', '橘子', '4', null, '2018-10-31 17:13:49', '0', '水果');
INSERT INTO `product` VALUES ('166', null, '今年特别贵', '西红柿', '8', null, '2018-10-31 17:14:13', '0', '蔬菜');
INSERT INTO `product` VALUES ('167', null, '不出售给未成年人', '杜蕾斯', '12', null, '2018-10-31 17:14:58', '0', '计生用品');
INSERT INTO `product` VALUES ('168', null, '性价比较高的一辆车', '卡罗拉', '100000', null, '2018-10-31 17:15:36', '0', '交通工具');
INSERT INTO `product` VALUES ('169', null, '大鹏导演作品', '大宝剑', '488', null, '2018-10-31 17:16:35', '0', '武器');
INSERT INTO `product` VALUES ('170', null, '没人用了', '自行车', '300', null, '2018-10-31 17:17:02', '0', '交通工具');
INSERT INTO `product` VALUES ('171', null, '喝喝茶，晒晒太阳', '碧螺春', '300', null, '2018-10-31 17:17:34', '0', '养生');

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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '盛新军', 'A7673F7FDB8AC999B81D8F2BBDC1C0D7', '18360916461', null, null, null, '498740190@qq.com', null, null);
INSERT INTO `user` VALUES ('4', 'sxj', '98544FC40293F2C9148832BA8FF045B3', '17895216461', null, null, '2018-09-06 00:00:00', '164883349@qq.com', null, null);
INSERT INTO `user` VALUES ('9', '18111111111', '1B938654C49BE5D739FCE14B3F4F4DEF', '18111111111', null, null, '2018-09-06 18:17:54', '18111111111', null, null);
INSERT INTO `user` VALUES ('10', '席倩', '4361C9D7296862E5E682E6F095073DBD', '18360922025', null, null, '2018-09-20 10:41:52', '229257574@qq.com', '0', null);
