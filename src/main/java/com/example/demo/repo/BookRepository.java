package com.example.demo.repo;

import com.example.demo.Try.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository {
    void save(Book book);
}
