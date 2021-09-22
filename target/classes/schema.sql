DROP TABLE IF EXISTS movie;

CREATE TABLE movie (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  pays VARCHAR(250) NOT NULL,
  category VARCHAR(250) DEFAULT NULL,
  description VARCHAR(3000) DEFAULT NULL,
  release_date DATE DEFAULT NULL,
  up_vote int default null,
  down_vote int default null
);