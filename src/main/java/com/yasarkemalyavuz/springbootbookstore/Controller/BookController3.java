package com.yasarkemalyavuz.springbootbookstore.Controller;


import com.yasarkemalyavuz.springbootbookstore.Entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController3 {

    //http://localhost:8080/Example3/aumit?isim=patasana
    @GetMapping("/Example3/{yazar}")
    public String example3(@RequestParam(value = "isim") String isim,  @PathVariable String yazar){

        Book book = new Book(3,isim,yazar, 228,2020);
        return "Book Name : "+ book.getBook_name() + "     " + "Book Author:" +book.getBook_author();
    }
    //Book Name : patasana Book Author:aumit
}
