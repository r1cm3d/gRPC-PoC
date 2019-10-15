CREATE TABLE user
(
  id: UUID PRIMARY KEY NOT NULL,
  first_name: TEXT NOT NULL,
  last_name: TEXT NOT NULL,
  date_of_birth: DATE NOT NULL
);

CREATE UNIQUE INDEX user_id_idx
  ON user
  USING btree
  (id);
