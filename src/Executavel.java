import modelo.FuncionarioMensalista;

public class Executavel {

    public static void main(String[] args) {

        FuncionarioMensalista fm = new FuncionarioMensalista();
        fm.setNome("João");
        fm.setCpf("543.320.600-91");
        fm.setSalario(14875.88);
        fm.setComissao(5700.0);

        if (fm.validarCPF()) {
            System.out.println("CPF Válido");
        } else {
            System.out.println("Inválido");
        }

        System.out.println("O funcionário " + fm.getNome() + " vai receber: " + fm.calcularSalario());

    }

}
