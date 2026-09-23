package com.example.senai.controller;


import com.example.senai.entity.FuncionarioEntity;
import com.example.senai.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService service;

    @GetMapping
    public List<FuncionarioEntity> ListarTodos(){
        return service.ListarTodosFuncionarios();
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> salvar(@RequestBody FuncionarioEntity funcionario){
        service.salvarFuncionario(funcionario);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Funcionario cadastrado com sucesso"));
    }
}
