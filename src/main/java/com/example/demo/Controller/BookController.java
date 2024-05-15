package com.example.demo.Controller;

import com.example.demo.Service.BookService;
import com.example.demo.pojo.BookPojo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping
    public void saveBook(@RequestBody BookPojo bookPojo){
        bookService.saveData(bookPojo);
    }
//    @GetMapping
//    public
}
