package com.fomes.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fomes.bookstore.entity.MyBookList;
import com.fomes.bookstore.repository.MyBookRepository;

@Service
public class MyBookListService {

  @Autowired
  private MyBookRepository myBookRepository;

  public void saveMybook(MyBookList book) {
    myBookRepository.save(book);
  }

  public List<MyBookList> getAllMyBooks() {
    return myBookRepository.findAll();
  }
}
