DROP TABLE IF EXISTS picture CASCADE;
DROP SEQUENCE IF EXISTS global_seq;
CREATE SEQUENCE global_seq START WITH 1;

CREATE TABLE picture
(
	id INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
	name VARCHAR NOT NULL ,
	author VARCHAR NOT NULL,
	year INTEGER NOT NULL


);

