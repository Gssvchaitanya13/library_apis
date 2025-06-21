package com.ssvlearning.library.repository;

import com.ssvlearning.library.service.LibraryService;
import org.springframework.stereotype.Service;

@Service
public class LibraryDefaultRepoImpl implements LibraryRepo
{
    @Override
    public String getBooks(){
        return "Getting books";
    }

    @Override
    public String updateBooks() {
        return "Books updated succesfully";
    }

    @Override
    public String addBooks() {
        return "Books added succesfully";
    }

    @Override
    public String deleteBooks() {
        return "Books deleted succesfully";
    }
}
