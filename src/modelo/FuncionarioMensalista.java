package modelo;

public class FuncionarioMensalista extends Funcionario {

    private Double salario;
    private Double comissao;

    public FuncionarioMensalista(String nome, Double salario, Double comissao) {
        this.setNome(nome);
        this.setSalario(salario);
        this.setComissao(comissao);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Double calcularSalario() {
        return this.salario + this.comissao;
    }

}
