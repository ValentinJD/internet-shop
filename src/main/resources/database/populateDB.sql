DELETE FROM "users" where 1 > 0;

ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (first_name, last_name, login, password, telephone, email)
VALUES ('Admin', 'Adminov', 'admin', 'password', '+71234567890', 'admin@gmail.com'),
       ('User', 'Userov', 'user', 'password', '+79999999999', 'user@gmail.com');

-- DELETE
-- FROM "tt";

-- INSERT INTO tt (name)
-- VALUES ('Fidel'),
--        ('Kolyan')
