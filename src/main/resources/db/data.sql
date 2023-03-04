CREATE TABLE payments (
                          id SERIAL PRIMARY KEY,
                          sender_account VARCHAR(255) NOT NULL,
                          amount NUMERIC(10, 2) NOT NULL,
                          status VARCHAR(20) NOT NULL,
                          usluga_id BIGINT REFERENCES uslugi(id) ON DELETE SET NULL
);

CREATE TABLE uslugi (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(255) NOT NULL,
                        description TEXT,
                        min_amount NUMERIC(10, 2),
                        requisite_mask VARCHAR(255),
                        category_id BIGINT REFERENCES usluga_categories(id)
);

CREATE TABLE usluga_categories (
                                   id SERIAL PRIMARY KEY,
                                   name VARCHAR(255) NOT NULL,
                                   parent_id BIGINT REFERENCES usluga_categories(id)
);
