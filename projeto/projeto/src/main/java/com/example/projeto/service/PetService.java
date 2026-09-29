package com.example.projeto.service;

import com.example.projeto.entity.PetEntity;
import com.example.projeto.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository repository;

    // READ
    public List<PetEntity> listarTodosPets() {
        return repository.findAll();
    }

    // CREATE
    public PetEntity salvarPet(PetEntity pet) {
        if (pet.getId() != null && repository.existsById(pet.getId())) {
            throw new IllegalArgumentException("Pet já cadastrado");
        }
        return repository.save(pet);
    }

    // UPDATE
    public PetEntity atualizarPet(Long id, PetEntity pet) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Pet não encontrado");
        }

        pet.setId(id);
        return repository.save(pet);
    }

    // DELETE
    public void excluirPet(Long id) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Pet não encontrado");
        }

        repository.deleteById(id);
    }
}