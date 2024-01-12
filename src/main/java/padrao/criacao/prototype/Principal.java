/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.prototype.objeto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabio
 */
public class Principal {
    public static void main(String[] args) throws CloneNotSupportedException {
        Anuncio a1 = new Anuncio();
        a1.setTitulo("Caneta 10");
        a1.setTexto("Vendo caneta");
        Anuncio a2 = new Anuncio();
        a2.setTitulo("Lápis 10");
        a2.setTexto("Vendo lápis");
        
        List<Anuncio> anuncios = new ArrayList<>();
        anuncios.add(a1);
        anuncios.add(a2);
        
        Campanha campanha = new Campanha();
        campanha.setNome("Teste");
        campanha.setAnuncios(anuncios);
        
        System.out.println(campanha);
        
        System.out.println("--------");
        
        Campanha campanhaClonada = (Campanha) campanha.clone();
        System.out.println(campanhaClonada);
        
    }
}
