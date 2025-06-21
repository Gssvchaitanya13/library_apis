package com.ssvlearning.library.books;


import org.springframework.web.bind.annotation.*;

@RestController
public class Library {

    @GetMapping("/books")
    public String getBooks(){
        return "Getting books";
    }

    @PostMapping("/books/add")
    public String updateBooks(){
        return "Books updated";
    }

    @PutMapping("/books/update")
    public String addBooks(){
        return "Books added";
    }

    @DeleteMapping("/books/delete")
    public  String deleteBooks(){
        return "Books deleted";
    }
}
