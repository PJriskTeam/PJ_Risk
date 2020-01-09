/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : henghong

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2020-01-09 15:04:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for risk_prevention_
-- ----------------------------
DROP TABLE IF EXISTS `risk_prevention_`;
CREATE TABLE `risk_prevention_` (
  `project_no` varchar(11) DEFAULT NULL,
  `process_no` varchar(11) DEFAULT NULL,
  `discuss_phase_no` varchar(11) DEFAULT NULL,
  `project_name_temp` varchar(255) DEFAULT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  `order_cd` varchar(255) DEFAULT NULL,
  `relate_order_cd` varchar(255) DEFAULT NULL,
  `customer_type_no` varchar(11) DEFAULT NULL,
  `product_sect_id` varchar(11) DEFAULT NULL,
  `product_sect_cd` varchar(255) DEFAULT NULL,
  `product_sect_nm` varchar(255) DEFAULT NULL,
  `product_user_id` int(11) DEFAULT NULL,
  `product_user_cd` varchar(255) DEFAULT NULL,
  `product_user_fullname` varchar(255) DEFAULT NULL,
  `branch_transaction_flg` varchar(255) DEFAULT NULL,
  `support_branch_id` varchar(11) DEFAULT NULL,
  `support_branch_nm` varchar(255) DEFAULT NULL,
  `branch_quality_manager` varchar(255) DEFAULT NULL,
  `section_quality_manager` varchar(255) DEFAULT NULL,
  `group_quality_manwger` varchar(255) DEFAULT NULL,
  `project_quality_manager` varchar(255) DEFAULT NULL,
  `risk_prevention_manager` varchar(255) DEFAULT NULL,
  `risk_500mil_flg` varchar(255) DEFAULT NULL,
  `rpm_first_product_flg` varchar(255) DEFAULT NULL,
  `first_product_no` int(11) DEFAULT NULL,
  `rpm_first_product_cause` varchar(255) DEFAULT NULL,
  `rpm_special_product_flg` varchar(255) DEFAULT NULL,
  `special_product_no` int(11) DEFAULT NULL,
  `rpm_special_product_cause` varchar(255) DEFAULT NULL,
  `rpm_type` varchar(255) DEFAULT NULL,
  `sm_checksheet_file_name` varchar(255) DEFAULT NULL,
  `sm_checksheet_file` varchar(255) DEFAULT NULL,
  `project_type_no` int(11) DEFAULT NULL,
  `project_complete_flg` varchar(255) DEFAULT NULL,
  `created_on` date DEFAULT NULL,
  `created_user_cd` varchar(255) DEFAULT NULL,
  `created_user_id` int(11) DEFAULT NULL,
  `created_user_name` varchar(255) DEFAULT NULL,
  `modified_on` date DEFAULT NULL,
  `modified_user_cd` varchar(255) DEFAULT NULL,
  `modified_user_id` int(11) DEFAULT NULL,
  `modified_user_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of risk_prevention_
-- ----------------------------
INSERT INTO `risk_prevention_` VALUES ('100365', '営業P(原価)', '引合时', 'システム開発', '三菱重工業', '12481631', null, null, '2', 'システム開発部', 'システム開発部', null, null, null, null, '関東支社', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `risk_prevention_` VALUES ('100366', '営業P(原価)', '闭合时', 'システム開発', '三菱重工業', '12481631', null, null, '2', 'システム開発部', 'システム開発部', null, null, null, null, '関東支社', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
