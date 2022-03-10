package com.example.JUnitTesting.Controller;

import com.example.JUnitTesting.Model.Junitmodel;
import com.example.JUnitTesting.Service.Junitservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Junitcontroller {

    @Autowired
    Junitservice jservice;

    @GetMapping("/getbooks")
    public List<Junitmodel> getAllBooks() {

        return jservice.getbook();
    }

    @GetMapping("/getBookByAuthor/{authorname}")
    public List<Junitmodel> getByAuthor(@PathVariable String authorname) {
        return jservice.getBookByauthor(authorname);
    }

    @PostMapping("/savebook")
    public String savebook(@RequestBody Junitmodel book) {
        return jservice.addBooks(book);


    }


}
