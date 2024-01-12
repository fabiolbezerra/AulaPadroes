/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.prototype.objeto;

/**
 *
 * @author Fabio
 */
public class Anuncio implements Cloneable {

    private String titulo;
    private String texto;

    public Anuncio() {
    }

    public Anuncio(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Anuncio object = (Anuncio) super.clone();
        return object;
    }

    @Override
    public String toString() {
        return titulo + ": " + texto;
    }

}
