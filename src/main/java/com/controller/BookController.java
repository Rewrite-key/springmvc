package com.controller;

import com.domain.Book;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save:"+book);
        return "{'module':'book save'}";
    }

    @GetMapping
    public List<Book> getAll(){
        List<Book> list = new ArrayList<Book>();

        Book book1 = new Book();
        book1.setName("计算机");
        book1.setType("计算");
        book1.setDescription("springmvc");

        Book book2 = new Book();
        book2.setName("java编程");
        book2.setType("java");
        book2.setDescription("编程入门");

        list.add(book1);
        list.add(book2);

        return list;
    }


}
