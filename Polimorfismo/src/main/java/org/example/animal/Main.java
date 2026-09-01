package org.example.animal;

public class Main {
    static void main() {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Galo galo = new Galo();
        Pato pato = new Pato();

        System.out.println("Cachorro faz:" + cachorro.emitirSom () + "e come:" + cachorro.comer());
        System.out.println("Gato faz:" + gato.emitirSom() + "e come:" + gato.comer());
        System.out.println("Galo faz:" + galo.emitirSom() + "e come:" + galo.comer());
        System.out.println("Pato faz:" + pato.emitirSom() + "e come:" + pato.comer());
    }
}
