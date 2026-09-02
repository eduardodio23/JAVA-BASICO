package org.example.exemplo;

public class Cachorro implements  Animal {

    @Override
    public String emitirSom() {
        return "Ralf-Ralf";
    }

    @Override
    public String comer() {
        return "Ração";
    }
}
