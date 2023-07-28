CREATE TABLE tb_books (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
  	author VARCHAR(50),
    price NUMERIC(10, 2)
);

CREATE TABLE tb_my_book_list (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
  	author VARCHAR(50),
    price NUMERIC(10, 2)
);
