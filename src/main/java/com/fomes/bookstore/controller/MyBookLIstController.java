package com.fomes.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fomes.bookstore.service.MyBookListService;

@Controller
public class MyBookLIstController {

  @Autowired
  private MyBookListService myBookListService;

  @RequestMapping("/delete/{id}")
  public String deleteFromMyList(@PathVariable("id") int id) {
    myBookListService.deleteById(id);
    return "redirect:/my_books";
  }
}
