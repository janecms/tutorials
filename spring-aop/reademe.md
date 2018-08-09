# 事务
```sql

DROP TABLE IF EXISTS `trn_person`;
CREATE TABLE `trn_person` (
  `person_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) CHARACTER SET latin1 COLLATE latin1_general_ci NOT NULL,
  `last_name` varchar(45) CHARACTER SET latin1 COLLATE latin1_general_ci NOT NULL,
  `age` int(10) unsigned NOT NULL,
  PRIMARY KEY (`person_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=211 DEFAULT CHARSET=utf8;
```

