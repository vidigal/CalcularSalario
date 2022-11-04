import modelo.FuncionarioHorista;
import modelo.FuncionarioMensalista;

public class Executavel2 {

    public static void main(String[] args) {

        FuncionarioMensalista fm1 = new FuncionarioMensalista("João", 10500.0, 4000.0);
        FuncionarioMensalista fm2 = new FuncionarioMensalista("Maria", 18400.0, 1000.0);
        FuncionarioMensalista fm3 = new FuncionarioMensalista("Joana", 17200.0, 9000.0);

        FuncionarioHorista fh1 = new FuncionarioHorista("Paula", 100.0, 80.0);
        FuncionarioHorista fh2 = new FuncionarioHorista("Pedro", 180.0, 120.0);
        FuncionarioHorista fh3 = new FuncionarioHorista("José", 175.0, 100.0);

        System.out.println("O funcionário " + fm1.getNome() + " irá receber " + fm1.calcularSalario());
        System.out.println("O funcionário " + fm2.getNome() + " irá receber " + fm2.calcularSalario());
        System.out.println("O funcionário " + fm3.getNome() + " irá receber " + fm3.calcularSalario());

        System.out.println("O funcionário " + fh1.getNome() + " irá receber " + fh1.calcularSalario());
        System.out.println("O funcionário " + fh2.getNome() + " irá receber " + fh2.calcularSalario());
        System.out.println("O funcionário " + fh3.getNome() + " irá receber " + fh3.calcularSalario());

    }

}
