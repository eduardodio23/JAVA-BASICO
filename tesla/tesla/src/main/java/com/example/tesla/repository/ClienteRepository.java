package com.example.tesla.repository;

import com.example.tesla.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    // Consulta por e-mail no banco de dados antes de salvar
    Optional<ClienteEntity> findByEmail(String email);

}
