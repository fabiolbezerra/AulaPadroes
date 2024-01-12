/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.prototype.objeto;

import java.util.List;

/**
 *
 * @author Fabio
 */
public class Campanha implements Cloneable {

    private String nome;
    private List<Anuncio> anuncios;

    public Campanha() {
    }

    public Campanha(String nome, List<Anuncio> anuncios) {
        this.nome = nome;
        this.anuncios = anuncios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Anuncio> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(List<Anuncio> anuncios) {
        this.anuncios = anuncios;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Campanha object = (Campanha) super.clone();
        return object;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Anúncios da Campanha \"").append(nome).append("\":\n");
        for (Anuncio a : anuncios) {
            sb.append("** ").append(a.toString()).append('\n');
        }
        return sb.toString();
    }

}
