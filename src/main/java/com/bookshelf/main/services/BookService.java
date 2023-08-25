package com.bookshelf.main.services;

import com.bookshelf.main.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getBooks();

    Book getBookById(Integer id);

    Book insert(Book book);

    void updateBook(Integer id, Book book);

    void deleteBook(Integer bookId);
}
