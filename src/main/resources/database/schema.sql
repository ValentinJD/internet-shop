ALTER TABLE "User"
    DROP CONSTRAINT IF EXISTS "User_fk0";

ALTER TABLE "User"
    DROP CONSTRAINT IF EXISTS "User_fk1";

ALTER TABLE "User"
    DROP CONSTRAINT IF EXISTS "User_fk2";

ALTER TABLE "product"
    DROP CONSTRAINT IF EXISTS "product_fk0";

ALTER TABLE "product"
    DROP CONSTRAINT IF EXISTS "product_fk1";

ALTER TABLE "product"
    DROP CONSTRAINT IF EXISTS "product_fk2";

ALTER TABLE "product"
    DROP CONSTRAINT IF EXISTS "product_fk3";

ALTER TABLE "product"
    DROP CONSTRAINT IF EXISTS "product_fk4";

ALTER TABLE "Basket"
    DROP CONSTRAINT IF EXISTS "Basket_fk0";

ALTER TABLE "Basket"
    DROP CONSTRAINT IF EXISTS "Basket_fk1";

ALTER TABLE "Order"
    DROP CONSTRAINT IF EXISTS "Order_fk0";

ALTER TABLE "Order"
    DROP CONSTRAINT IF EXISTS "Order_fk1";

ALTER TABLE "Order"
    DROP CONSTRAINT IF EXISTS "Order_fk2";

ALTER TABLE "Order"
    DROP CONSTRAINT IF EXISTS "Order_fk3";

ALTER TABLE "product_group"
    DROP CONSTRAINT IF EXISTS "product_group_fk0";

ALTER TABLE "Manufacturer"
    DROP CONSTRAINT IF EXISTS "Manufacturer_fk0";

ALTER TABLE "product_options"
    DROP CONSTRAINT IF EXISTS "product_options_fk0";

ALTER TABLE "product_options"
    DROP CONSTRAINT IF EXISTS "product_options_fk1";

ALTER TABLE "images"
    DROP CONSTRAINT IF EXISTS "images_fk0";

DROP TABLE IF EXISTS "User";

DROP TABLE IF EXISTS "product";

DROP TABLE IF EXISTS "Basket";

DROP TABLE IF EXISTS "Order";

DROP TABLE IF EXISTS "product_group";

DROP TABLE IF EXISTS "Storage";

DROP TABLE IF EXISTS "Manufacturer";

DROP TABLE IF EXISTS "image";

DROP TABLE IF EXISTS "option";

DROP TABLE IF EXISTS "product_options";

DROP TABLE IF EXISTS "language";

DROP TABLE IF EXISTS "images";

DROP TABLE IF EXISTS "delivery_company";

DROP TABLE IF EXISTS "system_payment";

CREATE TABLE "users"
(
    "Id"          serial NOT NULL,
    "Id_busket"   int    NOT NULL,
    "Id_order"    bigint NOT NULL,
    "Name"        char   NOT NULL,
    "login"       TEXT   NOT NULL UNIQUE,
    "password"    TEXT   NOT NULL,
    "group"       TEXT   NOT NULL,
    "telephone"   TEXT   NOT NULL UNIQUE,
    "email"       TEXT   NOT NULL UNIQUE,
    "status"      TEXT   NOT NULL,
    "discount"    int    NOT NULL,
    "id_language" int    NOT NULL,
    CONSTRAINT "User_pk" PRIMARY KEY ("Id", "telephone")
) WITH (
      OIDS= FALSE
    );



CREATE TABLE "product"
(
    "Id"              serial  NOT NULL,
    "Id_manufacturer" bigint  NOT NULL,
    "Id_group"        bigint  NOT NULL,
    "name"            TEXT    NOT NULL UNIQUE,
    "description"     TEXT    NOT NULL UNIQUE,
    "id_image"        TEXT    NOT NULL UNIQUE,
    "price"           float4  NOT NULL UNIQUE,
    "available"       BOOLEAN NOT NULL UNIQUE,
    "count"           int     NOT NULL,
    "id_item_options" int     NOT NULL,
    "seo_description" TEXT    NOT NULL,
    "seo_keywords"    TEXT    NOT NULL,
    "Id_language"     bigint  NOT NULL,
    CONSTRAINT "product_pk" PRIMARY KEY ("Id")
) WITH (
      OIDS= FALSE
    );



CREATE TABLE "Basket"
(
    "Id"      serial NOT NULL,
    "Id_user" bigint NOT NULL,
    "Id_item" bigint NOT NULL,
    CONSTRAINT "Basket_pk" PRIMARY KEY ("Id")
) WITH (
      OIDS= FALSE
    );



CREATE TABLE "Order"
(
    "Id"                  bigint NOT NULL,
    "Id_product"          bigint NOT NULL,
    "Id_user"             bigint NOT NULL,
    "count"               bigint NOT NULL,
    "product_price"       float4 NOT NULL,
    "order_price"         float4 NOT NULL,
    "id_delivery_company" bigint NOT NULL,
    "payment method"      TEXT   NOT NULL,
    "status"              TEXT   NOT NULL,
    "comment"             TEXT   NOT NULL,
    CONSTRAINT "Order_pk" PRIMARY KEY ("Id")
) WITH (
      OIDS= FALSE
    );



CREATE TABLE "product_group"
(
    "Id"              serial NOT NULL,
    "name"            TEXT   NOT NULL UNIQUE,
    "description"     TEXT   NOT NULL UNIQUE,
    "id_image"        bigint NOT NULL UNIQUE,
    "count"           bigint NOT NULL,
    "seo_keywords"    TEXT   NOT NULL,
    "seo_description" TEXT   NOT NULL,
    "Id_language"     int    NOT NULL,
    CONSTRAINT "product_group_pk" PRIMARY KEY ("Id")
) WITH (
      OIDS= FALSE
    );



CREATE TABLE "Storage"
(
    "Id" serial NOT NULL,
    CONSTRAINT "Storage_pk" PRIMARY KEY ("Id")
) WITH (
      OIDS= FALSE
    );



CREATE TABLE "Manufacturer"
(
    "Id"          serial NOT NULL,
    "Id_storage"  bigint NOT NULL,
    "name"        TEXT   NOT NULL UNIQUE,
    "description" TEXT   NOT NULL,
    "logo"        TEXT   NOT NULL UNIQUE,
    "count"       int    NOT NULL UNIQUE,
    CONSTRAINT "Manufacturer_pk" PRIMARY KEY ("Id")
) WITH (
      OIDS= FALSE
    );



CREATE TABLE "image"
(
    "Id" serial NOT NULL,
    CONSTRAINT "image_pk" PRIMARY KEY ("Id")
) WITH (
      OIDS= FALSE
    );



CREATE TABLE "option"
(
    "Id" serial NOT NULL,
    CONSTRAINT "option_pk" PRIMARY KEY ("Id")
) WITH (
      OIDS= FALSE
    );



CREATE TABLE "product_options"
(
    "Id"        serial NOT NULL,
    "Id_option" serial NOT NULL,
    "Id_item"   serial NOT NULL,
    CONSTRAINT "product_options_pk" PRIMARY KEY ("Id")
) WITH (
      OIDS= FALSE
    );



CREATE TABLE "language"
(
    "Id"   serial NOT NULL,
    "name" TEXT   NOT NULL,
    CONSTRAINT "language_pk" PRIMARY KEY ("Id")
) WITH (
      OIDS= FALSE
    );



CREATE TABLE "images"
(
    "Id"       serial NOT NULL,
    "Id_image" serial NOT NULL,
    CONSTRAINT "images_pk" PRIMARY KEY ("Id")
) WITH (
      OIDS= FALSE
    );



CREATE TABLE "delivery_company"
(
    "Id" serial NOT NULL,
    CONSTRAINT "delivery_company_pk" PRIMARY KEY ("Id")
) WITH (
      OIDS= FALSE
    );



CREATE TABLE "system_payment"
(
    "name" TEXT NOT NULL UNIQUE,
    CONSTRAINT "system_payment_pk" PRIMARY KEY ("name")
) WITH (
      OIDS= FALSE
    );



ALTER TABLE "User"
    ADD CONSTRAINT "User_fk0" FOREIGN KEY ("Id_busket") REFERENCES "Basket" ("Id_user");
ALTER TABLE "User"
    ADD CONSTRAINT "User_fk1" FOREIGN KEY ("Id_order") REFERENCES "Order" ("Id");
ALTER TABLE "User"
    ADD CONSTRAINT "User_fk2" FOREIGN KEY ("id_language") REFERENCES "language" ("Id");

ALTER TABLE "product"
    ADD CONSTRAINT "product_fk0" FOREIGN KEY ("Id_manufacturer") REFERENCES "Manufacturer" ("Id");
ALTER TABLE "product"
    ADD CONSTRAINT "product_fk1" FOREIGN KEY ("Id_group") REFERENCES "product_group" ("Id");
ALTER TABLE "product"
    ADD CONSTRAINT "product_fk2" FOREIGN KEY ("id_image") REFERENCES "images" ("Id");
ALTER TABLE "product"
    ADD CONSTRAINT "product_fk3" FOREIGN KEY ("id_item_options") REFERENCES "product_options" ("Id");
ALTER TABLE "product"
    ADD CONSTRAINT "product_fk4" FOREIGN KEY ("Id_language") REFERENCES "language" ("Id");

ALTER TABLE "Basket"
    ADD CONSTRAINT "Basket_fk0" FOREIGN KEY ("Id_user") REFERENCES "User" ("Id");
ALTER TABLE "Basket"
    ADD CONSTRAINT "Basket_fk1" FOREIGN KEY ("Id_item") REFERENCES "product" ("Id");

ALTER TABLE "Order"
    ADD CONSTRAINT "Order_fk0" FOREIGN KEY ("Id_product") REFERENCES "product" ("Id");
ALTER TABLE "Order"
    ADD CONSTRAINT "Order_fk1" FOREIGN KEY ("Id_user") REFERENCES "User" ("Id");
ALTER TABLE "Order"
    ADD CONSTRAINT "Order_fk2" FOREIGN KEY ("id_delivery_company") REFERENCES "delivery_company" ("Id");
ALTER TABLE "Order"
    ADD CONSTRAINT "Order_fk3" FOREIGN KEY ("payment method") REFERENCES "system_payment" ("name");

ALTER TABLE "product_group"
    ADD CONSTRAINT "product_group_fk0" FOREIGN KEY ("id_image") REFERENCES "image" ("Id");


ALTER TABLE "Manufacturer"
    ADD CONSTRAINT "Manufacturer_fk0" FOREIGN KEY ("Id_storage") REFERENCES "Storage" ("Id");



ALTER TABLE "product_options"
    ADD CONSTRAINT "product_options_fk0" FOREIGN KEY ("Id_option") REFERENCES "option" ("Id");
ALTER TABLE "product_options"
    ADD CONSTRAINT "product_options_fk1" FOREIGN KEY ("Id_item") REFERENCES "product" ("Id");


ALTER TABLE "images"
    ADD CONSTRAINT "images_fk0" FOREIGN KEY ("Id_image") REFERENCES "image" ("Id");


