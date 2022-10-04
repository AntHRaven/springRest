package com.example.springrest.service.impl;

import com.example.springrest.model.Author;
import com.example.springrest.repository.AuthorRepository;
import com.example.springrest.service.GenericService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements GenericService<Author> {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author getById(Long id) {
        return authorRepository.findById(id).orElseThrow();
    }

    @Override
    public Author create(Author object) {
        return authorRepository.save(object);
    }

    @Override
    public void delete(Author object) {
        authorRepository.delete(object);
    }

    @Override
    public Author update(Author object) {
        return authorRepository.save(object);
    }
}
