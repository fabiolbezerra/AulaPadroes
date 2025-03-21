package padrao.comportamental.strategy.ecommerce.ordenacao;

import padrao.comportamental.strategy.ecommerce.Produto;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarPorMelhorAvaliacao implements OrdenarProdutos {

    private Comparator comparador = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            Double avaliacao1 = ((Produto) o1).getAvaliacao();
            Double avaliacao2 = ((Produto) o2).getAvaliacao();
            return avaliacao2.compareTo(avaliacao1);
        }
    };

    @Override
    public void ordenar(List<Produto> produtos) {
        Collections.sort(produtos, comparador);
    }
}
