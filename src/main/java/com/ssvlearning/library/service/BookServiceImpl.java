package com.ssvlearning.library.service;

import com.ssvlearning.library.model.Book;
import com.ssvlearning.library.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService
{
    @Autowired
    private BookRepo libraryRepo;




    @Override
    public List<Book> getBooks(){
        return libraryRepo.getBooks();
    }

    @Override
    public Book updateBook(Book book) {
        return libraryRepo.updateBook(book);
    }

    @Override
    public Book addBook(Book book) {
        return libraryRepo.addBook(book);
    }

    @Override
    public void deleteBook(int bookId) {
         libraryRepo.deleteBook(bookId);
    }
}
