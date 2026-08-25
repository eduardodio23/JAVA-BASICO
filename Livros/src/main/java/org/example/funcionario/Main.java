package org.example.funcionario;

public class Main {
    static void main() {
        Funcionario funcionario1 = new Funcionario("Getulio","100.200.300-88", "12/01/1999", "getuliovargas@somos.com");
        Livro livro1 = new Livro("Código do Consumidor", "getulio", 789, 87.99);

        System.out.println("DADOS do LIVRO:");
        System.out.println("Titulo:" + livro1.getTitulo());
        System.out.println("Autor:" + livro1.getAutor());
        System.out.println("Nume:ro de paginas:" + livro1.getNumeroDePaginas());
        System.out.println("Preço" + livro1.getPreco());

        System.out.println("\nDADOS do FUNCIONARIO");
        System.out.println("Funcionario:" + funcionario1.getNome());
        System.out.println("CPF:" + funcionario1.getCpf());
        System.out.println("Nascimento:" + funcionario1.getNascimento());
        System.out.println("Email:" + funcionario1.getEmail());


    }
}
