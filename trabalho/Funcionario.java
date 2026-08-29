package org.example.trabalho;

public abstract class Funcionario {
    protected String nome;
    protected String email;
    protected float salario;
    protected Endereco endereco;

    public Funcionario(String email, Endereco endereco, String nome, float salario) {
        this.email = email;
        this.endereco = endereco;
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario(String nome, String telefone) {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                ", endereco=" + endereco +
                '}';
    }
}
