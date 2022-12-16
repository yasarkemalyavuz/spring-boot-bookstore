package com.yasarkemalyavuz.springbootbookstore.Controller;


import com.yasarkemalyavuz.springbootbookstore.Entity.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController8 {

    @GetMapping("/Example8")
    public ResponseEntity<Book> example8 (@RequestBody Book book){

        if (book.getBook_name().equals("Kemal")) {
            return new ResponseEntity<>(book, HttpStatus.BAD_REQUEST);

        } else {
            return new ResponseEntity<>(book, HttpStatus.CREATED);
        }
    }
}
