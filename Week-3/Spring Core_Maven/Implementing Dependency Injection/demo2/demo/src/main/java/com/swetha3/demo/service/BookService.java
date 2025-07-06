package com.swetha3.demo.service;

import com.swetha3.demo.repository.BookRepository;

public class BookService {
    private com.swetha3.demo.repository.BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookTitle) {
        if (bookRepository != null) {
            bookRepository.save(bookTitle);
            System.out.println("Book '" + bookTitle + "' added successfully.");
        } else {
            System.out.println("BookRepository is not initialized.");
        }
    }
}