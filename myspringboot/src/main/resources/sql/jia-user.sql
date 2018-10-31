/*
MySQL Backup
Source Server Version: 8.0.11
Source Database: test
Date: 2018/11/1 00:33:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL,
  `name` varchar(15) NOT NULL,
  `password` varchar(30) NOT NULL,
  `age` int(2) NOT NULL,
  `deleteFlag` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records
-- ----------------------------
INSERT INTO `user` VALUES ('1','maimai','123456','30','1');
