package padrao.comportamental.state.estados;

import padrao.comportamental.state.MaquinaDeBebidas;

public class RecebendoPagamento implements Estado{
    private MaquinaDeBebidas contexto;

    public RecebendoPagamento(MaquinaDeBebidas contexto) {
        this.contexto = contexto;
    }
    @Override
    public void selecionarItem() {
        System.out.println("Trocando o item para pagamento");
    }

    @Override
    public void pagarItem() {
        System.out.println("Recebendo o pagamento do item selecionado");
        contexto.mudar(new RetirandoItem(contexto));
    }

    @Override
    public void retirarItem() {
        System.out.println("Pague o item selecionado antes de retirá-lo do dispensário");
    }
}
