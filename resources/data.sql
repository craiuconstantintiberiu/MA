CREATE TABLE weapon (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL
);

INSERT INTO weapon (name, description) VALUES
  ('Plasma blaster', 'A fearsome blaster'),
  ('Lightsaber', 'A more civilized weapon, for a more civilized age')