package com.example.senai.repository;

import com.example.senai.entity.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {

    // Consulta por e-mail no banco de dados antes de salvar
    Optional<FuncionarioEntity> findByEmail(String email);
}
