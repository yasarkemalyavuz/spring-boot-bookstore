package com.yasarkemalyavuz.springbootbookstore.Controller;

import com.yasarkemalyavuz.springbootbookstore.Entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {

    //http://localhost:8080/Example1/Patasana/AUmit
    @GetMapping("/Example1/{isim}/{yazar}")
    public String example1(@PathVariable("isim") String isim, @PathVariable String yazar){

        Book book = new Book(1,isim,yazar, 228,2020);
        return "Book Name : "+ book.getBook_name() + "     " + "Book Author:" +book.getBook_author();
    }
    //Book Name : Patasana Book Author:AUmit
}
