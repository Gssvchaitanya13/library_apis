package com.ssvlearning.library.repository;

import com.ssvlearning.library.model.Book;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class BookDefaultRepoImpl implements BookRepo {
    private final HashMap<Integer, Book> bookMap;

    int uniqueId;

    public BookDefaultRepoImpl() {
//        TODO: Remove default book objects
        bookMap = new HashMap<>();
        Book b1 = new Book(1, "Agile Web Development with Rails", "Sam Ruby, Dave Thomas, David Heinemeier Hansson", "Web development", LocalDate.now());
        Book b2 = new Book(2, " Web Development with C++", "George Thomas", "App", LocalDate.now());
        bookMap.put(b1.getId(), b1);
        bookMap.put(b2.getId(), b2);
        uniqueId = 3;
    }

    @Override
    public List<Book> getBooks() {
        Collection<Book> values = bookMap.values();
        List<Book> books = new ArrayList<>(values);
        return books;
    }

    @Override
    public Book addBook(Book book) {
        book.setId(uniqueId);
        bookMap.put(book.getId(), book);
        uniqueId++;
        return book;
    }

    @Override
    public Book updateBook(Book book) {
        int id = book.getId();
        bookMap.put(id, book);
        return book;
    }

    @Override
    public void deleteBook(int bookId) {
        bookMap.remove(bookId);
    }
}
