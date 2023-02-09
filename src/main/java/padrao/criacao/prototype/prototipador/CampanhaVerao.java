/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.prototype.prototipador;

import java.util.ArrayList;
import java.util.List;
import padrao.criacao.prototype.objeto.Anuncio;
import padrao.criacao.prototype.objeto.Campanha;

/**
 *
 * @author Fabio
 */
public class CampanhaVerao implements Prototipo<Campanha> {

    private final Campanha campanha;

    public CampanhaVerao() throws CloneNotSupportedException {
        campanha = new Campanha();
        campanha.setNome("Campanha de Verão");
        List<Anuncio> list = new ArrayList<Anuncio>();
        Anuncio a1 = new Anuncio();
        a1.setTitulo("Curso de Padrões de Projeto nas Férias");
        a1.setTexto("Oferta Exclusiva - 20% de Desconto");
        list.add(a1);

        Anuncio a2 = (Anuncio) a1.clone();
        a2.setTitulo("Curso de Java para Web nas Férias");
        list.add(a2);

        campanha.setAnuncios(list);
    }

    @Override
    public Campanha clonar() {
        try {
            System.out.println("Objeto original sendo clonado ...");
            System.out.println(campanha);
            System.out.println("...");
            return (Campanha) campanha.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Erro " + ex);
            return null;
        }
    }

}
