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
    public String updateBooks() {
        return libraryRepo.updateBooks();
    }

    @Override
    public String addBooks() {
        return libraryRepo.addBooks();
    }

    @Override
    public String deleteBooks() {
        return libraryRepo.deleteBooks();
    }
}
