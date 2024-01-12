/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao.criacao.prototype.objeto;

/**
 *
 * @author flbez
 */
public class AnuncioDoPrototipo implements Prototipo {

    private String titulo;
    private String texto;

    public AnuncioDoPrototipo() {
    }

    public AnuncioDoPrototipo(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
    }

    public AnuncioDoPrototipo(AnuncioDoPrototipo anuncio) {
        this.titulo = anuncio.titulo;
        this.texto = anuncio.texto;
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
    public Prototipo clonar() {
        return new AnuncioDoPrototipo(this);
    }

    @Override
    public String toString() {
        return titulo + ": " + texto;
    }
    
    

}
