package com.example.senac.repository;

import com.example.senac.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    // Consultar no banco de dados se o e-mail já existe,
    // antes de salvar, atualizar ou deletar um cliente.
    Optional<ClienteEntity> findByEmail(String email);
}
