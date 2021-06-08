CREATE TABLE if not exists "User"
(
    "Id"          serial NOT NULL,
    "email"       TEXT   NOT NULL UNIQUE

) ;