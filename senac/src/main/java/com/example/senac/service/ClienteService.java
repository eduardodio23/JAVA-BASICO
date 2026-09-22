package com.example.senac.service;

import com.example.senac.entity.ClienteEntity;
import com.example.senac.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;
    //GET
    public List<ClienteEntity> ListarTodos(){
        return repository.findAll();
    }
    // POST
    public  ClienteEntity salvarCliente(ClienteEntity cliente){
        // Verificar se o e-mail já está cadastrado para algum cliente
        // antes de salvar.
        if (repository.findByEmail(cliente.getEmail()).isPresent()){
            throw new IllegalArgumentException("Cliente não encontrado");
        }
        // Salvar no banco de dados
        return repository.save(cliente);
    }
}
