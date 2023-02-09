package padrao.estrutural.fachada.subsistema;

public class Gerente {

    private String nome;

    public Gerente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void receber(Pedido pedido) {
        System.out.println("Registrando no caixa " + pedido.getTotal());
    }
}
