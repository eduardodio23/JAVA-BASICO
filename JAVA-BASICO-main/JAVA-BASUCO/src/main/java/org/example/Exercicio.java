package org.example;

import java.util.Scanner;

public class Exercicio {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];
        double media = 0;

      for (int i = 0; i < 2; i++){
          do {
              System.out.println("Digite a " + (i + 1) + "ª nota (0 a 10):");
              notas[i] = ler.nextDouble();

              if (notas[i] < 0 || notas[i] > 10){
                  System.out.println("Nota invalida! digite um valor entre 0 a 10.");
              }

          }while (notas [i] < 0 || notas[i] > 10);

      }
      media = (notas[0] + notas[1]) / 2;

        System.out.println("\nExibindo as notas:");
        for (double nota: notas){
            System.out.println("Nota:" + nota);

        }
        System.out.println("media arimetica" + media);
        ler.close();

    }
}
