package padrao.estrutural.fachada.subsistema;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numero;
    private List<Item> itens;
    private double total;

    public Pedido(int numero) {
        this.numero = numero;
        this.itens = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    protected List<Item> getItens() {
        return itens;
    }

    public double getTotal() {
        return total;
    }

    public void imprimirItens() {
        for (Item item : itens) {
            System.out.println(item.getNome() + ": " + item.getPreco());
        }
    }

    public void adicionar(Item item) {
        itens.add(item);
        total += item.getPreco();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pedido other = (Pedido) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

}
