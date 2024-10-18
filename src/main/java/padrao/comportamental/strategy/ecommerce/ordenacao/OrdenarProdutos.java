package padrao.comportamental.strategy.ecommerce.ordenacao;

import padrao.comportamental.strategy.ecommerce.Produto;

import java.util.List;

public interface OrdenarProdutos {
    void ordenar(List<Produto> produtos);
}
