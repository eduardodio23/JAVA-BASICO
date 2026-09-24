package com.example.tesla.service;

import com.example.tesla.entity.ProdutoEntity;
import com.example.tesla.repository.ProdutoRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    @Autowired
    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<ProdutoEntity> listarTodosProdutos() {
        return repository.findAll();
    }

    public ProdutoEntity salvarProduto(@NonNull ProdutoEntity produto) {
        if (repository.findByNome(produto.getNome()).isPresent()) {
            throw new IllegalArgumentException("Produto já cadastrado");
        }

        return repository.save(produto);
    }

    public ProdutoEntity atualizarProduto(Long id, ProdutoEntity produtoAtualizado) {
        return repository.findById(id)
                .map(produtoExistente -> {
                    produtoExistente.setNome(produtoAtualizado.getNome());
                    produtoExistente.setPreco(produtoAtualizado.getPreco());
                    return repository.save(produtoExistente);
                })
                .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado para o ID: " + id));
    }

    public void excluirProduto(Long id) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Produto não encontrado para exclusão");
        }

        repository.deleteById(id);
    }
}