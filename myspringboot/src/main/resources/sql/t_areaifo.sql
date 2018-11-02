/*
SQLyog Ultimate v11.25 (64 bit)
MySQL - 8.0.4-rc-log 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `t_areainfo` (
	`id` int (11),
	`level` int (11),
	`name` varchar (765),
	`parentId` int (11),
	`status` int (11)
); 
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('1','0','中国','0','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('2','0','华北区','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('3','0','华南区','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('4','0','北京','2','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('5','0','海淀区','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('6','0','丰台区','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('7','0','朝阳区','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('8','0','北京XX区1','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('9','0','北京XX区2','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('10','0','北京XX区3','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('11','0','北京XX区4','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('12','0','北京XX区5','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('13','0','北京XX区6','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('14','0','北京XX区7','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('15','0','北京XX区8','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('16','0','北京XX区9','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('17','0','北京XX区10','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('18','0','北京XX区11','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('19','0','北京XX区12','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('20','0','北京XX区13','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('21','0','北京XX区14','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('22','0','北京XX区15','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('23','0','北京XX区16','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('24','0','北京XX区17','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('25','0','北京XX区18','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('26','0','北京XX区19','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('27','0','北京XX区1','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('28','0','北京XX区2','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('29','0','北京XX区3','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('30','0','北京XX区4','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('31','0','北京XX区5','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('32','0','北京XX区6','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('33','0','北京XX区7','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('34','0','北京XX区8','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('35','0','北京XX区9','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('36','0','北京XX区10','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('37','0','北京XX区11','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('38','0','北京XX区12','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('39','0','北京XX区13','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('40','0','北京XX区14','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('41','0','北京XX区15','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('42','0','北京XX区16','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('43','0','北京XX区17','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('44','0','北京XX区18','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('45','0','北京XX区19','4','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('46','0','xx省1','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('47','0','xx省2','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('48','0','xx省3','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('49','0','xx省4','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('50','0','xx省5','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('51','0','xx省6','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('52','0','xx省7','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('53','0','xx省8','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('54','0','xx省9','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('55','0','xx省10','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('56','0','xx省11','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('57','0','xx省12','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('58','0','xx省13','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('59','0','xx省14','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('60','0','xx省15','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('61','0','xx省16','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('62','0','xx省17','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('63','0','xx省18','1','0');
insert into `t_areainfo` (`id`, `level`, `name`, `parentId`, `status`) values('64','0','xx省19','1','0');
