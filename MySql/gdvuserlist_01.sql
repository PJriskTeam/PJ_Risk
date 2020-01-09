/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : henghong

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2020-01-09 15:04:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for gdvuserlist_01
-- ----------------------------
DROP TABLE IF EXISTS `gdvuserlist_01`;
CREATE TABLE `gdvuserlist_01` (
  `ddlBranch_id` varchar(255) NOT NULL,
  `ddlBranch` varchar(255) DEFAULT NULL,
  `ddlDept` varchar(255) DEFAULT NULL,
  `txtUserCd` varchar(255) DEFAULT NULL,
  `txtFullName` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gdvuserlist_01
-- ----------------------------
INSERT INTO `gdvuserlist_01` VALUES ('1', '名古屋支社', '经营管理部1', '1', '小1');
INSERT INTO `gdvuserlist_01` VALUES ('2', '本社', '经营管理部2', '2', '小2');
INSERT INTO `gdvuserlist_01` VALUES ('3', '関東支社', '经营管理部3', '3', '小3');
