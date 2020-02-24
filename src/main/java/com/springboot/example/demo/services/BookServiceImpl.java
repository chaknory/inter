package com.springboot.example.demo.services;

import com.springboot.example.demo.entities.Book;
import com.springboot.example.demo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(final BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public Book getBookById(Integer bookId) {
        return this.bookRepository.getBookById(bookId);
    }

    @Override
    public void addBook(Book book) {
        this.bookRepository.addBook(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return this.bookRepository.getAllBooks();
    }
}
