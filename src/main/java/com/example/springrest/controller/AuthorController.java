package com.example.springrest.controller;

import com.example.springrest.model.Author;
import com.example.springrest.service.GenericService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    private final GenericService<Author> authorService;

    public AuthorController(GenericService<Author> authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/list")
    public List<Author> getAll() {
        return authorService.getAll();
    }

    @GetMapping("/{id}")
    public Author getById(@PathVariable Long id) {
        return authorService.getById(id);
    }

    @PostMapping()
    public Author create(@RequestBody Author author) {
        return authorService.create(author);
    }

    @PutMapping()
    public Author update(@RequestBody Author author) {
        return authorService.update(author);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        authorService.delete(authorService.getById(id));
    }
}
