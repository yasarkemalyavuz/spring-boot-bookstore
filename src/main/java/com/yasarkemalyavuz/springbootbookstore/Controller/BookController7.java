package com.yasarkemalyavuz.springbootbookstore.Controller;

import com.yasarkemalyavuz.springbootbookstore.Entity.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController7 {

    @GetMapping("/Example7")
    public ResponseEntity<String> example7(@RequestBody Book book) {
        if (book.getBook_name().equals("yasar")) {
            return new ResponseEntity<>("YASARLAR GİREMEZ", HttpStatus.INTERNAL_SERVER_ERROR);

        } else {
            return new ResponseEntity<>("Kullanıcı Kayıt Edilmiştir", HttpStatus.SERVICE_UNAVAILABLE);
        }

    }
}
