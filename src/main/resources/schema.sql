CREATE TABLE  IF NOT EXISTS customers (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    surname VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    phone_number VARCHAR(15) NOT NULL
);

CREATE TABLE IF NOT EXISTS orders (
    id SERIAL PRIMARY KEY,
    date TIMESTAMP NOT NULL,
    customer_id INT not null,
    product_name VARCHAR(100) NOT NULL,
    amount INT NOT NULL
);