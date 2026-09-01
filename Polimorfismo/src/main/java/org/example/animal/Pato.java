package org.example.animal;

public class Pato implements Animal {

    @Override
    public String emitirSom() {
        return "Qua, Quack";
    }

    @Override
    public String comer() {
        return "Milho";
    }
}
