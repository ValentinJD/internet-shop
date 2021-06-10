DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE if not exists global_seq START WITH 100000;

CREATE TABLE if not exists "users"
(
    "id"        INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    "first_name" TEXT NOT NULL,
    "last_name"  TEXT NOT NULL,
    "login"     TEXT NOT NULL UNIQUE,
    "password"  TEXT NOT NULL,
    "telephone" TEXT NOT NULL UNIQUE,
    "email"     TEXT NOT NULL UNIQUE,
    "amount"    numeric             default 0,
    "discount"  float               default 0
);

--
-- CREATE UNIQUE INDEX users_unique_email_idx ON users (email);

-- DROP SEQUENCE IF EXISTS tt_seq;

-- DROP TABLE IF EXISTS "tt";

-- CREATE TABLE if not exists "tt"
-- (
--     "id" INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
--     "name" text not null
-- )
