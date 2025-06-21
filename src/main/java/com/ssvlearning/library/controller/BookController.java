package com.ssvlearning.library.controller;


import com.ssvlearning.library.model.Book;
import com.ssvlearning.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping("/books/add")
    public Book addBooks(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @PutMapping("/books/update")
    public Book updateBooks(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping("/books/delete/{bookId}")
    public void deleteBooks(@PathVariable int bookId) {
        bookService.deleteBook(bookId);
    }
}
