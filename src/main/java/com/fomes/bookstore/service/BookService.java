package com.fomes.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fomes.bookstore.entity.Book;
import com.fomes.bookstore.repository.BookRepository;
import com.fomes.bookstore.repository.MyBookRepository;

@Service
public class BookService {
  @Autowired
  private BookRepository bookRepository;

  @Autowired
  private MyBookRepository myBookRepository;

  public void saveBook(Book book) {
    bookRepository.save(book);
  }

  public void editFavorite(Book book) {
    bookRepository.save(book);
  }

  public List<Book> getallBooks() {
    return bookRepository.findAll();
  }

  public List<Book> getMyBooks() {
    return myBookRepository.findAllByFavoriteTrue();
  }

  public Book getBookById(int id) {
    return bookRepository.findById(id).get();
  }

  public void deleteById(int id) {
    bookRepository.deleteById(id);
  }
}
