package padrao.comportamental.templatemethod.jogos;

public class Monopolio extends Jogo {
    @Override
    protected void lancarDados() {
        System.out.println("Lançando dado do MONOPÓLIO");
    }

    @Override
    protected void movimentarPecas() {
        System.out.println("Movimentando peça no MONOPÓLIO");
    }

    @Override
    protected boolean ganhou() {
        return Math.random() > 0.9;
    }
}
