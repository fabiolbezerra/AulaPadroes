package padrao.estrutural.adapter.atual;

public class BibliotecaAntiga implements ControleDePonto {
    @Override
    public void registraEntrada(Funcionario funcionario) {
        System.out.println("Registrando entrada do " + funcionario.getNome());
    }

    @Override
    public void registraSaida(Funcionario funcionario) {
        System.out.println("Registrando saída do " + funcionario.getNome());
    }
}
