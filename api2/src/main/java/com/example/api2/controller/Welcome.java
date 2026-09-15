package com.example.api2.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @RequestMapping ("/")
    public String mensagem(){
        return "Bem-vindo";
    }

    @RequestMapping("/dev")
    public String dev(){
        return "Feito por Eduardo";
    }

    @RequestMapping("/turma")
    public String turma(){
        return "Turma 99160";
    }


    @RequestMapping("/curso")
    public String curso(){
        return "Curso: Desenvolvimento de sistemas";
    }



}
