CREATE TABLE COM.USER (
  ID INT NOT NULL AUTO_INCREMENT,
  NAME VARCHAR(25) NOT NULL,
  AGE INT(11) NOT NULL,
  ISADMIN  TINYINT(4) NOT NULL,
  CREATEDATE TIMESTAMP NOT NULL,
  PRIMARY KEY (ID));
