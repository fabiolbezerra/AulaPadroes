package padrao.estrutural.fachada;

import padrao.estrutural.fachada.subsistema.Garcom;

public class Cliente {

    public static void main(String[] args) {
        final int MESA = 10;
        Garcom fulano = new Garcom("Fulano");
        fulano.receberPedido("Quero um Filé da casa e uma garafa de vinho", MESA);
        System.out.println("\n . . . depois de consumir o pedido . . . \n");
        fulano.cobrarPedido(MESA);        
    }
}
