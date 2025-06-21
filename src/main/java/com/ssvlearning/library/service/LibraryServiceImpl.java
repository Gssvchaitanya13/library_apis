package com.ssvlearning.library.service;

import com.ssvlearning.library.repository.LibraryDefaultRepoImpl;
import com.ssvlearning.library.repository.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryServiceImpl implements LibraryService
{
    @Autowired
    private LibraryRepo libraryRepo;

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
