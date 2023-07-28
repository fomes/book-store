package com.fomes.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fomes.bookstore.entity.Book;
import com.fomes.bookstore.repository.BookRepository;

@Service
public class BookService {
  @Autowired
  private BookRepository bookRepository;

  public void saveBook(Book book) {
    bookRepository.save(book);
  }

  public List<Book> getallBooks() {
    return bookRepository.findAll();
  }
}
