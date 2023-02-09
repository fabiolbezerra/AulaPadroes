package padrao.estrutural.fachada.subsistema;

public class Copeiro {

    private String nome;

    public Copeiro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    protected void lavar(boolean panelas) {
        if (panelas) {
            System.out.println("Lavando as panelas da preparação do pedido");
        } else {
            System.out.println("Lavando pratos e talheres do pedido");
        }
    }
}
