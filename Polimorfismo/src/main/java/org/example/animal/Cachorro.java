package org.example.animal;

public class Cachorro implements Animal{
    @Override
    public String emitirSom() {
        return "RAlf RAlf";
    }
    public String comer(){
        return  "Ração";
    }
    // Sobrescrita do metodo

}
