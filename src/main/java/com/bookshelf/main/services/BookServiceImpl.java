package com.bookshelf.main.services;

import com.bookshelf.main.model.Book;
import com.bookshelf.main.repositories.BookRepository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BookServiceImpl implements BookService {
    BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    @Override
    public Book getBookById(Integer id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public Book insert(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void updateBook(Integer id, Book book) {
        Book bookFromDb = bookRepository.findById(id).get();
        System.out.println(bookFromDb.toString());
        bookFromDb.setTitle(book.getTitle());
        bookFromDb.setSummary(book.getSummary());
        bookFromDb.setAuthor(book.getAuthor());
        bookFromDb.setImageUrl(book.getImageUrl());
        bookFromDb.setPublisher(book.getPublisher());
        bookFromDb.setPublishDate(book.getPublishDate());
        // bookFromDb.setLastModified();
        bookRepository.save(bookFromDb);
    }

    @Override
    public void deleteBook(Integer bookId) {
        bookRepository.deleteById(bookId);
    }
}