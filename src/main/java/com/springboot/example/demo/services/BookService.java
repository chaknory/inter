package com.springboot.example.demo.services;

import com.springboot.example.demo.entities.Book;
import java.util.List;

public interface BookService {
    Book getBookById(Integer bookId);
    void addBook(Book book);
    List<Book> getAllBooks();
}