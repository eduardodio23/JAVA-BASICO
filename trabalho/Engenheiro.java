package org.example.trabalho;

public class Engenheiro extends Funcionario {
    private String crea;

    // Construtor corrigido: recebe apenas o que precisa e passa para o super()
    public Engenheiro(String email, Endereco endereco, String nome, float salario, String crea) {
        super(email, endereco, nome, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                ", crea='" + crea + '\'' +
                ", email='" + getEmail() + '\'' +
                ", endereco=" + getEndereco() +
                '}';
    }
}