package padrao.estrutural.decorator;

public abstract class BebidaDecorada extends Bebida {

    private Bebida bebida;

    public BebidaDecorada(Bebida bebida) {
        super(bebida.getDescricao(), bebida.getPreco());
        this.bebida = bebida;
    }

    public Bebida getBebida() {
        return bebida;
    }

}
