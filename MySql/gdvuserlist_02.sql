/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : henghong

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2020-01-09 15:04:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for gdvuserlist_02
-- ----------------------------
DROP TABLE IF EXISTS `gdvuserlist_02`;
CREATE TABLE `gdvuserlist_02` (
  `lnkUserCd` varchar(255) DEFAULT NULL,
  `lblFullName` varchar(255) DEFAULT NULL,
  `lblBranch_id` varchar(255) DEFAULT NULL,
  `lblBranch` varchar(255) DEFAULT NULL,
  `lblSect` varchar(255) DEFAULT NULL,
  `lblPostCls` varchar(255) DEFAULT NULL,
  `lblDept` varchar(255) DEFAULT NULL,
  `txtFullName` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gdvuserlist_02
-- ----------------------------
INSERT INTO `gdvuserlist_02` VALUES ('1', '名古屋支社テスト1', '1', '名古屋支社', 'インフラグルーブ', '取締役技師長', '经营管理部1', '小1');
INSERT INTO `gdvuserlist_02` VALUES ('2', '名古屋支社テスト1', '1', '名古屋支社', '名古屋支社', 'グループ長', '经营管理部2', '小2');
INSERT INTO `gdvuserlist_02` VALUES ('3', '本社テスト１', '2', '本社', '技术グルーブ', '主席', '经营管理部1', '小2');
INSERT INTO `gdvuserlist_02` VALUES ('4', '本社テスト１', '2', '本社', '2チーム', '主任', '经营管理部2', '小3');
INSERT INTO `gdvuserlist_02` VALUES ('5', '东关支社テスト１', '3', '関東支社', '横滨チーム', 'チーム長', '经营管理部1', '小2');
INSERT INTO `gdvuserlist_02` VALUES ('6', '东关支社テスト１', '3', '関東支社', '1チーム', '部長', '经营管理部2', '小1');
