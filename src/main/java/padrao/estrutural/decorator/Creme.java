package padrao.estrutural.decorator;

public class Creme extends BebidaDecorada {

    public Creme(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double getPreco() {
        return getBebida().getPreco() + 0.8;
    }

    @Override
    public String getDescricao() {
        return getBebida().getDescricao() + ", com creme";
    }

}
