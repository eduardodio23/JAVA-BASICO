package org.example.organizacao;

public enum Setor {
    RECURSOS_HUMANOS("Recursos_Humanos"),
    FINANCEIRO("Financeiro"),
    OPERACOES("Operacões");

    private String nome;

    Setor(String nome) {
        this.nome = nome;
    }

}
