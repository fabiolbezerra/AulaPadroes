/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.prototype;

import java.util.ArrayList;
import java.util.List;
import padrao.criacao.prototype.objeto.Anuncio;
import padrao.criacao.prototype.objeto.Campanha;

/**
 *
 * @author Fabio
 */
public class Principal {
    public static void main(String[] args) throws CloneNotSupportedException {
        Anuncio a1 = new Anuncio("Caneta R$ 5,00", "Vendo caneta especial");       
        Anuncio a2 = new Anuncio();
        a2.setTitulo("Lápis barato");
        a2.setTexto("Vendo lápis B2 por R$ 0,50");
        
        List<Anuncio> anuncios = new ArrayList<>();
        anuncios.add(a1);
        anuncios.add(a2);
        
        Campanha campanha = new Campanha("Volta às aulas!", anuncios);       
        System.out.println(campanha);
        
        System.out.println("--------\n");
        
        Campanha campanhaClonada = (Campanha) campanha.clone();
        System.out.println(campanhaClonada);
        
        System.out.println("--------\n");
        
        System.out.println(campanha == campanhaClonada);
        System.out.println(campanha.equals(campanhaClonada));
        System.out.println(campanha.getNome() == campanhaClonada.getNome());
        System.out.println(campanha.getAnuncios() == campanhaClonada.getAnuncios());
        for (int i = 0; i < campanha.getAnuncios().size(); i++) {
            System.out.println("\t" + (campanha.getAnuncios().get(i) == campanhaClonada.getAnuncios().get(i)));
        }
    }
}
