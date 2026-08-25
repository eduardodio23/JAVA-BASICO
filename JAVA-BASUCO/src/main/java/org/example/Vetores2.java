package org.example;

import java.util.Scanner;

public class Vetores2 {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            double[] notas = new double[2];
            double media = 0;

            for (int i = 0; i < 2; i++){
                System.out.println("Digite a" +(i + 1) +"ªnota:");
                notas[i] = ler.nextDouble();
            }

            media = (notas[0] + notas[1] / 2);


        System.out.println("\nExibindo as notas:");
            for (double nota: notas){
                System.out.println("Nota:" + nota);

            }
        System.out.println("media arimetica" + media);
            ler.close();

    }
}
