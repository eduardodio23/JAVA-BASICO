package com.example.exercicio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/")
    public String bemvindo(){
        return "Bem-Vindo";
    }

    @GetMapping("/dev")
    public String dev(){
        return "Eduardo";
    }
}
