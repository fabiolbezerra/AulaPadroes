package padrao.estrutural.fachada.subsistema;

public class Cozinheiro {

    private String nome;

    public Cozinheiro(String nome) {
        this.nome = nome;
    }

    public void preparar(Garcom garcom, Pedido pedido) {
        System.out.println(garcom.getNome() + " já vou providenciar: ");
        for (Item item : pedido.getItens()) {
            System.out.println("Item: " + item.getNome());
        }
        System.out.println("Pronto!");

        Copeiro copeiro = new Copeiro("Beltrano");
        copeiro.lavar(true);

        garcom.entregar(pedido);
    }
}
