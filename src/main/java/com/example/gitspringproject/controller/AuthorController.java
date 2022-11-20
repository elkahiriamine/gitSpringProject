package com.example.gitspringproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthorController {

    @RequestMapping(value = "/author/home",method = RequestMethod.GET)
    public String getBook(){
        return "author/home";
    }

    @RequestMapping(value = "/author/listBooks",method = RequestMethod.GET)
    public String getListBooks(){
        return "author/listBooks";
    }
}
