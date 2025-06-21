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
    public String updateBook() {
        return "Books updated succesfully";
    }

    @Override
    public String addBook() {
        return "Books added succesfully";
    }

    @Override
    public String deleteBook() {
        return "Books deleted succesfully";
    }
}
