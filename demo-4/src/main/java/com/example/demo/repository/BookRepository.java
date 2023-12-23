package com.example.demo.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.persistence.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}