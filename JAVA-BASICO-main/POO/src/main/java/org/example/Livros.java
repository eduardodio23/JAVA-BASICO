package org.example;

public class Livros {
    private String Titulo;
    private String Autor;
    private double Numero_pg;
    private float Preco;

    public Livros(String titulo, String autor, double numero_pg, float preco) {
        Titulo = titulo;
        Autor = autor;
        Numero_pg = numero_pg;
        Preco = preco;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public double getNumero_pg() {
        return Numero_pg;
    }

    public void setNumero_pg(double numero_pg) {
        Numero_pg = numero_pg;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float preco) {
        Preco = preco;
    }
}
