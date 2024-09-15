CREATE TABLE stock_paints AS SELECT * FROM CSVREAD('classpath:StockColors.csv');
-- AlTER TABLE stock_paints ADD as identity PRIMARY KEY ('ID';
--     ADD COLUMN (ID INT  GENERATED ALWAYS AS IDENTITY PRIMARY KEY);
