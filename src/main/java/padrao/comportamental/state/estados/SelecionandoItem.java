package padrao.comportamental.state.estados;

import padrao.comportamental.state.MaquinaDeBebidas;

public class SelecionandoItem implements Estado {

    private MaquinaDeBebidas contexto;

    public SelecionandoItem(MaquinaDeBebidas contexto) {
        this.contexto = contexto;
    }

    @Override
    public void selecionarItem() {
        System.out.println("Selecionando um item da máquina");
        contexto.mudar(new RecebendoPagamento(contexto));
    }

    @Override
    public void pagarItem() {
        System.out.println("Você precisa selecionar um item antes de pagar.");
    }

    @Override
    public void retirarItem() {
        System.out.println("Nenhum item selecionado e pago.");
    }
}
