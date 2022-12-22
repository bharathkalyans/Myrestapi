package com.bharathkalyans.myrestapi;

import com.bharathkalyans.myrestapi.model.Author;

import java.util.List;

public interface AuthorDao {

    public List<Author> getAuthors();

}
