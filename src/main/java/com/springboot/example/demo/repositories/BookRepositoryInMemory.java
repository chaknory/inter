package com.springboot.example.demo.repositories;

import com.springboot.example.demo.entities.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryInMemory implements BookRepository {
    private ArrayList<Book> books;

    public BookRepositoryInMemory() {
        this.books = new ArrayList<>();
    }

    public Book getBookById(Integer bookId) {
        for(Book b : this.books){
            if(b.getId() == bookId) return b;
        }

        return null;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public List<Book> getAllBooks() {
        return this.books;
    }
}
