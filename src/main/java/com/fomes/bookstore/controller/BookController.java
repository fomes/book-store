package com.fomes.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
  public ModelAndView getAllBooks() {
    List<Book> list = bookService.getallBooks();
    ModelAndView model = new ModelAndView();
    model.setViewName("bookList");
    model.addObject("book", list);
    return new ModelAndView("bookList", "book", list);
  }

  @PostMapping("/save")
  public String addBook(@ModelAttribute Book book) {
    bookService.saveBook(book);
    return "redirect:/avaliable_books";
  }

}
