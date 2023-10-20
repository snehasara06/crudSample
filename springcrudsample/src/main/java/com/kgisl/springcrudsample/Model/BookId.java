// package com.kgisl.springcrudsample.Model;
// import java.io.Serializable;


// public class BookId implements Serializable {

//     private Long bookId;  
//     // private String nameOfTheBook;
//     private String authorName;
//     public Long getBookId() {
//         return bookId;
//     }
//     public void setBookId(Long bookId) {
//         this.bookId = bookId;
//     }
//     // public String getNameOfTheBook() {
//     //     return nameOfTheBook;
//     // }
//     // public void setNameOfTheBook(String nameOfTheBook) {
//     //     this.nameOfTheBook = nameOfTheBook;
//     // }
//     public String getAuthor() {
//         return authorName;
//     }
//     public void setAuthor(String author) {
//         this.authorName = author;
//     }

  

//     // In Java, when you work with classes that will be 
//     // used as keys in collections like HashMap or HashSet, 
//     // it's essential to implement the hashCode() and equals() methods correctly. 

// // In the context of your BookId class, 
// // which represents a composite primary key for a Book entity, 
// // it's essential to ensure that two BookId instances are considered equal 
// // (i.e., represent the same composite key) when they have the same values 
// // for the nameOfTheBook and author fields. Additionally, 
// // they should produce the same hash code when their hashCode() method is called.
   
   
// }
