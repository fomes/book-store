package com.fomes.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.fomes.bookstore.entity.Book;
import com.fomes.bookstore.service.BookService;

@Controller
public class BookController {

  @Autowired
  private BookService bookService;

  @GetMapping("/")
  public String home() {
    return "home";
  }

  @GetMapping("/book_register")
  public String bookRegister() {
    return "bookRegister";
  }

  @GetMapping("/avaliable_books")
  public String getAllBooks() {
    return "bookList";
  }

  @PostMapping("/save")
  public String addBook(@ModelAttribute Book book) {
    bookService.saveBook(book);
    return "redirect:/avaliable_books";
  }

}
