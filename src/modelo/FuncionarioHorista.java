package modelo;

import javax.lang.model.element.ExecutableElement;

public class FuncionarioHorista extends Funcionario {

    private Double valorHora;
    private Double quantidadeHoras;

    public FuncionarioHorista(String nome, Double valorHora, Double quantidadeHoras) {
        this.setNome(nome);
        this.setValorHora(valorHora);
        this.setQuantidadeHoras(quantidadeHoras);
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(Double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public Double calcularSalario() {
        return this.quantidadeHoras * this.valorHora;
    }
}
