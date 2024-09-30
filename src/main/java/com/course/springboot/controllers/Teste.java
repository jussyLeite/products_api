package com.course.springboot.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Deus")
public class Teste {


    @GetMapping
    public  String obrigadoDeus(){
        return "Obrigado meu Deus por tudo! ";
    }
}
