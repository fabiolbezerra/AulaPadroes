/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.prototype;

import padrao.criacao.prototype.objeto.Anuncio;
import padrao.criacao.prototype.objeto.Campanha;
import padrao.criacao.prototype.prototipador.CampanhaAnual;
import padrao.criacao.prototype.prototipador.CampanhaVerao;
import padrao.criacao.prototype.prototipador.Prototipo;

/**
 *
 * @author Fabio
 */
public class Principal {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototipo<Campanha> prototipadorAnual = new CampanhaAnual();
        Campanha campanhaAnual = prototipadorAnual.clonar();
        for (Anuncio a : campanhaAnual.getAnuncios()) {
            a.setTitulo(a.getTitulo() + " (10%)");
        }
        System.out.println(campanhaAnual);

        Prototipo<Campanha> prototipadorVerao = new CampanhaVerao();
        Campanha campanhaDeInverno = prototipadorVerao.clonar();
        campanhaDeInverno.setNome("Campanha de Inverno igual a do Verão");
        System.out.println(campanhaDeInverno);
    }
}
