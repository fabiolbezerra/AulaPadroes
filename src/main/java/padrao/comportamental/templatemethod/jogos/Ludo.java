package padrao.comportamental.templatemethod.jogos;

public class Ludo extends Jogo {
    @Override
    protected void lancarDados() {
        System.out.println("Lançando dado do LUDO");
    }

    @Override
    protected void movimentarPecas() {
        System.out.println("Movimentando peça no LUDO");
    }

    @Override
    protected boolean ganhou() {
        return Math.random() > 0.7;
    }
}
