package exercicio;

public class Diretor extends CargodeConfianca implements Contratacao{
    private double premio = 1.1;

    public Diretor(String nome, String cpf, String rg, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao, double premio) {
        super(nome, cpf, rg, salarioBase, dataNascimento, dataAdmissao, bonificacao);
        this.premio = premio;
    }


    @Override
    public void admitir(Funcionario funcionario) {

    }

    @Override
    public void demitir(Funcionario funcionario) {

    }

    @Override
    public double obeterSalarioFinal() {
        return 0;
    }
}
