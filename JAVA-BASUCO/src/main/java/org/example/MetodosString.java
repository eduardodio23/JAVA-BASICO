package org.example;

import java.util.Locale;

public class MetodosString {
    static void main(String[] args) {
        String nome = "Amanda";
        String sobrenome = "Silva";

        // Exibindo a quantidade de caracteres
        System.out.println("Tamanho do nome:" + nome.length());
        System.out.println("Tamanho do sobrenome:" + sobrenome.length());

        // Concatenando nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        // Exibindo nome completo usando metodos strings - maiusculas
        System.out.println("Concatenação Maiúscula:" + nomeCompleto.toUpperCase());

        // Exibindo nome completo usando metodos srings - minusculas
        System.out.println("Concatenação Minúscula:" + nomeCompleto.toLowerCase());


    }
}
