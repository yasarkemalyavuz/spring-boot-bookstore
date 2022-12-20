package com.yasarkemalyavuz.springbootbookstore.controller;

import com.yasarkemalyavuz.springbootbookstore.entity.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/crud")
public class CrudListController {

    private static List<Book> books = new ArrayList<>();

    @GetMapping("")
    public List<Book> getBooks() {return books;}

    @PostMapping("/save")
    public List<Book> addBoook(@RequestBody Book book){
        books.add(book);
        return books;
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateBook(@RequestBody Book book){

        for(int i=0; i<books.size(); i++){

            if (books.get(i).getBook_id() == book.getBook_id()){

                if(books.get(i).getBook_name() != book.getBook_name()){
                    books.get(i).setBook_name(book.getBook_name());
                }
                if (books.get(i).getBook_author() != book.getBook_author()){
                    books.get(i).setBook_author(book.getBook_author());
                }

            }
        }

        return new ResponseEntity<>("UPDATES OK!!!", HttpStatus.ACCEPTED);

        /*
        [
    {
        "book_id": 1,
        "book_name": "Savaş ve Barış",
        "book_author": "Tolstoy",
        "total_page": 653,
        "publish_year": 2015
    },
    {
        "book_id": 2,
        "book_name": "Sefiller",
        "book_author": "Victor Hugo",
        "total_page": 553,
        "publish_year": 2019
    },
    {
        "book_id": 3,
        "book_name": "Suç ve Ceza",
        "book_author": "Dostoyevski",
        "total_page": 459,
        "publish_year": 2017
    },
    {
        "book_id": 4,
        "book_name": "İnce Memed",
        "book_author": "Yaşar Kemal",
        "total_page": 470,
        "publish_year": 2011
    },
    {
        "book_id": 5,
        "book_name": "Kürk Mantolu Madonna",
        "book_author": "Sabahattin Ali",
        "total_page": 230,
        "publish_year": 2014
    }
]
         */
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteBook(@RequestBody Book book){
        for(int i=0; i<books.size(); i++){

            if (books.get(i).getBook_id() == book.getBook_id()){

                if(books.get(i).getBook_name() != book.getBook_name()){
                    books.get(i).setBook_name(book.getBook_name());
                }
                if (books.get(i).getBook_author() != book.getBook_author()){
                    books.get(i).setBook_author(book.getBook_author());
                }

            }
        }

        return new ResponseEntity<>("DELETEDDD!!", HttpStatus.CREATED);
        /*
        {
                "book_id": 3

            }*/

        //DELETEDDD!!
        //201 Created



    }






}
