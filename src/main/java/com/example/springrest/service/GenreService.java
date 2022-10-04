package com.example.springrest.service;

import com.example.springrest.model.Genre;

import java.util.List;

public interface GenreService {

    List<Genre> getAll();

    Genre getById(Long id);

    Genre create(Genre genre);

    void delete(Genre genre);

    Genre update(Genre genre);
}
