package padrao.comportamental.templatemethod;

import padrao.comportamental.templatemethod.jogos.Jogo;
import padrao.comportamental.templatemethod.jogos.Ludo;
import padrao.comportamental.templatemethod.jogos.Monopolio;

public class Ludoteca {
    public static void main(String[] args) {
        Jogo partidaDeMonopolio = new Monopolio();
        partidaDeMonopolio.minhaVezDeJogar("Fulano");
        //Outros jogodores do Monopólio poderiam continuar jogando ...

        Jogo partidaDeLudo = new Ludo();
        partidaDeLudo.minhaVezDeJogar("Beltrana");
        //Outros jogodores do Ludo poderiam continuar jogando ...
    }
}
