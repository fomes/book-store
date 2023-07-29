package com.fomes.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

  @GetMapping("/my_books")
  public ModelAndView getMyBooks() {
    List<Book> list = bookService.getMyBooks();
    ModelAndView model = new ModelAndView();
    model.setViewName("bookList");
    model.addObject("book", list);
    return model;
  }

  @RequestMapping("/save_favorite/{id}")
  public String addFavorite(@PathVariable("id") int id) {
    Book book = bookService.getBookById(id);
    book.setFavorite(true);
    bookService.saveFavorite(book);
    return "redirect:/my_books";
  }

  @RequestMapping("/edit_book/{id}")
  public String editBook(@PathVariable("id") int id, Model model) {
    Book book = bookService.getBookById(id);
    model.addAttribute("book", book);
    return "bookEdit";
  }

  @RequestMapping("/delete_book/{id}")
  public String deleteFromMyList(@PathVariable("id") int id) {
    bookService.deleteById(id);
    return "redirect:/avaliable_books";
  }
}
