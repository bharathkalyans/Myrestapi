package com.bharathkalyans.myrestapi.dao;

import com.bharathkalyans.myrestapi.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
