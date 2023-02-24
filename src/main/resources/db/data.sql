CREATE TABLE payments (
                          id SERIAL PRIMARY KEY,
                          sender_account VARCHAR(255) NOT NULL,
                          recipient_account VARCHAR(255) NOT NULL,
                          amount NUMERIC(10, 2) NOT NULL,
                          status VARCHAR(20) NOT NULL
);
