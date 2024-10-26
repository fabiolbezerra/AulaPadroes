package padrao.comportamental.templatemethod.jogos;

public abstract class Jogo {
    public void minhaVezDeJogar(String jogador) {
        System.out.printf("%s está jogando ...\n", jogador);
        lancarDados();
        movimentarPecas();
        if (ganhou()) {
            System.out.printf("Parabéns, %s é o(a) vencedor(a)\n", jogador);
        } else {
            System.out.println("É a vez do próximo jogador!");
        }
    }

    protected abstract void lancarDados();

    protected abstract void movimentarPecas();

    protected abstract boolean ganhou();
}
