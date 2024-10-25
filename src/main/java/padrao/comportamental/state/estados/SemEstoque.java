package padrao.comportamental.state.estados;

public class SemEstoque implements Estado{
    @Override
    public void selecionarItem() {
        System.out.println("Erro ao selecionar: Nenhum item disponível");
    }

    @Override
    public void pagarItem() {
        System.out.println("Erro ao pagar: Nenhum item disponível");
    }

    @Override
    public void retirarItem() {
        System.out.println("Nenhum item disponível");
    }
}
