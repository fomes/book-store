CREATE TABLE tb_books (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
  	author VARCHAR(50),
    price NUMERIC(10, 2),
    favorite boolean NOT NULL
);
