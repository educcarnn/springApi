INSERT INTO "users" ("name", "cpf", "email", "password", "type")
VALUES
    ('eduardo', '12345678910', 'eduardo@mail.com', '1234', 'COMMON'),
    ('Carneiro', '10987654321', 'Carneiro@mail.com', '4321', 'SELLER');

INSERT INTO "transactions" ("payer_id", "payee_id", "value")
VALUES
    ('1', '2', 10.5);