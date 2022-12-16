package com.yasarkemalyavuz.springbootbookstore.Controller;

import com.yasarkemalyavuz.springbootbookstore.Entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController2 {

    //http://localhost:8080/Example2
    @GetMapping("/Example2")
    public String example2(@RequestParam(value = "isim", required = false, defaultValue = "isim girilmedi") String isim,
                           @RequestParam(value = "yazar", required = false, defaultValue = "yazar girilmedi") String yazar){

        Book book = new Book(2,isim,yazar, 228,2020);
        return "Book Name : "+ book.getBook_name() + "     " + "Book Author:" +book.getBook_author();
    }
    //Book Name : isim girilmedi Book Author:yazar girilmedi
}
