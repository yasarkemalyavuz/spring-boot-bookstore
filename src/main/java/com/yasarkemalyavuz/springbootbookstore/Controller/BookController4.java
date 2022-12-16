package com.yasarkemalyavuz.springbootbookstore.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController4 {

    @GetMapping("/Example4")
    public String example4(@RequestBody String isim) {

        return "Kullanıcı İsmi "+isim;
    }

}
