package com.bharathkalyans.myrestapi.service.impl;

import com.bharathkalyans.myrestapi.dao.AuthorRepository;
import com.bharathkalyans.myrestapi.model.Author;
import com.bharathkalyans.myrestapi.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
}
