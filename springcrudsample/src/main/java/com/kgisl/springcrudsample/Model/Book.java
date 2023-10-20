package com.kgisl.springcrudsample.Model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity                                             // (1)

@EntityListeners(BookEntityListener.class)          // (2)

@Table(name = "Book")                               // (3)
// @IdClass(BookId.class)                              // (4)

public class Book {
    @Id                                                 // (5)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // (6)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String name;

    // private String authorName;
    // public String getAuthorName() {
    //     return authorName;
    // }

    // public void setAuthorName(String authorName) {
    //     this.authorName = authorName;
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
private String author;
    // @ManyToOne                                         // (7)
    // private Author author;

public String getAuthor() {
    return author;
}

public void setAuthor(String author) {
    this.author = author;
}

    // public Author getAuthor() {
    //     return author;
    // }

    // public void setAuthor(Author author) {
    //     this.author = author;
    // }

    // @ManyToMany(mappedBy = "books")                     // (8)
    // private List<Author> authors = new ArrayList<>();

    // private String email;

    @Column(name = "createdAt")                        //(9)
    private Timestamp createdAt;
    // createdAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP

    @Column(name = "updatedAt")
    private Timestamp updatedAt;

    // @OneToOne(mappedBy = "book", cascade = CascadeType.ALL, fetch = FetchType.LAZY)  //(10)
    // private BookDetail bookDetail;

   

    // public String getEmail() {
    //     return email;
    // }

    // public void setEmail(String email) {
    //     this.email = email;
    // }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    // public List<Author> getAuthors() {
    //     return authors;
    // }

    // public void setAuthors(List<Author> authors) {
    //     this.authors = authors;
    // }
}

