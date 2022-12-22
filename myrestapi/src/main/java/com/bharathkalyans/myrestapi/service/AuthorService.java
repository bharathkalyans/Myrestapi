package com.bharathkalyans.myrestapi.service;


import com.bharathkalyans.myrestapi.model.Author;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {
    public List<Author> getAllAuthors();

}
