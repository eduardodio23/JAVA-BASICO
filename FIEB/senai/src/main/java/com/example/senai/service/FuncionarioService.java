package com.example.senai.service;

import com.example.senai.entity.FuncionarioEntity;
import com.example.senai.repository.FuncionarioRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioEntity> ListarTodosFuncionarios(){
        return repository.findAll();

    }

    public FuncionarioEntity salvarFuncionario(@NonNull FuncionarioEntity funcionario) {
        if (repository.findByEmail(funcionario.getEmail()).isPresent()){
            throw new IllegalArgumentException("Funcionario já cadastrado");
        }

        // caso  não esteja cadastrado, será cadastrado agora.
        return repository.save(funcionario);
    }
}
