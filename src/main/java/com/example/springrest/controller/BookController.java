package com.example.springrest.controller;

import com.example.springrest.model.Book;
import com.example.springrest.model.Book;
import com.example.springrest.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping("{id}")
    public Book getById(@PathVariable Long id) {
        return bookService.getById(id);
    }

    @PostMapping()
    public Book create(@RequestBody Book Book) {
        return bookService.create(Book);
    }

    @PutMapping()
    public Book update(@RequestBody Book Book) {
        return bookService.update(Book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookService.delete(bookService.getById(id));
    }

}
