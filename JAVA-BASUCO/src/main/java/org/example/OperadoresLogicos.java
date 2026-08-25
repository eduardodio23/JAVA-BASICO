package org.example;

public class OperadoresLogicos {
    static void main(String[] args) {
        // Declaração de variaveis
        boolean temSol = true;
        boolean folga = true;

        //Só irá passear se as duas condições forem verdadeiras.
        if (temSol && folga) {
            System.out.println("Irei passear hoje! =D");
        }else {
            System.out.println("Não irei passear! =C");
        }

    }
}
