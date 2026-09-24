package com.example.tesla.service;

import com.example.tesla.entity.ClienteEntity;
import com.example.tesla.repository.ClienteRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    @Autowired
    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<ClienteEntity> listarTodosClientes() {
        return repository.findAll();
    }

    public ClienteEntity salvarCliente(@NonNull ClienteEntity cliente) {
        if (repository.findByEmail(cliente.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Cliente já cadastrado com este e-mail");
        }

        return repository.save(cliente);
    }

    public ClienteEntity atualizarCliente(Long id, ClienteEntity clienteAtualizado) {
        return repository.findById(id)
                .map(clienteExistente -> {
                    clienteExistente.setNome(clienteAtualizado.getNome());
                    clienteExistente.setEmail(clienteAtualizado.getEmail());
                    // Adicione outros setters necessários aqui (ex: clienteExistente.setTelefone(...))

                    return repository.save(clienteExistente);
                })
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado para o ID: " + id));
    }

    public void excluirCliente(Long id) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Cliente não encontrado para exclusão");
        }

        repository.deleteById(id);
    }
}