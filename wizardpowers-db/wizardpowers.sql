DROP SCHEMA IF EXISTS wizardpowers;
CREATE SCHEMA wizardpowers;

DROP TABLE IF EXISTS wizardpowers.wizard;

CREATE TABLE wizardpowers.wizard (
    id SERIAL PRIMARY KEY,
    type VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    power_level INT
);

INSERT INTO wizardpowers.wizard (type, name, power_level)
VALUES
    ('apprentice', 'Harry Potter', 1),
    ('practicing wizard', 'Merlin', 100),
    ('master of all elements', 'BSD-user', 9000);