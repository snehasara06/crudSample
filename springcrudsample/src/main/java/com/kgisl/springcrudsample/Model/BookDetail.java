// package com.kgisl.springcrudsample.Model;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.OneToOne;

// @Entity
// public class BookDetail {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private String description;

//     @OneToOne // one book with one bookdetail
//     @JoinColumn(name = "bookId") // foreign key is bookId
//     private Book book;


//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getDescription() {
//         return description;
//     }

//     public void setDescription(String description) {
//         this.description = description;
//     }

//     public Book getBook() {
//         return book;
//     }

//     public void setBook(Book book) {
//         this.book = book;
//     }

// }
