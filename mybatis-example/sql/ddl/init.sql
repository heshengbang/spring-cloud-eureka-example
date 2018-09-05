drop table country if exists;

create table country (
  ID int primary key auto_increment,
  COUNTRY_NAME varchar(32),
  COUNTRY_CODE varchar(2)
);

insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(1,'Angola','AO');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(2,'Afghanistan','AF');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(3,'Albania','AL');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(4,'Algeria','DZ');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(5,'Andorra','AD');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(6,'Anguilla','AI');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(7,'Antigua and Barbuda','AG');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(8,'Argentina','AR');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(9,'Armenia','AM');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(10,'Australia','AU');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(11,'Austria','AT');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(12,'Azerbaijan','AZ');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(13,'Bahamas','BS');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(14,'Bahrain','BH');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(15,'Bangladesh','BD');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(16,'Barbados','BB');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(17,'Belarus','BY');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(18,'Belgium','BE');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(19,'Belize','BZ');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(20,'Benin','BJ');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(21,'Bermuda Is.','BM');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(22,'Bolivia','BO');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(23,'Botswana','BW');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(24,'Brazil','BR');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(25,'Brunei','BN');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(26,'Bulgaria','BG');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(27,'Burkina-faso','BF');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(28,'Burma','MM');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(29,'Burundi','BI');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(30,'Cameroon','CM');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(31,'Canada','CA');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(32,'Central African Republic','CF');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(33,'Chad','TD');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(34,'Chile','CL');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(35,'China','CN');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(36,'Colombia','CO');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(37,'Congo','CG');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(38,'Cook Is.','CK');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(39,'Costa Rica','CR');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(40,'Cuba','CU');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(41,'Cyprus','CY');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(42,'Czech Republic','CZ');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(43,'Denmark','DK');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(44,'Djibouti','DJ');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(45,'Dominica Rep.','DO');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(46,'Ecuador','EC');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(47,'Egypt','EG');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(48,'EI Salvador','SV');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(49,'Estonia','EE');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(50,'Ethiopia','ET');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(51,'Fiji','FJ');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(52,'Finland','FI');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(53,'France','FR');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(54,'French Guiana','GF');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(55,'Gabon','GA');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(56,'Gambia','GM');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(57,'Georgia','GE');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(58,'Germany','DE');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(59,'Ghana','GH');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(60,'Gibraltar','GI');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(61,'Greece','GR');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(62,'Grenada','GD');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(63,'Guam','GU');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(64,'Guatemala','GT');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(65,'Guinea','GN');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(66,'Guyana','GY');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(67,'Haiti','HT');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(68,'Honduras','HN');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(69,'Hongkong','HK');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(70,'Hungary','HU');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(71,'Iceland','IS');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(72,'India','IN');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(73,'Indonesia','ID');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(74,'Iran','IR');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(75,'Iraq','IQ');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(76,'Ireland','IE');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(77,'Israel','IL');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(78,'Italy','IT');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(79,'Jamaica','JM');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(80,'Japan','JP');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(81,'Jordan','JO');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(82,'Kampuchea (Cambodia )','KH');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(83,'Kazakstan','KZ');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(84,'Kenya','KE');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(85,'Korea','KR');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(86,'Kuwait','KW');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(87,'Kyrgyzstan','KG');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(88,'Laos','LA');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(89,'Latvia','LV');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(90,'Lebanon','LB');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(91,'Lesotho','LS');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(92,'Liberia','LR');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(93,'Libya','LY');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(94,'Liechtenstein','LI');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(95,'Lithuania','LT');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(96,'Luxembourg','LU');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(97,'Macao','MO');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(98,'Madagascar','MG');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(99,'Malawi','MW');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(100,'Malaysia','MY');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(101,'Maldives','MV');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(102,'Mali','ML');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(103,'Malta','MT');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(104,'Mauritius','MU');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(105,'Mexico','MX');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(106,'Moldova, Republic of','MD');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(107,'Monaco','MC');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(108,'Mongolia','MN');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(109,'Montserrat Is','MS');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(110,'Morocco','MA');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(111,'Mozambique','MZ');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(112,'Namibia','NA');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(113,'Nauru','NR');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(114,'Nepal','NP');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(115,'Netherlands','NL');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(116,'New Zealand','NZ');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(117,'Nicaragua','NI');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(118,'Niger','NE');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(119,'Nigeria','NG');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(120,'North Korea','KP');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(121,'Norway','NO');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(122,'Oman','OM');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(123,'Pakistan','PK');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(124,'Panama','PA');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(125,'Papua New Cuinea','PG');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(126,'Paraguay','PY');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(127,'Peru','PE');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(128,'Philippines','PH');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(129,'Poland','PL');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(130,'French Polynesia','PF');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(131,'Portugal','PT');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(132,'Puerto Rico','PR');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(133,'Qatar','QA');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(134,'Romania','RO');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(135,'Russia','RU');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(136,'Saint Lueia','LC');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(137,'Saint Vincent','VC');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(138,'San Marino','SM');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(139,'Sao Tome and Principe','ST');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(140,'Saudi Arabia','SA');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(141,'Senegal','SN');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(142,'Seychelles','SC');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(143,'Sierra Leone','SL');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(144,'Singapore','SG');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(145,'Slovakia','SK');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(146,'Slovenia','SI');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(147,'Solomon Is','SB');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(148,'Somali','SO');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(149,'South Africa','ZA');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(150,'Spain','ES');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(151,'Sri Lanka','LK');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(152,'St.Lucia','LC');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(153,'St.Vincent','VC');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(154,'Sudan','SD');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(155,'Suriname','SR');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(156,'Swaziland','SZ');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(157,'Sweden','SE');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(158,'Switzerland','CH');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(159,'Syria','SY');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(160,'Taiwan','TW');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(161,'Tajikstan','TJ');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(162,'Tanzania','TZ');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(163,'Thailand','TH');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(164,'Togo','TG');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(165,'Tonga','TO');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(166,'TrinIDad and Tobago','TT');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(167,'Tunisia','TN');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(168,'Turkey','TR');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(169,'Turkmenistan','TM');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(170,'Uganda','UG');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(171,'Ukraine','UA');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(172,'United Arab Emirates','AE');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(173,'United Kiongdom','GB');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(174,'United States of America','US');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(175,'Uruguay','UY');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(176,'Uzbekistan','UZ');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(177,'Venezuela','VE');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(178,'Vietnam','VN');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(179,'Yemen','YE');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(180,'Yugoslavia','YU');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(181,'Zimbabwe','ZW');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(182,'Zaire','ZR');
insert into country (ID, COUNTRY_NAME, COUNTRY_CODE) values(183,'Zambia','ZM');