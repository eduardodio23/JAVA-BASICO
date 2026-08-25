package org.example;

public class ComparacaoTipos {
    public static void main(String[] args) {
        // Declaração de variaveis
        String nomeUsuario = "Marta";
        int senha = 123;

        // Comparação de Strings e inteiros
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 456);

        // Exibindo resultados
        System.out.println("O nome do Usuário está correto?" + resultadoNome);
        System.out.println("A senha está correta?" + resultadoSenha);

    }
}
