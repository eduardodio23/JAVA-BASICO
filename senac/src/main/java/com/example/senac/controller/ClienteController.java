package com.example.senac.controller;

import com.example.senac.entity.ClienteEntity;
import com.example.senac.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")

public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping
    public List<ClienteEntity> ListarTodosClientes(){
        return service.ListarTodos();
    }

    @PostMapping
    ResponseEntity<Map<String, String>> salvar(@RequestBody ClienteEntity cliente){
        service.salvarCliente(cliente);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Cliente salvo com sucesso!"));
    }
}
