package com.fomes.bookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fomes.bookstore.entity.Book;

@Repository
public interface MyBookRepository extends JpaRepository<Book, Integer> {
  List<Book> findAllByFavoriteTrue();
}
