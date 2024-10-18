package padrao.comportamental.strategy;

import padrao.comportamental.strategy.ecommerce.Produto;
import padrao.comportamental.strategy.ecommerce.Vitrine;
import padrao.comportamental.strategy.ecommerce.ordenacao.OrdenarPorMaiorPreco;
import padrao.comportamental.strategy.ecommerce.ordenacao.OrdenarPorMelhorAvaliacao;
import padrao.comportamental.strategy.ecommerce.ordenacao.OrdenarPorMenorPreco;

import java.util.ArrayList;

public class Cliente {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto p1 = new Produto("Samsung S22", 1100.0, 4.6);
        produtos.add(p1);
        Produto p2 = new Produto("Samsung S23", 1200.0, 4.1);
        produtos.add(p2);
        Produto p3 = new Produto("Samsung A10", 900.0, 4.2);
        produtos.add(p3);

        Vitrine vitrine = new Vitrine(produtos);
        vitrine.setOrdenacao(new OrdenarPorMenorPreco());
        vitrine.ordenarItens();
        vitrine.exibir();

        vitrine.setOrdenacao(new OrdenarPorMaiorPreco());
        vitrine.ordenarItens();
        vitrine.exibir();

        vitrine.setOrdenacao(new OrdenarPorMelhorAvaliacao());
        vitrine.ordenarItens();
        vitrine.exibir();
    }
}
