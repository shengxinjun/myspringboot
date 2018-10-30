/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-10-30 17:29:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `clazz`
-- ----------------------------
DROP TABLE IF EXISTS `clazz`;
CREATE TABLE `clazz` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '班级名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of clazz
-- ----------------------------
INSERT INTO `clazz` VALUES ('1', '1301');
INSERT INTO `clazz` VALUES ('2', '1302');
INSERT INTO `clazz` VALUES ('3', 'fff');

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
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '课程名称',
  `type` varchar(255) DEFAULT NULL COMMENT '考试类型',
  `clazz_id` int(255) DEFAULT NULL COMMENT '班级id',
  `weight` float(255,0) DEFAULT NULL COMMENT '课程权重',
  `code` varchar(255) DEFAULT NULL COMMENT '指标点代码',
  `normal_percent` float(255,0) DEFAULT NULL COMMENT '平时成绩百分比',
  `terminal_percent` float(255,0) DEFAULT NULL COMMENT '期末成绩百分比',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------

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
INSERT INTO `email_info` VALUES ('45', null, '498740190@qq.com', '验证码为：704627', '704627', '找回密码', '2018-10-22 17:28:38', '180.111.103.26');
INSERT INTO `email_info` VALUES ('46', null, '498740190@qq.com', '你的新密码为：583652', null, 'topest level---ace system', '2018-10-22 17:28:58', null);
INSERT INTO `email_info` VALUES ('47', null, '498740190@qq.com', '验证码为：437163', '437163', '找回密码', '2018-10-29 16:19:49', '153.99.44.199');
INSERT INTO `email_info` VALUES ('48', null, '498740190@qq.com', '你的新密码为：698157', null, 'topest level---ace system', '2018-10-29 16:20:43', null);

-- ----------------------------
-- Table structure for `exam_con`
-- ----------------------------
DROP TABLE IF EXISTS `exam_con`;
CREATE TABLE `exam_con` (
  `eid` int(11) NOT NULL,
  `coursename` text,
  `exam` text,
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam_con
-- ----------------------------
INSERT INTO `exam_con` VALUES ('1', '马原', '<list>\n  <题型:>\n    <id>80</id>\n    <num>五</num>\n    <name>叙述题</name>\n    <count>2</count>\n    <score>10.0</score>\n    <percent>0.3</percent>\n    <ascore>3.0</ascore>\n    <countScore>20</countScore>\n    <proxml>&lt;list&gt; &lt;com.domain.Problem&gt; &lt;id&gt;12437425&lt;/id&gt; &lt;num&gt;1&lt;/num&gt; &lt;name&gt;叙述题&lt;/name&gt; &lt;score&gt;5.0&lt;/score&gt; &lt;percent&gt;0.3&lt;/percent&gt; &lt;ascore&gt;1.5&lt;/ascore&gt; &lt;questionId&gt;80&lt;/questionId&gt; &lt;/com.domain.Problem&gt; &lt;com.domain.Problem&gt; &lt;id&gt;16458285&lt;/id&gt; &lt;num&gt;2&lt;/num&gt; &lt;name&gt;叙述题&lt;/name&gt; &lt;score&gt;1.0&lt;/score&gt; &lt;percent&gt;0.3&lt;/percent&gt; &lt;ascore&gt;0.3&lt;/ascore&gt; &lt;questionId&gt;80&lt;/questionId&gt; &lt;/com.domain.Problem&gt; &lt;/list&gt;</proxml>\n    <problemList>\n      <com.domain.Problem>\n        <id>12437425</id>\n        <num>1</num>\n        <name>叙述题</name>\n        <score>5.0</score>\n        <percent>0.3</percent>\n        <ascore>1.5</ascore>\n        <questionId>80</questionId>\n      </com.domain.Problem>\n      <com.domain.Problem>\n        <id>16458285</id>\n        <num>2</num>\n        <name>叙述题</name>\n        <score>1.0</score>\n        <percent>0.3</percent>\n        <ascore>0.3</ascore>\n        <questionId>80</questionId>\n      </com.domain.Problem>\n    </problemList>\n  </题型:>\n  <题型:>\n    <id>90</id>\n    <num>六</num>\n    <name>附加题</name>\n    <count>3</count>\n    <score>5.0</score>\n    <percent>0.3</percent>\n    <ascore>1.5</ascore>\n    <countScore>15</countScore>\n    <proxml>&lt;list&gt; &lt;com.domain.Problem&gt; &lt;id&gt;10134678&lt;/id&gt; &lt;num&gt;1&lt;/num&gt; &lt;name&gt;附加题&lt;/name&gt; &lt;score&gt;4.0&lt;/score&gt; &lt;percent&gt;0.3&lt;/percent&gt; &lt;ascore&gt;1.2&lt;/ascore&gt; &lt;questionId&gt;90&lt;/questionId&gt; &lt;/com.domain.Problem&gt; &lt;com.domain.Problem&gt; &lt;id&gt;19917654&lt;/id&gt; &lt;num&gt;2&lt;/num&gt; &lt;name&gt;附加题&lt;/name&gt; &lt;score&gt;2.0&lt;/score&gt; &lt;percent&gt;0.3&lt;/percent&gt; &lt;ascore&gt;1.5&lt;/ascore&gt; &lt;questionId&gt;90&lt;/questionId&gt; &lt;/com.domain.Problem&gt; &lt;com.domain.Problem&gt; &lt;id&gt;12047004&lt;/id&gt; &lt;num&gt;3&lt;/num&gt; &lt;name&gt;附加题&lt;/name&gt; &lt;score&gt;5.0&lt;/score&gt; &lt;percent&gt;0.3&lt;/percent&gt; &lt;ascore&gt;1.5&lt;/ascore&gt; &lt;questionId&gt;90&lt;/questionId&gt; &lt;/com.domain.Problem&gt; &lt;/list&gt;</proxml>\n    <problemList>\n      <com.domain.Problem>\n        <id>10134678</id>\n        <num>1</num>\n        <name>附加题</name>\n        <score>4.0</score>\n        <percent>0.3</percent>\n        <ascore>1.2</ascore>\n        <questionId>90</questionId>\n      </com.domain.Problem>\n      <com.domain.Problem>\n        <id>19917654</id>\n        <num>2</num>\n        <name>附加题</name>\n        <score>2.0</score>\n        <percent>0.3</percent>\n        <ascore>1.5</ascore>\n        <questionId>90</questionId>\n      </com.domain.Problem>\n      <com.domain.Problem>\n        <id>12047004</id>\n        <num>3</num>\n        <name>附加题</name>\n        <score>5.0</score>\n        <percent>0.3</percent>\n        <ascore>1.5</ascore>\n        <questionId>90</questionId>\n      </com.domain.Problem>\n    </problemList>\n  </题型:>\n  <题型:>\n    <id>92</id>\n    <num>七</num>\n    <name>盛新军</name>\n    <count>3</count>\n    <score>2.0</score>\n    <percent>0.5</percent>\n    <ascore>1.0</ascore>\n    <countScore>8</countScore>\n    <proxml>&lt;list&gt; &lt;com.domain.Problem&gt; &lt;id&gt;17024886&lt;/id&gt; &lt;num&gt;1&lt;/num&gt; &lt;name&gt;盛新军&lt;/name&gt; &lt;score&gt;20.0&lt;/score&gt; &lt;percent&gt;0.5&lt;/percent&gt; &lt;ascore&gt;25.0&lt;/ascore&gt; &lt;questionId&gt;92&lt;/questionId&gt; &lt;/com.domain.Problem&gt; &lt;com.domain.Problem&gt; &lt;id&gt;13293148&lt;/id&gt; &lt;num&gt;2&lt;/num&gt; &lt;name&gt;盛新军&lt;/name&gt; &lt;score&gt;2.0&lt;/score&gt; &lt;percent&gt;0.5&lt;/percent&gt; &lt;ascore&gt;1.0&lt;/ascore&gt; &lt;questionId&gt;92&lt;/questionId&gt; &lt;/com.domain.Problem&gt; &lt;com.domain.Problem&gt; &lt;id&gt;10982535&lt;/id&gt; &lt;num&gt;3&lt;/num&gt; &lt;name&gt;盛新军&lt;/name&gt; &lt;score&gt;2.0&lt;/score&gt; &lt;percent&gt;0.5&lt;/percent&gt; &lt;ascore&gt;1.0&lt;/ascore&gt; &lt;questionId&gt;92&lt;/questionId&gt; &lt;/com.domain.Problem&gt; &lt;/list&gt;</proxml>\n    <problemList>\n      <com.domain.Problem>\n        <id>17024886</id>\n        <num>1</num>\n        <name>盛新军</name>\n        <score>20.0</score>\n        <percent>0.5</percent>\n        <ascore>25.0</ascore>\n        <questionId>92</questionId>\n      </com.domain.Problem>\n      <com.domain.Problem>\n        <id>13293148</id>\n        <num>2</num>\n        <name>盛新军</name>\n        <score>2.0</score>\n        <percent>0.5</percent>\n        <ascore>1.0</ascore>\n        <questionId>92</questionId>\n      </com.domain.Problem>\n      <com.domain.Problem>\n        <id>10982535</id>\n        <num>3</num>\n        <name>盛新军</name>\n        <score>2.0</score>\n        <percent>0.5</percent>\n        <ascore>1.0</ascore>\n        <questionId>92</questionId>\n      </com.domain.Problem>\n    </problemList>\n  </题型:>\n  <题型:>\n    <id>96</id>\n    <num>八</num>\n    <name>选择题</name>\n    <count>5</count>\n    <score>1.0</score>\n    <percent>0.2</percent>\n    <ascore>0.2</ascore>\n    <countScore>20</countScore>\n    <proxml>&lt;list&gt; &lt;com.domain.Problem&gt; &lt;id&gt;13255938&lt;/id&gt; &lt;num&gt;1&lt;/num&gt; &lt;name&gt;选择题&lt;/name&gt; &lt;score&gt;2.0&lt;/score&gt; &lt;percent&gt;0.2&lt;/percent&gt; &lt;ascore&gt;0.2&lt;/ascore&gt; &lt;questionId&gt;96&lt;/questionId&gt; &lt;/com.domain.Problem&gt; &lt;com.domain.Problem&gt; &lt;id&gt;19321818&lt;/id&gt; &lt;num&gt;2&lt;/num&gt; &lt;name&gt;选择题&lt;/name&gt; &lt;score&gt;50.0&lt;/score&gt; &lt;percent&gt;0.2&lt;/percent&gt; &lt;ascore&gt;2.0&lt;/ascore&gt; &lt;questionId&gt;96&lt;/questionId&gt; &lt;/com.domain.Problem&gt; &lt;com.domain.Problem&gt; &lt;id&gt;10112221&lt;/id&gt; &lt;num&gt;3&lt;/num&gt; &lt;name&gt;选择题&lt;/name&gt; &lt;score&gt;5.0&lt;/score&gt; &lt;percent&gt;0.2&lt;/percent&gt; &lt;ascore&gt;0.2&lt;/ascore&gt; &lt;questionId&gt;96&lt;/questionId&gt; &lt;/com.domain.Problem&gt; &lt;com.domain.Problem&gt; &lt;id&gt;19730096&lt;/id&gt; &lt;num&gt;4&lt;/num&gt; &lt;name&gt;选择题&lt;/name&gt; &lt;score&gt;1.0&lt;/score&gt; &lt;percent&gt;0.2&lt;/percent&gt; &lt;ascore&gt;0.2&lt;/ascore&gt; &lt;questionId&gt;96&lt;/questionId&gt; &lt;/com.domain.Problem&gt; &lt;com.domain.Problem&gt; &lt;id&gt;19660948&lt;/id&gt; &lt;num&gt;5&lt;/num&gt; &lt;name&gt;选择题&lt;/name&gt; &lt;score&gt;1.0&lt;/score&gt; &lt;percent&gt;0.2&lt;/percent&gt; &lt;ascore&gt;0.2&lt;/ascore&gt; &lt;questionId&gt;96&lt;/questionId&gt; &lt;/com.domain.Problem&gt; &lt;/list&gt;</proxml>\n    <problemList>\n      <com.domain.Problem>\n        <id>13255938</id>\n        <num>1</num>\n        <name>选择题</name>\n        <score>2.0</score>\n        <percent>0.2</percent>\n        <ascore>0.2</ascore>\n        <questionId>96</questionId>\n      </com.domain.Problem>\n      <com.domain.Problem>\n        <id>19321818</id>\n        <num>2</num>\n        <name>选择题</name>\n        <score>50.0</score>\n        <percent>0.2</percent>\n        <ascore>2.0</ascore>\n        <questionId>96</questionId>\n      </com.domain.Problem>\n      <com.domain.Problem>\n        <id>10112221</id>\n        <num>3</num>\n        <name>选择题</name>\n        <score>5.0</score>\n        <percent>0.2</percent>\n        <ascore>0.2</ascore>\n        <questionId>96</questionId>\n      </com.domain.Problem>\n      <com.domain.Problem>\n        <id>19730096</id>\n        <num>4</num>\n        <name>选择题</name>\n        <score>1.0</score>\n        <percent>0.2</percent>\n        <ascore>0.2</ascore>\n        <questionId>96</questionId>\n      </com.domain.Problem>\n      <com.domain.Problem>\n        <id>19660948</id>\n        <num>5</num>\n        <name>选择题</name>\n        <score>1.0</score>\n        <percent>0.2</percent>\n        <ascore>0.2</ascore>\n        <questionId>96</questionId>\n      </com.domain.Problem>\n    </problemList>\n  </题型:>\n</list>');

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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of file
-- ----------------------------
INSERT INTO `file` VALUES ('1', '新建文本文档 - 副本.doc', '/2907469d-104e-4667-9ef1-b9c63b0d3f32/新建文本文档 - 副本.doc', '1', '49');
INSERT INTO `file` VALUES ('3', '新建文本文档.doc', '/f14c753e-0dcd-4c8b-a1c7-7ab6f7f4ece6/新建文本文档.doc', '1', '51');
INSERT INTO `file` VALUES ('4', '新建文本文档 - 副本.doc', '/09e4a011-7f73-4694-92a0-10674d8d570e/新建文本文档 - 副本.doc', '1', '51');
INSERT INTO `file` VALUES ('5', '调解书申请.png', 'http://172.16.239.107/0d670a10-7c40-4951-a5f5-76e0a635428a/调解书申请.png', '1', '19');
INSERT INTO `file` VALUES ('6', '调解进展.png', 'http://172.16.239.107/29dfc2ba-3bec-417a-8a78-5ba4284da2b3/调解进展.png', '1', '19');

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
INSERT INTO `order` VALUES ('25', '2', '1', '222', '0', '2018-09-12 00:00:00');
INSERT INTO `order` VALUES ('26', '2', '5', '21', '0', '2018-09-28 00:00:00');
INSERT INTO `order` VALUES ('49', '11', '2', '11', '0', null);
INSERT INTO `order` VALUES ('50', '22', '22222', '333', '0', '2018-10-13 00:00:00');
INSERT INTO `order` VALUES ('51', 'w', '22', '222', '0', '2018-10-18 00:00:00');
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
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_item
-- ----------------------------
INSERT INTO `order_item` VALUES ('5', null, 'ff', 'ds', '3', 'asdf', '19');
INSERT INTO `order_item` VALUES ('6', '/b6943e01-5f7b-4066-9ba4-8def4e4199a7/1.sql/;', 'dsa', 'ds', '3', '22', '19');
INSERT INTO `order_item` VALUES ('7', null, null, null, null, null, '19');
INSERT INTO `order_item` VALUES ('8', '/b6943e01-5f7b-4066-9ba4-8def4e4199a7/1.sql/;', 'dsa', 'ds', '3', '22', '19');
INSERT INTO `order_item` VALUES ('9', '/4ac1c3b0-aa5e-438f-ad25-f1782fe121d7/1.sql/;', 'sdd', 'ds', '3', 'dfgds', '19');
INSERT INTO `order_item` VALUES ('10', '/b6943e01-5f7b-4066-9ba4-8def4e4199a7/1.sql/;', 'dsa', 'ds', '3', '22', '19');
INSERT INTO `order_item` VALUES ('11', '/b6943e01-5f7b-4066-9ba4-8def4e4199a7/1.sql/;', 'dsa', 'ds', '3', '22', '19');
INSERT INTO `order_item` VALUES ('12', '/b6943e01-5f7b-4066-9ba4-8def4e4199a7/1.sql/;', 'dsa', 'ds', '3', '22', '19');
INSERT INTO `order_item` VALUES ('13', '/b6943e01-5f7b-4066-9ba4-8def4e4199a7/1.sql/;', 'dsa', 'ds', '3', '22', '19');
INSERT INTO `order_item` VALUES ('14', null, 'das', 'sd', '3', 'fdsf', '19');
INSERT INTO `order_item` VALUES ('15', null, 'ff', 'ds', '3', 'asdf', '19');

-- ----------------------------
-- Table structure for `problem`
-- ----------------------------
DROP TABLE IF EXISTS `problem`;
CREATE TABLE `problem` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '问题名称',
  `score` float(255,0) DEFAULT NULL COMMENT '??',
  `course_id` int(255) DEFAULT NULL COMMENT 'course_id',
  `student_id` int(255) DEFAULT NULL COMMENT 'student_id',
  `question_id` int(255) DEFAULT NULL COMMENT '??question',
  `weight` float(255,0) DEFAULT NULL COMMENT '??',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of problem
-- ----------------------------

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
) ENGINE=InnoDB AUTO_INCREMENT=164 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('7', '/b6943e01-5f7b-4066-9ba4-8def4e4199a7/1.sql/;', 'dsa', 'ds', '3', '2018-10-10 16:03:59', null, '0', '22');
INSERT INTO `product` VALUES ('8', '/4ac1c3b0-aa5e-438f-ad25-f1782fe121d7/1.sql/;', 'sdd', 'ds', '3', '2018-10-10 16:04:33', null, '0', 'dfgds');
INSERT INTO `product` VALUES ('9', null, 'ff', 'ds', '3', null, null, '0', 'asdf');
INSERT INTO `product` VALUES ('10', null, 'das', 'sd', '3', null, null, '0', 'fdsf');
INSERT INTO `product` VALUES ('13', null, 'sdf', 'gvfd', '33', null, null, '0', 'fasdf');
INSERT INTO `product` VALUES ('14', null, 'dsa', 'gvfd', '33', null, null, '0', 'adsfa');
INSERT INTO `product` VALUES ('15', null, 'fafsa', 'bg', '3', null, null, '0', 'adsf');
INSERT INTO `product` VALUES ('16', null, 'fdsfsd', 'ds', '3', null, null, '0', 'asf');
INSERT INTO `product` VALUES ('17', null, 'asdf', 'sda', '3', null, null, '0', 'ad');
INSERT INTO `product` VALUES ('18', null, 'ds', 'sd', '3', null, null, '0', 'ads');
INSERT INTO `product` VALUES ('21', null, 'ds', 'a', '33', null, null, '0', 'dsf');
INSERT INTO `product` VALUES ('22', null, 'asfads', 'fs', '3', null, null, '0', 'sa');
INSERT INTO `product` VALUES ('23', null, 'afd', 'dasd', '3', null, null, '0', 'dsa');
INSERT INTO `product` VALUES ('24', null, 'afd', 'sd', '3', null, null, '0', 'fasdf');
INSERT INTO `product` VALUES ('25', null, null, 'fsd', '3', null, null, '0', 'asd');
INSERT INTO `product` VALUES ('99', null, null, '我问问', '11111', null, '2018-09-19 00:00:00', '0', '11111');
INSERT INTO `product` VALUES ('100', null, '很甜', '苹果', '3', null, '2018-09-09 00:00:00', '0', '水果');
INSERT INTO `product` VALUES ('101', null, '很酸', '桔子', '2', null, null, '0', '水果');
INSERT INTO `product` VALUES ('102', null, '333', '333', '333', null, '2018-09-25 00:00:00', '0', '333');

-- ----------------------------
-- Table structure for `question`
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id号',
  `num` varchar(255) DEFAULT NULL COMMENT '大题序号',
  `name` text COMMENT '题型名称',
  `count` int(255) DEFAULT NULL COMMENT '小题数',
  `score` float(255,0) DEFAULT NULL COMMENT '每道小题分值',
  `percent` float DEFAULT NULL COMMENT '参与比',
  `ascore` float DEFAULT NULL COMMENT '每小题实际得分',
  `count_score` int(11) DEFAULT NULL COMMENT '每个题型总分值',
  `course_id` int(255) DEFAULT NULL COMMENT '属于哪门课程',
  `normal_terminal` int(255) DEFAULT NULL COMMENT '平时成绩1，期末成绩2',
  `proxml` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------
INSERT INTO `question` VALUES ('80', '五', '叙述题', '2', '10', '0.3', '3', '20', null, null, '<list> <com.domain.Problem> <id>12437425</id> <num>1</num> <name>叙述题</name> <score>5.0</score> <percent>0.3</percent> <ascore>1.5</ascore> <questionId>80</questionId> </com.domain.Problem> <com.domain.Problem> <id>16458285</id> <num>2</num> <name>叙述题</name> <score>1.0</score> <percent>0.3</percent> <ascore>0.3</ascore> <questionId>80</questionId> </com.domain.Problem> </list>');
INSERT INTO `question` VALUES ('90', '六', '附加题', '3', '5', '0.3', '1.5', '15', null, null, '<list> <com.domain.Problem> <id>10134678</id> <num>1</num> <name>附加题</name> <score>4.0</score> <percent>0.3</percent> <ascore>1.2</ascore> <questionId>90</questionId> </com.domain.Problem> <com.domain.Problem> <id>19917654</id> <num>2</num> <name>附加题</name> <score>2.0</score> <percent>0.3</percent> <ascore>1.5</ascore> <questionId>90</questionId> </com.domain.Problem> <com.domain.Problem> <id>12047004</id> <num>3</num> <name>附加题</name> <score>5.0</score> <percent>0.3</percent> <ascore>1.5</ascore> <questionId>90</questionId> </com.domain.Problem> </list>');
INSERT INTO `question` VALUES ('92', '七', '盛新军', '3', '2', '0.5', '1', '8', null, null, '<list> <com.domain.Problem> <id>17024886</id> <num>1</num> <name>盛新军</name> <score>20.0</score> <percent>0.5</percent> <ascore>25.0</ascore> <questionId>92</questionId> </com.domain.Problem> <com.domain.Problem> <id>13293148</id> <num>2</num> <name>盛新军</name> <score>2.0</score> <percent>0.5</percent> <ascore>1.0</ascore> <questionId>92</questionId> </com.domain.Problem> <com.domain.Problem> <id>10982535</id> <num>3</num> <name>盛新军</name> <score>2.0</score> <percent>0.5</percent> <ascore>1.0</ascore> <questionId>92</questionId> </com.domain.Problem> </list>');
INSERT INTO `question` VALUES ('96', '八', '选择题', '5', '1', '0.2', '0.2', '20', null, null, '<list> <com.domain.Problem> <id>13255938</id> <num>1</num> <name>选择题</name> <score>2.0</score> <percent>0.2</percent> <ascore>0.2</ascore> <questionId>96</questionId> </com.domain.Problem> <com.domain.Problem> <id>19321818</id> <num>2</num> <name>选择题</name> <score>50.0</score> <percent>0.2</percent> <ascore>2.0</ascore> <questionId>96</questionId> </com.domain.Problem> <com.domain.Problem> <id>10112221</id> <num>3</num> <name>选择题</name> <score>5.0</score> <percent>0.2</percent> <ascore>0.2</ascore> <questionId>96</questionId> </com.domain.Problem> <com.domain.Problem> <id>19730096</id> <num>4</num> <name>选择题</name> <score>1.0</score> <percent>0.2</percent> <ascore>0.2</ascore> <questionId>96</questionId> </com.domain.Problem> <com.domain.Problem> <id>19660948</id> <num>5</num> <name>选择题</name> <score>1.0</score> <percent>0.2</percent> <ascore>0.2</ascore> <questionId>96</questionId> </com.domain.Problem> </list>');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `number` varchar(255) DEFAULT NULL COMMENT '学号',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `clazz_id` int(255) DEFAULT NULL COMMENT '所属班级',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
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
