package org.example.empresa;

import org.example.organizacao.Funcionario;
import org.example.organizacao.Setor;
import org.example.organizacao.Sexo;

public class Motoboy extends Funcionario {
    private String placaDaMoto;

    public Motoboy(String nome, String dataDeNascimento, Sexo sexo, Setor setor, double salarioBase, String placaDaMoto) {
        super(nome, dataDeNascimento, sexo, setor, salarioBase);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placaDaMoto='" + placaDaMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public double getSalarioFinal() {
        return 0;
    }
}
