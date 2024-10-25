package padrao.comportamental.state.estados;

import padrao.comportamental.state.MaquinaDeBebidas;

public class RetirandoItem implements Estado{

    private MaquinaDeBebidas contexto;

    public RetirandoItem(MaquinaDeBebidas contexto) {
        this.contexto = contexto;
    }

    @Override
    public void selecionarItem() {
        System.out.println("Antes de selecionar, retire o item pago do dispensário.");
    }

    @Override
    public void pagarItem() {
        System.out.println("Retire último item pago do dispensário.");
    }

    @Override
    public void retirarItem() {
        System.out.println("Retirando item pago do dispensário");
        contexto.mudar(new SelecionandoItem(contexto));
    }
}
