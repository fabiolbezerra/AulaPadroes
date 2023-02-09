package padrao.estrutural.decorator;

public abstract class Bebida {

    private String descricao;
    private double preco;

    public Bebida(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

}
