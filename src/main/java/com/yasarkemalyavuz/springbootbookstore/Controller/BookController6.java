package com.yasarkemalyavuz.springbootbookstore.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController6 {

    @GetMapping("/Example6")
    public ResponseEntity<String> example6() {
        ResponseEntity responseEntity = new ResponseEntity("Metota gelindi cevap başarılı", HttpStatus.BAD_REQUEST);
        return responseEntity;
    }
}
