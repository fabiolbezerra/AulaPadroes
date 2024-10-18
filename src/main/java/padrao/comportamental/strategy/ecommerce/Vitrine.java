package padrao.comportamental.strategy.ecommerce;

import padrao.comportamental.strategy.ecommerce.ordenacao.OrdenarProdutos;

import java.util.List;

public class Vitrine {

    private List<Produto> produtos;
    private OrdenarProdutos ordenacao;

    public Vitrine(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setOrdenacao(OrdenarProdutos ordenacao) {
        this.ordenacao = ordenacao;
    }

    public void ordenarItens() {
        ordenacao.ordenar(this.produtos);
    }

    public void exibir() {
        System.out.println("----- " + this.ordenacao.getClass().getSimpleName() + " ----");
        for (Produto p : this.produtos) {
            System.out.println(p);
        }
        System.out.println("-----------------------------------");
    }
}
