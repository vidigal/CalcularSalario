import modelo.Funcionario;
import modelo.FuncionarioHorista;
import modelo.FuncionarioMensalista;

import java.util.ArrayList;
import java.util.Collection;

public class Executavel2 {

    public static void main(String[] args) {

        FuncionarioMensalista fm1 = new FuncionarioMensalista("João", 10500.0, 4000.0);
        FuncionarioMensalista fm2 = new FuncionarioMensalista("Maria", 18400.0, 1000.0);
        FuncionarioMensalista fm3 = new FuncionarioMensalista("Joana", 17200.0, 9000.0);

        FuncionarioHorista fh1 = new FuncionarioHorista("Paula", 100.0, 80.0);
        FuncionarioHorista fh2 = new FuncionarioHorista("Pedro", 180.0, 120.0);
        FuncionarioHorista fh3 = new FuncionarioHorista("José", 175.0, 100.0);

        Collection<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(fm1);
        funcionarios.add(fm2);
        funcionarios.add(fm3);
        funcionarios.add(fh1);
        funcionarios.add(fh2);
        funcionarios.add(fh3);

        for (Funcionario f: funcionarios) {
            imprimirInformacoes(f);
        }
    }

    public static void imprimirInformacoes(Funcionario funcionario) {
        System.out.println(funcionario.getNome() + " recebe: " + funcionario.calcularSalario());
    }

}
