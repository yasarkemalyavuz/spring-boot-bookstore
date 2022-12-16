package com.yasarkemalyavuz.springbootbookstore.Controller;

import com.yasarkemalyavuz.springbootbookstore.Entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController5 {

    @GetMapping("/Example5")
    public Book example5(@RequestBody Book book) {
        return book;
    }
}
