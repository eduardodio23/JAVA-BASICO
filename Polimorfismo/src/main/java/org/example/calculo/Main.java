package org.example.calculo;

public class Main {
    static void main() {
        Soma soma = new Soma();
        Sub sub = new Sub();
        Multi multi = new Multi();
        Divisao div = new Divisao();

        System.out.println("soma" + soma.calcular(3,8));
        System.out.println("subtração" + sub.calcular(8,9));
        System.out.println("Multi" + multi.calcular(8,9));
        System.out.println("Divisão" + div.calcular(8,9));
    }
}
