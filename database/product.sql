CREATE TABLE product
(
  id UUID PRIMARY KEY NOT NULL,
  price_in_cents INTEGER NOT NULL,
  title TEXT NOT NULL,
  description TEXT NOT NULL
);

CREATE UNIQUE INDEX product_id_idx
  ON product
  USING btree
  (id);
