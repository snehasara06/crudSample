// package com.kgisl.springcrudsample.Model;

// import java.util.ArrayList;
// import java.util.List;

// import javax.persistence.Embeddable;
// import javax.persistence.Embedded;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.JoinTable;
// import javax.persistence.ManyToMany;
// import javax.persistence.OneToMany;

// @Entity
// public class Author {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long authorId;

    

//     public Long getAuthorId() {
//         return authorId;
//     }

//     public void setAuthorId(Long authorId) {
//         this.authorId = authorId;
//     }

//     private String authorName;


//     public String getAuthorName() {
//         return authorName;
//     }

//     public void setAuthorName(String authorName) {
//         this.authorName = authorName;
//     }

//     @OneToMany(mappedBy = "author")                         // (11)
//     // "author"- name of the field in the Book entity that owns the relationship.
//     private List<Book> books;

//     public List<Book> getBooks() {
//         return books;
//     }

//     public void setBooks(List<Book> books) {
//         this.books = books;
//     }

//     // @ManyToMany                             
//     // @JoinTable(                                             // (12)
//     //     name = "book_author",
//     //     joinColumns = @JoinColumn(name = "id"),
//     //     inverseJoinColumns = @JoinColumn(name = "bookId")
//     // )
//     // private List<Book> multipleBooks = new ArrayList<>();
   

//     // @Embedded                                               // (13)
//     // private Address address;


//     // public Long getAuthorId() {
//     //     return author_id;
//     // }

//     // public void setAuthorId(Long author_id) {
//     //     this.author_id = author_id;
//     // }

//     // public String getAuthorName() {
//     //     return author_name;
//     // }

//     // public void setAuthorName(String author_name) {
//     //     this.author_name = author_name;
//     // }

//     // public List<Book> getBooks() {
//     //     return books;
//     // }

//     // public void setBooks(List<Book> books) {
//     //     this.books = books;
//     // }
//     // public List<Book> getMultipleBooks() {
//     //     return multipleBooks;
//     // }

//     // public void setMultipleBooks(List<Book> multipleBooks) {
//     //     this.multipleBooks = multipleBooks;
//     // }
    

// }
// // @Embeddable                                                     // with Embedded
// // class Address{
// //     private String street;
// //     private String city;
// //     private String state;
// //     private String zipCode;

// //     public String getStreet() {
// //         return street;
// //     }
// //     public void setStreet(String street) {
// //         this.street = street;
// //     }
// //     public String getCity() {
// //         return city;
// //     }
// //     public void setCity(String city) {
// //         this.city = city;
// //     }
// //     public String getState() {
// //         return state;
// //     }
// //     public void setState(String state) {
// //         this.state = state;
// //     }
// //     public String getZipCode() {
// //         return zipCode;
// //     }
// //     public void setZipCode(String zipCode) {
// //         this.zipCode = zipCode;
// //     }

    