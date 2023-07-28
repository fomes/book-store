package com.fomes.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fomes.bookstore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
  
}
