package com.fomes.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fomes.bookstore.entity.MyBookList;

@Repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer> {

}
