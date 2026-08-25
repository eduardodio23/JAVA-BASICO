package org.example.livro;

public class Main {
    static void main() {
        //instanciar a classe Livro.
        Livro livro1  = new Livro("Cris&Greg","lusca",899,4.99);
        Livro livro2  = new Livro("Roubo da fala","lia",89,49.99);
        Livro livro3  = new Livro("Aqueles que não vieram","miguel",480,39.99);

        System.out.println("\nTitulo:" + livro1.getTitulo());
        System.out.println("Autor:" + livro1.getAutor());
        System.out.println("Nume:ro de paginas:" + livro1.getNumeroDePaginas());
        System.out.println("Preço" + livro1.getPreco());


        System.out.println("\nTitulo:" + livro2.getTitulo());
        System.out.println("Autor:" + livro2.getAutor());
        System.out.println("Nume:ro de paginas:" + livro2.getNumeroDePaginas());
        System.out.println("Preço" + livro2.getPreco());


        System.out.println("\nTitulo:" + livro3.getTitulo());
        System.out.println("Autor:" + livro3.getAutor());
        System.out.println("Numero de paginas:" + livro3.getNumeroDePaginas());
        System.out.println("Preço:" + livro3.getPreco());


    }
}
