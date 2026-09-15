package com.example.api2.controller;

import com.example.api2.entity.FuncionarioEntity;
import com.example.api2.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository repository;
 // LISTAR TODOS OS FUNCIONARIOS NO BANCO DE DADOS
    @GetMapping
    public List<FuncionarioEntity> ListarTodos() {
            return repository.findAll();

    }
// INSERIR UM FUNCIONARIO NO BANCO DE DADOS
    @PostMapping
    public ResponseEntity<FuncionarioEntity> salvar(@RequestBody FuncionarioEntity funcionario){
        repository.save(funcionario);
        return ResponseEntity.created(null).body(funcionario);
    }
}
