package padrao.estrutural.decorator.bebida.decorada;

import padrao.estrutural.decorator.bebida.Bebida;

public class Caramelo extends BebidaDecorada {

    public Caramelo(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double getPreco() {
        return getBebida().getPreco() + 1.2;
    }

    @Override
    public String getDescricao() {
        return getBebida().getDescricao() + ", com caramelo";
    }

}
