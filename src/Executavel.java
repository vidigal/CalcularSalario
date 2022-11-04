import modelo.FuncionarioMensalista;

public class Executavel {

    public static void main(String[] args) {

        FuncionarioMensalista fm = new FuncionarioMensalista("João", 14875.88, 5700.0);
        fm.setCpf("543.320.600-91");


        if (fm.validarCPF()) {
            System.out.println("CPF Válido");
        } else {
            System.out.println("Inválido");
        }

        System.out.println("O funcionário " + fm.getNome() + " vai receber: " + fm.calcularSalario());

    }

}
