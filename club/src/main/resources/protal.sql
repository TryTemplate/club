/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : protal

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-09-14 16:49:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hm_home_information
-- ----------------------------
DROP TABLE IF EXISTS `hm_home_information`;
CREATE TABLE `hm_home_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `title` varchar(255) DEFAULT NULL COMMENT 'Title',
  `urlpath` varchar(1000) DEFAULT NULL COMMENT '存储路径',
  `sorting` int(255) DEFAULT NULL COMMENT '排序',
  `status` varchar(11) DEFAULT '1' COMMENT '启用 1.启用,0.关闭',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_delete` varchar(255) DEFAULT '1' COMMENT '是否删除 1.正常,0.删除',
  `admin_id` int(11) DEFAULT NULL COMMENT '操作人id',
  `admin_name` varchar(255) DEFAULT NULL COMMENT '操作人姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='首页资讯';

-- ----------------------------
-- Records of hm_home_information
-- ----------------------------

-- ----------------------------
-- Table structure for hm_menu_mainmenu
-- ----------------------------
DROP TABLE IF EXISTS `hm_menu_mainmenu`;
CREATE TABLE `hm_menu_mainmenu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `title` varchar(255) DEFAULT NULL COMMENT '菜单名称',
  `url` varchar(1350) DEFAULT NULL COMMENT '菜单目标路径',
  `remarks` varchar(500) DEFAULT NULL COMMENT '备注',
  `v_out_id` int(11) DEFAULT '0' COMMENT '主菜单外键id',
  `sorting` varchar(255) DEFAULT NULL COMMENT '排序',
  `status` varchar(255) DEFAULT '1' COMMENT '状态 1.启用,0未启用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_delete` varchar(255) DEFAULT '1' COMMENT '是否删除 1.正常,0.删除',
  `admin_id` int(11) DEFAULT NULL COMMENT '操作人id',
  `admin_name` varchar(255) DEFAULT NULL COMMENT '操作人姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='首页主菜单';

-- ----------------------------
-- Records of hm_menu_mainmenu
-- ----------------------------
INSERT INTO `hm_menu_mainmenu` VALUES ('1', '产品', 'www.baidu.com', '公司产品简介', '0', '2', '1', '2017-09-12 17:42:39', '2017-09-12 17:43:02', '1', '0', null);
INSERT INTO `hm_menu_mainmenu` VALUES ('2', '站域', 'www.eici.club', '网站地址', '0', '1', '1', '2017-09-12 17:47:04', '2017-09-12 17:51:28', '1', '0', null);

-- ----------------------------
-- Table structure for hm_menu_submenu
-- ----------------------------
DROP TABLE IF EXISTS `hm_menu_submenu`;
CREATE TABLE `hm_menu_submenu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `title` varchar(255) DEFAULT NULL COMMENT '菜单名称',
  `url` varchar(1350) DEFAULT NULL COMMENT '菜单目标路径',
  `remarks` varchar(500) DEFAULT NULL COMMENT '备注',
  `v_out_id` int(11) DEFAULT NULL COMMENT '子菜单外键id',
  `sorting` varchar(255) DEFAULT NULL COMMENT '排序',
  `status` varchar(255) DEFAULT '1' COMMENT '状态 1.启用,0未启用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_delete` varchar(255) DEFAULT '1' COMMENT '是否删除 1.正常,0.删除',
  `admin_id` int(11) DEFAULT NULL COMMENT '操作人id',
  `admin_name` varchar(255) DEFAULT NULL COMMENT '操作人姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='首页子菜单';

-- ----------------------------
-- Records of hm_menu_submenu
-- ----------------------------
INSERT INTO `hm_menu_submenu` VALUES ('1', '谷歌', 'www.google.cn', '子菜单一', '2', '0', '1', '2017-09-12 17:49:01', '2017-09-12 17:52:47', '1', '0', null);

-- ----------------------------
-- Table structure for sys_authority
-- ----------------------------
DROP TABLE IF EXISTS `sys_authority`;
CREATE TABLE `sys_authority` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `aut_name` varchar(255) DEFAULT NULL COMMENT '权限(模块)名称',
  `aut_note` varchar(255) DEFAULT NULL COMMENT '权限备注',
  `aut_url` varchar(500) DEFAULT NULL COMMENT '权限地址',
  `status` varchar(255) DEFAULT NULL COMMENT '状态 1.启用,0.停用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_delete` varchar(255) DEFAULT NULL COMMENT '是否删除 1.正常,0.删除',
  `admin_id` int(11) DEFAULT NULL COMMENT '操作人id',
  `admin_name` varchar(255) DEFAULT NULL COMMENT '操作人姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of sys_authority
-- ----------------------------

-- ----------------------------
-- Table structure for sys_files
-- ----------------------------
DROP TABLE IF EXISTS `sys_files`;
CREATE TABLE `sys_files` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `use_id` int(11) DEFAULT NULL COMMENT '使用id (某表id)',
  `use_type` varchar(255) DEFAULT NULL COMMENT '使用分类 (表示某表)',
  `name` varchar(255) DEFAULT NULL COMMENT '文件名称',
  `size` double DEFAULT NULL COMMENT '文件大小 单位(kb)',
  `type` varchar(255) DEFAULT NULL COMMENT '文件类型',
  `url_path` varchar(255) DEFAULT NULL COMMENT '存储路径',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_delete` varchar(255) DEFAULT NULL COMMENT '是否删除 1.正常,0删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_files
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `role_name` varchar(255) DEFAULT NULL COMMENT '角色名称',
  `role_note` varchar(255) DEFAULT NULL COMMENT '权限备注',
  `status` varchar(255) DEFAULT NULL COMMENT '是否启用 1.启用,0禁用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_delete` varchar(255) DEFAULT NULL,
  `admin_id` int(11) DEFAULT NULL COMMENT '操作人id',
  `admin_name` varchar(255) DEFAULT NULL COMMENT '操作人姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role_aut
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_aut`;
CREATE TABLE `sys_role_aut` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  `aut_id` int(11) DEFAULT NULL COMMENT '权限id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_delete` varchar(255) DEFAULT NULL COMMENT '是否删除 1.正常,0.删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限表';

-- ----------------------------
-- Records of sys_role_aut
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user_admin
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_admin`;
CREATE TABLE `sys_user_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `account` varchar(255) NOT NULL COMMENT '账号',
  `password` varbinary(255) DEFAULT NULL COMMENT '密码',
  `user_id` int(10) unsigned NOT NULL COMMENT '用户id',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户昵称',
  `user_real_name` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别 1.男,2.女,3.其他',
  `customer_type` varchar(255) DEFAULT NULL COMMENT '用户类型 1.用户 2.后台管理',
  `avatar_path` varchar(255) DEFAULT NULL COMMENT '头像路径',
  `status` varchar(255) DEFAULT NULL COMMENT '状态 1.正常,0.冻结',
  `is_delete` varchar(255) DEFAULT '1' COMMENT '是否是否删除 1.正常,0.删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `admin_id` int(11) DEFAULT NULL COMMENT '操作人姓名',
  `admin_name` varchar(255) DEFAULT NULL COMMENT '操作人姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user_admin
-- ----------------------------
INSERT INTO `sys_user_admin` VALUES ('1', 'test', 0x59B7C2B2CC04D1C73DE9B238F0B9DD24, '1', '管理员', 'admin', '1', '1', 'D://pathavatar', '1', '1', '2017-07-17 12:04:58', '2017-09-12 15:03:25', '0', '前台测试账户');
INSERT INTO `sys_user_admin` VALUES ('2', 'admin', 0x03E75D99CBC0896EAD8B9DEB8F1F8AF4, '2', '后台管理员', 'admin', '1', '2', 'D://pathavatar', '1', '1', '2017-09-12 15:01:56', '2017-09-12 15:02:09', '0', '超级管理员');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_delete` varchar(255) DEFAULT NULL COMMENT '是否删除 1.正常,0.删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------

-- ----------------------------
-- Table structure for sys_version_update_record
-- ----------------------------
DROP TABLE IF EXISTS `sys_version_update_record`;
CREATE TABLE `sys_version_update_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `theme` varchar(255) DEFAULT NULL COMMENT '主题',
  `update_details` varchar(255) DEFAULT NULL COMMENT '更新详情',
  `new_version` varchar(255) DEFAULT NULL COMMENT '新版本',
  `original_version` varchar(255) DEFAULT NULL COMMENT '原版本',
  `important_updates` varchar(255) DEFAULT '0' COMMENT '是否属于重要更新 1.是,0.否',
  `epoch_version` varchar(255) DEFAULT NULL COMMENT '更新所属纪元版本',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_delete` varchar(255) DEFAULT '1' COMMENT '是否删除 1.正常,0.删除',
  `admin_id` int(11) DEFAULT NULL COMMENT '操作人id',
  `admin_name` varchar(255) DEFAULT NULL COMMENT '操作人姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='版本记录';

-- ----------------------------
-- Records of sys_version_update_record
-- ----------------------------
