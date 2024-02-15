package com.example.apimaventest.services;

import com.example.apimaventest.domain.Book;
import com.example.apimaventest.feign.BookClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookClient bookClient;

    public BookService(BookClient client) {
        this.bookClient = client;
    }

    public List<Book> getBooksFromLibrary() {
        return this.bookClient.getBooks();
    }
}
