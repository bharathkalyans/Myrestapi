package com.bharathkalyans.myrestapi.controller;


import com.bharathkalyans.myrestapi.model.Author;
import com.bharathkalyans.myrestapi.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping("/persons")
    public List<Author> getAuthors() {
        return authorService.getAllAuthors();
    }
}
