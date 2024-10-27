package padrao.comportamental.command;

public class Botao {
    private Comando comando;

    public Botao(Comando comando) {
        this.comando = comando;
    }

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void executarComando() {
        this.comando.executar();
    }
}
