package padrao.criacao.prototype.objeto;

import java.util.ArrayList;
import java.util.List;

public class CampanhaDoPrototipo implements Prototipo {

    private String nome;
    private List<AnuncioDoPrototipo> anuncios;

    public CampanhaDoPrototipo() {
    }

    public CampanhaDoPrototipo(String nome, List<AnuncioDoPrototipo> anuncios) {
        this.nome = nome;
        this.anuncios = anuncios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<AnuncioDoPrototipo> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(List<AnuncioDoPrototipo> anuncios) {
        this.anuncios = anuncios;
    }

    @Override
    public Prototipo clonar() {
        CampanhaDoPrototipo c = new CampanhaDoPrototipo();
        c.nome = this.nome;
        c.anuncios = new ArrayList<>();
        for (int i = 0; i < this.anuncios.size(); i++) {
            AnuncioDoPrototipo a = (AnuncioDoPrototipo) this.anuncios.get(i).clonar();
            c.anuncios.add(a);
        }
        return c;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Anúncios da Campanha \"").append(nome).append("\":\n");
        for (AnuncioDoPrototipo a : anuncios) {
            sb.append("** ").append(a.toString()).append('\n');
        }
        return sb.toString();
    }

}
