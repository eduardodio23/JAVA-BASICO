package com.example.exercicio.controller;

import com.example.exercicio.entity.ClienteEntity;
import com.example.exercicio.repository.ClienteRepository;
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
    private ClienteRepository repository;

    @GetMapping
    public List<ClienteEntity> ListarTodos() {
        return repository.findAll();
    }


    @PostMapping
    public ResponseEntity <Map<String, Object>> salvar (@RequestBody ClienteEntity cliente) {
     repository.save(cliente);
     return ResponseEntity
             .status(HttpStatus.CREATED)
             .body(Map.of("mensagem","Cliente salvo!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(@PathVariable Long id, @RequestBody ClienteEntity cliente) {
        if (!repository.existsById(id)) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(Map.of("mensagem", "Cliente não encontrado"));


        }
            cliente.setId(id);
            repository.save(cliente);
            return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "Cliente atualizado com sucesso"));

    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> excluir(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(Map.of("mensagem", "Cliente não encontrado"));
        }

        repository.deleteById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "Cliente excluído com sucesso"));
    }



}
