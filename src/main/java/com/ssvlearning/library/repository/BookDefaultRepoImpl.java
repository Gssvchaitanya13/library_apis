package com.ssvlearning.library.repository;

import org.springframework.stereotype.Service;

@Service
public class BookDefaultRepoImpl implements BookRepo
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
