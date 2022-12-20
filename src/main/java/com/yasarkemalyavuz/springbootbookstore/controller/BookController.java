package com.yasarkemalyavuz.springbootbookstore.controller;

import com.yasarkemalyavuz.springbootbookstore.entity.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class BookController {


    @GetMapping("/Example1/{isim}/{yazar}")
    public String example1(@PathVariable("isim") String isim, @PathVariable String yazar){

        Book book = new Book(1,isim,yazar, 228,2020);
        return "Book Name : "+ book.getBook_name() + "     " + "Book Author:" +book.getBook_author();
        //http://localhost:8080/Example1/Patasana/AUmit
        //Book Name : Patasana Book Author:AUmit
    }

    @GetMapping("/Example2")
    public String example2(@RequestParam(value = "isim", required = false, defaultValue = "isim girilmedi") String isim,
                           @RequestParam(value = "yazar", required = false, defaultValue = "yazar girilmedi") String yazar){

        Book book = new Book(2,isim,yazar, 228,2020);
        return "Book Name : "+ book.getBook_name() + "     " + "Book Author:" +book.getBook_author();
        //http://localhost:8080/Example2
        //Book Name : isim girilmedi Book Author:yazar girilmedi
    }

    @GetMapping("/Example3/{yazar}")
    public String example3(@RequestParam(value = "isim") String isim,  @PathVariable String yazar){

        Book book = new Book(3,isim,yazar, 228,2020);
        return "Book Name : "+ book.getBook_name() + "     " + "Book Author:" +book.getBook_author();
        //http://localhost:8080/Example3/aumit?isim=patasana
        //Book Name : patasana Book Author:aumit
    }
    @GetMapping("/Example4")
    public String example4(@RequestBody String isim) {

        return "Kullanıcı İsmi "+isim;
    }

    @GetMapping("/Example5")
    public Book example5(@RequestBody Book book) {
        return book;
    }

    @GetMapping("/Example6")
    public ResponseEntity<String> example6() {
        ResponseEntity responseEntity = new ResponseEntity("Metota gelindi cevap başarılı", HttpStatus.BAD_REQUEST);
        return responseEntity;
    }

    @GetMapping("/Example7")
    public ResponseEntity<String> example7(@RequestBody Book book) {
        if (book.getBook_name().equals("yasar")) {
            return new ResponseEntity<>("YASARLAR GİREMEZ", HttpStatus.INTERNAL_SERVER_ERROR);

        } else {
            return new ResponseEntity<>("Kullanıcı Kayıt Edilmiştir", HttpStatus.SERVICE_UNAVAILABLE);
        }

    }

    @GetMapping("/Example8")
    public ResponseEntity<Book> example8 (@RequestBody Book book){

        if (book.getBook_name().equals("Kemal")) {
            return new ResponseEntity<>(book, HttpStatus.BAD_REQUEST);

        } else {
            return new ResponseEntity<>(book, HttpStatus.CREATED);
        }
    }

}
