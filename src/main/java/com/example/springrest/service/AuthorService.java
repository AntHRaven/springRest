package com.example.springrest.service;

import com.example.springrest.model.Author;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AuthorService {

    List<Author> getAll();

    Author getById(Long id);

    Author create(Author author);

    void delete(Author author);

    Author update(Author author);
}
