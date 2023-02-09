package padrao.estrutural.fachada.subsistema;

import java.util.HashMap;
import java.util.Map;

public class Garcom {

    private String nome;
    private Map<Pedido, Integer> pedidos;

    public Garcom(String nome) {
        this.nome = nome;
        pedidos = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void receberPedido(String pedido, int mesa) {
        System.out.println("Olá, estou anotando: " + pedido);
        Pedido p = new Pedido((int) (Math.random() * 1000));
        Item i1 = new Item("Filé", 65);
        p.adicionar(i1);
        Item i2 = new Item("Vinho", 105);
        p.adicionar(i2);
        pedidos.put(p, mesa);
        System.out.println("Seu pedido em breve ficará pronto.");
        Cozinheiro cozinheiro = new Cozinheiro("Ciclano");
        cozinheiro.preparar(this, p);
    }

    protected void entregar(Pedido pedido) {
        Integer mesa = pedidos.get(pedido);
        System.out.println("Entregando na mesa " + mesa + " o pedido " + pedido.getNumero());
    }

    public void cobrarPedido(int mesa) {
        System.out.println("Olá. A conta da mesa " + mesa + ". Seus pedidos foram: ");
        double total = 0;
        Gerente gerente = new Gerente("Junior");
        for (Pedido pedido : pedidos.keySet()) {
            if (pedidos.get(pedido) == mesa) {
                pedido.imprimirItens();
                total += pedido.getTotal();
                gerente.receber(pedido);
            }
        }
        System.out.println("TOTAL: " + total);
        Copeiro copeiro = new Copeiro("Beltrano");
        copeiro.lavar(false);
    }

}
