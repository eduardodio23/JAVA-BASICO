package org.example.trabalho;

public class Main {
    static void main() {
       Endereco endereco1 = new Endereco("40430-000", "salvador", "rua dos bobos","avenida", "234" );
       Endereco endereco2 = new Endereco("547-825","lauro de freitas","casa","avenida", "66");
       Endereco endereco3 = new Endereco("467-900", "guanabara","ao lado do bar do tourão", "apartamento", "90");

       Engenheiro engenheiro = new Engenheiro("marcos@gmail.com", endereco1, "marcos", 1200, "548");
       Medico medico = new Medico("william@gmail.com", endereco2,"williams",30000,"40-900-867");


        System.out.println("Engenheiro: " + engenheiro);
        System.out.println("Medico: " + medico);
    }
}
