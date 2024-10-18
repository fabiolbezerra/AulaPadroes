package padrao.comportamental.strategy.ecommerce.ordenacao;

import padrao.comportamental.strategy.ecommerce.Produto;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarPorMenorPreco implements OrdenarProdutos{

    private Comparator comparador = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            Double preco1 = ((Produto) o1).getPreco();
            Double preco2 = ((Produto) o2).getPreco();
            return preco1.compareTo(preco2);
        }
    };

    @Override
    public void ordenar(List<Produto> produtos) {
        Collections.sort(produtos, comparador);
    }
}
