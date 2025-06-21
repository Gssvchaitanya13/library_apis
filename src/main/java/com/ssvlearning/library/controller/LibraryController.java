package com.ssvlearning.library.controller;


import com.ssvlearning.library.service.LibraryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LibraryController {

    @Autowired
    private LibraryServiceImpl libraryService;
    @GetMapping("/books")
    public String getBooks(){
        return libraryService.getBooks();
    }

    @PostMapping("/books/add")
    public String updateBooks(){
        return libraryService.updateBooks();
    }

    @PutMapping("/books/update")
    public String addBooks(){
        return libraryService.addBooks();
    }

    @DeleteMapping("/books/delete")
    public  String deleteBooks(){
        return libraryService.deleteBooks();
    }
}
