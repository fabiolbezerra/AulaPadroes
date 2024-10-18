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
        System.out.printf("Registrando no caixa R$ %.2f\n", pedido.getTotal());
    }
}
