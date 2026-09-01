package org.example.calculo;

import org.example.calculo.OperacaoMatematica;

public class Sub implements OperacaoMatematica{

    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}