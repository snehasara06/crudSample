package com.kgisl.springcrudsample.Service;

import java.util.List;

import com.kgisl.springcrudsample.Model.Book;

public interface BookService {

    public void saveBook(Book book);

    List<Book> listBooks();

    void deleteBook(Long bookId);

    public Book getBookById(Long bookid);

    void updateBook(Book book);
}
