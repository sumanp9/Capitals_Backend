
CREATE TABLE tbl_country(
    id INTEGER NOT NULL AUTO_iNCREMENT,
    name VARCHAR(255) NOT NULL,
    population INTEGER ,
    capital VARCHAR(255) NOT NULL ,
    region VARCHAR(255) NOT NULL ,
    continent VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);