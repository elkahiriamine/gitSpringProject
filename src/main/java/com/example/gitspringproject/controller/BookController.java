package com.example.gitspringproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {

    @RequestMapping(value = "/book/home",method = RequestMethod.GET)
    public String getBook(){
        return "book/home";
    }

    @RequestMapping(value = "/book/listBooks",method = RequestMethod.GET)
    public String getListBooks(){
        return "book/listBooks";
    }

}
