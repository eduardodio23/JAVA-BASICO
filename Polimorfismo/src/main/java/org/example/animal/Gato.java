package org.example.animal;

public class Gato implements Animal {
    @Override
    public String emitirSom() {
        return "Miau, Miau";
    }

    @Override
    public String comer() {
        return "Ração";
    }
}
