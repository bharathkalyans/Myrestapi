package com.bharathkalyans.myrestapi.model;


import jakarta.persistence.*;

@Entity
public class Author {

    @Id
    @SequenceGenerator(name = "author_sequence_generator", sequenceName = "author_sequence_generator", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;
    private String authorName;

    public Author() {
    }

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
