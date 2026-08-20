package org.example;

public class Atividade3 {
    static void main(String[] args) {
        double nota1 = 1;
        double nota2 = 10;
        double nota3 = 0;
        double resultado = nota1 + nota2 + nota3;


        if (resultado >= 7){
            System.out.println("aluno aprovado:" + resultado);
        } else if (resultado  >= 5) {
            System.out.println("aluno em verificação suplementar:" + resultado);
        } else {
            System.out.println("aluno reprovado:" + resultado);

        }


    }
}
