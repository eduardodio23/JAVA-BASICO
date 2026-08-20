package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //ALGORITMO
//        String nome = "Marta";
//        int idade = 25;


        Clientes cliente1 = new Clientes();
        Clientes cliente2 = new Clientes();
        //SEM ENCAPSULAMENTO
//        cliente1.nome = "Marta";
//        cliente1.idade = 25;
//
//        cliente2.nome = "alessandra";
//        cliente2.idade = 45;
        //COM ENCAPSULAMENTO(PRIVATE)
        Clientes clientes1 = new Clientes();
        clientes1.setNome("Marta");
        clientes1.setIdade(25);

        Clientes clientes2 = new Clientes();
        clientes2.setNome("Alessandra");
        clientes2.setIdade(35);



        System.out.println("Nome: " + clientes1.getNome());
        System.out.println("Idade: " + clientes1.getIdade());
        System.out.println("Nome: " + clientes2.getNome());
        System.out.println("Idade: " + clientes2.getIdade());


//
        Funcionario funcionario1 = new Funcionario("Eduardo",15,"eduardo@gmail.com");
//        funcionario1.setNome("Eduardo");
//        funcionario1.setIdade(15);
//        funcionario1.setEmail("eduardo@gmail.com");

        System.out.println("\nFuncionarios:");
        System.out.println("Nome:" + funcionario1.getNome());
        System.out.println("Idade:" + funcionario1.getIdade());
        System.out.println("Email:" + funcionario1.getEmail());

        Produto produto1 = new Produto("miojo",1,1.99 );
//        produto1.setNome("miojo");
//        produto1.setPreco(1.99);
//        produto1.setQuantidade(49);

        System.out.println("\nProdutos:");
        System.out.println("Produto:" + produto1.getNome());
        System.out.println("Preço:" + produto1.getPreco());
        System.out.println("Quantidade:" + produto1.getQuantidade());

        Livros livros = new Livros("Memorias postumas de brás cubas","Machado de Assis", 742, 30);
        Livros livros2 = new Livros("Arte da guerra","Vulgo: Hitler", 830, 48);

        System.out.println("\nLivros:");
        System.out.println("Titulo:" + livros.getTitulo());
        System.out.println("Autor:" + livros.getAutor());
        System.out.println("Paginás:" + livros.getNumero_pg());
        System.out.println("Preço: R$:" + livros.getPreco());




        System.out.println("-------------------------");
        System.out.println("Titulo:" + livros2.getTitulo());
        System.out.println("Autor:" + livros2.getAutor());
        System.out.println("Paginás:" + livros2.getNumero_pg());
        System.out.println("Preço: R$" + livros2.getPreco());





        }
    }
