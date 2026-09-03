package exercicio;

public class Main {
    static void main() {
        Motoboy motoboy = new Motoboy("lucas","10020030088","1000200300", 1200,"20/20/20","13/02/2003","ava-451");
        Diretor diretor = new Diretor("gustavo","10020030088","4555333200",12000,"12/05/2002","30/04/2002",Bonificacao.DIRETOR,1);
        Gerente gerente = new Gerente("gustavo","10020030088","4555333200",12000,"12/05/2002","30/04/2002",Bonificacao.GERENTE);

        System.out.printf("\n" + gerente.toString());
        System.out.printf("\n" + motoboy.toString());
        System.out.printf("\n" + diretor.toString());

    }
}
