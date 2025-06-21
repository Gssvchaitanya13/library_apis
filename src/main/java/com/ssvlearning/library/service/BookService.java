package com.ssvlearning.library.service;

import com.ssvlearning.library.model.Book;

import java.util.List;

public interface BookService {

    public List<Book> getBooks();

    Book updateBook(Book book);

    Book addBook(Book book);

    public  void deleteBook(int bookId);
}
