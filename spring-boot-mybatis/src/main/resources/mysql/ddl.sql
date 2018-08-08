-- 关闭外键约束
SET FOREIGN_KEY_CHECKS = 0;

/*创建系统用户表*/

-- 如果表存在就删除表结构和数据
DROP TABLE IF EXISTS `sys_users`;

-- 建表sql
CREATE TABLE `sys_users` (
  `id` BIGINT(32) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `username` VARCHAR(64) NOT NULL COMMENT '用户名',
  `password` VARCHAR(64) NOT NULL COMMENT '密码',
  `sex` VARCHAR(32) NOT NULL COMMENT '性别',
  `age` INT(3) NOT NULL DEFAULT 1 COMMENT '年龄',
  `born` DATE DEFAULT NULL COMMENT '出生日期',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 30 DEFAULT CHARSET = utf8 COMMENT '系统用户表';

-- 初始化一条数据
INSERT sys_users(username, password, sex, age, born) VALUES ('heshengbang', '123456', 'MALE', '99', '2018-08-07 22:23:11');

/*创建系统角色表*/

-- 如果系统角色表存在就删除表结构和数据
DROP TABLE IF EXISTS  `sys_roles`;

-- 建表sql
CREATE TABLE `sys_roles` (
  `id` BIGINT(32) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `role_name` VARCHAR(64) NOT NULL COMMENT '角色名',
  `note` VARCHAR(256) COMMENT '角色备注',
  `create_time` DATE NOT NULL COMMENT '创建时间',
  `level` INT NOT NULL COMMENT '角色等级',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 30 DEFAULT CHARSET = utf8 COMMENT '系统角色表';

-- 初始化一条数据
INSERT sys_roles(role_name, note, create_time, level) VALUES ('ADMINISTRATOR', '系统管理员', '2018-08-08', '10');