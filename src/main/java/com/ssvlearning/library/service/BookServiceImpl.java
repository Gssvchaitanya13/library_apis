package com.ssvlearning.library.service;

import com.ssvlearning.library.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService
{
    @Autowired
    private BookRepo libraryRepo;




    @Override
    public String getBooks(){
        return libraryRepo.getBooks();
    }

    @Override
    public String updateBook() {
        return libraryRepo.updateBook();
    }

    @Override
    public String addBook() {
        return libraryRepo.addBook();
    }

    @Override
    public String deleteBook() {
        return libraryRepo.deleteBook();
    }
}
