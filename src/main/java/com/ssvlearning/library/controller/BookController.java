package com.ssvlearning.library.controller;


import com.ssvlearning.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    @GetMapping("/books")
    public String getBooks(){
        return bookService.getBooks();
    }

    @PostMapping("/books/add")
    public String updateBooks(){
        return bookService.updateBook();
    }

    @PutMapping("/books/update")
    public String addBooks(){
        return bookService.addBook();
    }

    @DeleteMapping("/books/delete")
    public  String deleteBooks(){
        return bookService.deleteBook();
    }
}
