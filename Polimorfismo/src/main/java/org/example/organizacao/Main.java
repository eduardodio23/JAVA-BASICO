package org.example.organizacao;

public class Main {
    static void main() {
        Motoboy motoboy = new Motoboy("nilton", "08/12/2003", Sexo.MASCULINO, Setor.OPERACOES, 1200, "A/B");
        Motoboy motoboy1 = new Motoboy("melissa", "08/12/2006", Sexo.FEMININO, Setor.OPERACOES, 1200, "A/B");
        Diretor diretor = new Diretor("Wesley", "07/05/1999", Sexo.MASCULINO, Setor.RECURSOS_HUMANOS, 8000);

        System.out.println(diretor.toString());
        diretor.admitir(motoboy1);

        System.out.println("\nFuncionario contratado! dados:" + motoboy1);

    }
}
