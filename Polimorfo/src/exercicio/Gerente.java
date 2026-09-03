package exercicio;

public class Gerente extends CargodeConfianca {
    public Gerente(String nome, String cpf, String rg, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, salarioBase, dataNascimento, dataAdmissao, bonificacao);
    }


    @Override
    public double obeterSalarioFinal() {
        return 0;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + obeterSalarioFinal() +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                '}';
    }
}
