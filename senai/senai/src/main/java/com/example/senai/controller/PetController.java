package com.example.senai.controller;


import com.example.senai.entity.PetEntity;
import com.example.senai.entity.UsuarioEntity;
import com.example.senai.repository.PetRepository;
import com.example.senai.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetRepository repository;

    @GetMapping
    public List<PetEntity> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody PetEntity pet) {
        repository.save(pet);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "pet cadastrado com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(@PathVariable Long id, @RequestBody PetEntity pet) {
        if (!repository.existsById(id)) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(Map.of("mensagem", "pet não encontrado"));
        }

        pet.setId(id);
        repository.save(pet);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "pet atualizado com sucesso"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> excluir(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(Map.of("mensagem", "pet não encontrado"));
        }

        repository.deleteById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "pet excluído com sucesso"));
    }
}
