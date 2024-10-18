package padrao.estrutural.fachada.subsistema;

public class Item {

    private String nome;
    private double preco;
    private String observacao;

    public Item(String nome, double preco, String observacao) {
        this.nome = nome;
        this.preco = preco;
        this.observacao = observacao;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getObservacao() {
        return observacao;
    }

}
