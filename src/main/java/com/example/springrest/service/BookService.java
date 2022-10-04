package com.example.springrest.service;

import com.example.springrest.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getAll();

    Book getById(Long id);

    Book create(Book book);

    void delete(Book book);

    Book update(Book book);
}
