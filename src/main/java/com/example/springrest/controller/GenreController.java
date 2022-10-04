package com.example.springrest.controller;

import com.example.springrest.model.Genre;
import com.example.springrest.service.GenreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genre")
public class GenreController {
    
    private final GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping
    public List<Genre> getAll() {
        return genreService.getAll();
    }

    @GetMapping("{id}")
    public Genre getById(@PathVariable Long id) {
        return genreService.getById(id);
    }

    @PostMapping()
    public Genre create(@RequestBody Genre Genre) {
        return genreService.create(Genre);
    }

    @PutMapping()
    public Genre update(@RequestBody Genre Genre) {
        return genreService.update(Genre);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        genreService.delete(genreService.getById(id));
    }

}
