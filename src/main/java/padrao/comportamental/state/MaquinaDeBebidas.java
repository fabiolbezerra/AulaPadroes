package padrao.comportamental.state;

import padrao.comportamental.state.estados.Estado;
import padrao.comportamental.state.estados.SelecionandoItem;
import padrao.comportamental.state.estados.SemEstoque;

public class MaquinaDeBebidas {
    private Estado estadoCorrente = new SemEstoque();

    public void mudar(Estado estado) {
        estadoCorrente = estado;
    }

    public void selecionarItem() {
        estadoCorrente.selecionarItem();
    }

    public void pagarItem() {
        estadoCorrente.pagarItem();
    }

    public void retirarItem() {
        estadoCorrente.retirarItem();
    }

    public void recarregarEstoque() {
        System.out.println("Estoque da máquina reestabelecido");
        mudar(new SelecionandoItem(this));
    }

}
