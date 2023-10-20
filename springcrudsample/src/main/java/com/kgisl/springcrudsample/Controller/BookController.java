package com.kgisl.springcrudsample.Controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.kgisl.springcrudsample.Model.Book;
import com.kgisl.springcrudsample.Service.BookService;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String bookForm(Locale locale, Model model) {
        model.addAttribute("books", bookService.listBooks());
        return "book";
    }

    @ModelAttribute("book")
    public Book formBackingObject() {
        return new Book();
    }
// POST NEW BOOK
    @GetMapping("/addbook")
    public String showAddBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "bookForm";
    }

    @PostMapping("/addbook")
    public String saveBook(@ModelAttribute("book") Book book, Model model) {
        bookService.saveBook(book);
        return "redirect:/";
    }
// DELETE
    @GetMapping("/delete/{bookId}") 
    public String showDeleteConfirmation(@PathVariable("bookId") Long bookId, Model model) {
        model.addAttribute("book", this.bookService.getBookById(bookId));
        return "deleteConfirmation";
    }

    @PostMapping("/delete/{bookId}") 
    public String deleteBook(@PathVariable("bookId") Long bookId) {
        this.bookService.deleteBook(bookId);
        return "redirect:/";
    }
// EDIT 
    @GetMapping("/edit/{bookId}") 
    public String showEditBookForm(@PathVariable("bookId") Long bookId, Model model) {
        model.addAttribute("book", this.bookService.getBookById(bookId));
        return "editForm";
    }

    @PostMapping("/edit/{bookId}") 
    public String editBook(@PathVariable("bookId") Long bookId, @ModelAttribute("book") Book book) {
          // Load the existing book from the database
    Book existingBook = this.bookService.getBookById(bookId);

    // Update the existing book's properties with the editedBook's properties
    existingBook.setName(book.getName());
    existingBook.setAuthor(book.getAuthor());
    // Update other properties as needed...

    // Save the updated book
    bookService.updateBook(existingBook);

    return "redirect:/";
    }

}
