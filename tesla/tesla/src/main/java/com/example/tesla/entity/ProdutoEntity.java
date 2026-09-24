package com.example.tesla.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tab_produto")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoEntity {
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  Long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String preco;
    @Column(nullable = false)
    private String quantidade;
}
