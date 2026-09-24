package com.example.tesla.repository;

import com.example.tesla.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
    // Consulta por e-mail no banco de dados antes de salvar
    Optional<ProdutoEntity> findByNome(String nome);

}
