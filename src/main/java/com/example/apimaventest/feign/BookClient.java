package com.example.apimaventest.feign;

import com.example.apimaventest.domain.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "book-api", url = "https://books-example-testing.s3.amazonaws.com")
public interface BookClient {
    @GetMapping("/books-list-example.json")
    List<Book> getBooks();


}
