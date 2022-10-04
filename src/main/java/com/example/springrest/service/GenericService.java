package com.example.springrest.service;

import org.springframework.stereotype.Service;

import java.util.List;

public interface GenericService<T> {

    List<T> getAll();

    T getById(Long id);

    T create(T object);

    void delete(T object);

    T update(T object);
}
