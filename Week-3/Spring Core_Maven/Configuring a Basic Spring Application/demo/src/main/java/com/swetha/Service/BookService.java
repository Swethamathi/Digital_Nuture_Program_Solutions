package com.swetha.Service;

import com.swetha.Repository.*;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void listBooks() {
        System.out.println("SERVICE: LISTING THE BOOKS");
        bookRepository.fetchBooks();
    }
}
