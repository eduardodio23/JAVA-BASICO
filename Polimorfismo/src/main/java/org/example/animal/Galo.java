package org.example.animal;

public class Galo implements  Animal{
    @Override
    public String emitirSom() {
        return "Cocórico";
    }

    @Override
    public String comer() {
        return "Milho";
    }
}
