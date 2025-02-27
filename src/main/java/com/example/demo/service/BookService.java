package com.example.demo.service;

import com.example.demo.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getBooks();

    Book addBooks(Book book);

    Book updateBook(Book book);

    void deleteBook(Long id);


}
