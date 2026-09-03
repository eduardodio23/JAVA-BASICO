package exercicio;

public abstract class CargodeConfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargodeConfianca(String nome, String cpf, String rg, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, salarioBase, dataNascimento, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

}
