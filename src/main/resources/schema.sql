drop all objects;
CREATE TABLE stockpaints AS SELECT * FROM CSVREAD('classpath:StockColors.csv');
create table userPaints(
                      id BIGINT not null AUTO_INCREMENT,
                      brand varchar(100) not null,
                      range varchar(100) not null,
                      name varchar(100) not null,
                      hex varchar(100) ,
                      PRIMARY KEY ( id )
);
