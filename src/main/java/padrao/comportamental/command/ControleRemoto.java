package padrao.comportamental.command;

import padrao.comportamental.command.comandos.GirarDireita;
import padrao.comportamental.command.comandos.GirarEsquerda;
import padrao.comportamental.command.comandos.MoverParaFrente;
import padrao.comportamental.command.comandos.MoverParaTras;

public class ControleRemoto {
    public static void main(String[] args) {
        //Criando o carro de controle remoto
        Brinquedo carroDeControleRemoto = new Brinquedo();

        //Criando os botões do controle remoto
        Botao paraFrente = new Botao(new MoverParaFrente(carroDeControleRemoto));
        Botao paraTras = new Botao(new MoverParaTras(carroDeControleRemoto));
        Botao esquerda = new Botao(new GirarEsquerda(carroDeControleRemoto));
        Botao direita = new Botao(new GirarDireita(carroDeControleRemoto));

        //Movimentando o carro de controle remoto
        paraFrente.executarComando();
        esquerda.executarComando();
        paraFrente.executarComando();
        direita.executarComando();
        paraTras.executarComando();
    }
}
