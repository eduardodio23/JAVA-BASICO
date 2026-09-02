package org.example.organizacao;

public class Motoboy extends Funcionario{
    private String cnh;

    public Motoboy(String nome, String dataDeNascimento, Sexo sexo, Setor setor, double salarioBase, String cnh) {
        super(nome, dataDeNascimento, sexo, setor, salarioBase);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "cnh='" + cnh + '\'' +
                ", nome='" + nome + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                "Salário Final: " + this.getSalarioFinal() +
                '}';
    }
}
