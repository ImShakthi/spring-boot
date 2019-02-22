CREATE EXTENSION IF NOT EXISTS pgcrypto;

-- CREATE DATABASE sample_db;
-- GRANT ALL PRIVILEGES ON DATABASE sample_db TO heyadmin;

CREATE TABLE user_details(
  id   BIGINT ,
  name VARCHAR(30),
  age INT
);
ALTER TABLE user_details
  ADD CONSTRAINT pk_user_details_id PRIMARY KEY (id);

CREATE TABLE customer
(
  id   BIGINT,
  first_name VARCHAR(30),
  last_name VARCHAR(30)
);
ALTER TABLE customer
  ADD CONSTRAINT pk_customer_id PRIMARY KEY (id);

INSERT INTO user_details VALUES(1, 'sakthi', 24);