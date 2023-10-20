package com.kgisl.springcrudsample.Model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class BookEntityListener {
    @PrePersist
    public void setCreatedAt(Book book) {
        // This method will be called before a Book entity is persisted (i.e., before
        // it's added to the database).
        // You can perform any custom logic here, such as logging.
        System.out.println("A new book is being added: " + book.getName());
                                        System.out.println( new Timestamp(System.currentTimeMillis()));

        if (book instanceof Auditable) {
            // Auditable auditable = (Auditable) book;
            book.setCreatedAt(new Timestamp(System.currentTimeMillis())); // Set the createdAt property to the current timestamp.
        }
    }

    @PreUpdate
    public void setUpdatedAt(Book book) {
                System.out.println("A new book is updated: " + book.getName());
                                System.out.println( new Timestamp(System.currentTimeMillis()));

        if (book instanceof Auditable) {
            // Auditable auditable = (Auditable) book;
            book.setUpdatedAt(new Timestamp(System.currentTimeMillis())); // Set the updatedAt property to the current timestamp.
        }

    }
}
