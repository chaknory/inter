package com.springboot.example.demo.repositories;

import com.springboot.example.demo.entities.Book;
import java.util.List;

public interface BookRepository {
    Book getBookById(Integer bookId);
    void addBook(Book book);
    List<Book> getAllBooks();
}
