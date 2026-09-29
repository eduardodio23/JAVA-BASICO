package com.example.projeto.service;

import com.example.projeto.entity.ProdutoEntity;
import com.example.projeto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    //READ
    public List<ProdutoEntity> ListarTodosProdutos(){
        return repository.findAll();
    }

    //CREATE
    public ProdutoEntity salvarProduto (ProdutoEntity produto){
        if(repository.findBylote(produto.getLote()).isPresent())
            throw new IllegalArgumentException("Produto já cadastrado");

        return repository.save(produto);
    }

    //UPDATE
    public ProdutoEntity atualizarProduto(Long id, ProdutoEntity produto){
        if (!repository.existsById(id))
            throw new IllegalArgumentException("Produto não encontrado");

        produto.setId(id);
        return repository.save(produto);
    }

    //DELETE
    public void excluirProduto(Long id){
        if (!repository.existsById(id))
            throw new IllegalArgumentException("produto não encontrado");

        repository.deleteById(id);
    }

    public List<ProdutoEntity> listarTodosProdutos() {
        return List.of();
    }
}
