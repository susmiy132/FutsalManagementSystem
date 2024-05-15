package com.example.demo.Service.impl;

import com.example.demo.Service.BookService;
import com.example.demo.Try.Book;
import com.example.demo.Try.Ground;
import com.example.demo.Try.User;
import com.example.demo.pojo.BookPojo;
import com.example.demo.repo.BookRepository;
import com.example.demo.repo.GroundRepository;
import com.example.demo.repo.UserRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter
@Setter

public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final GroundRepository groundRepository;
    private final UserRepository repository;
    private final UserRepository userRepository;

    @Override
    public void saveData(BookPojo bookpojo) {
        Book book = new Book();
        book.setName(bookpojo.getBookName());

        Ground ground = groundRepository.findById(bookpojo.getGroundId()).get();
        book.setGround(ground);

//        User user = (User) userRepository.findById(bookpojo.getUserId()).get();
//        book.setUser(user);

        bookRepository.save(book);

    }
}
