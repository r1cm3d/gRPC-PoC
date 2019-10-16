CREATE TABLE person
(
  id UUID PRIMARY KEY NOT NULL,
  first_name TEXT NOT NULL,
  last_name TEXT NOT NULL,
  date_of_birth DATE NOT NULL
);

CREATE UNIQUE INDEX person_id_idx
  ON person
  USING btree
  (id);
