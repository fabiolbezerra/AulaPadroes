/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.prototype;

import java.util.ArrayList;
import java.util.List;
import padrao.criacao.prototype.objeto.AnuncioDoPrototipo;
import padrao.criacao.prototype.objeto.CampanhaDoPrototipo;
import padrao.criacao.prototype.objeto.Prototipo;

/**
 *
 * @author Fabio
 */
public class PrincipalDoPrototipo {

    public static void main(String[] args) throws CloneNotSupportedException {
        AnuncioDoPrototipo a1 = new AnuncioDoPrototipo("Caneta R$ 5,00", "Vendo caneta especial");

        AnuncioDoPrototipo a2 = new AnuncioDoPrototipo();
        a2.setTitulo("Lápis barato");
        a2.setTexto("Vendo lápis B2 por R$ 0,50");

        List<AnuncioDoPrototipo> anuncios = new ArrayList<>();
        anuncios.add(a1);
        anuncios.add(a2);

        Prototipo campanha = new CampanhaDoPrototipo("Volta às aulas!", anuncios);
        System.out.println(campanha);

        System.out.println("--------\n");

        Prototipo campanhaClonada = campanha.clonar();
        System.out.println(campanhaClonada);

        System.out.println("--------\n");

        System.out.println(campanha == campanhaClonada);
        System.out.println(campanha.equals(campanhaClonada));
        System.out.println(((CampanhaDoPrototipo) campanha).getNome() == ((CampanhaDoPrototipo) campanhaClonada).getNome());
        System.out.println(((CampanhaDoPrototipo) campanha).getAnuncios() == ((CampanhaDoPrototipo) campanhaClonada).getAnuncios());
        for (int i = 0; i < ((CampanhaDoPrototipo) campanha).getAnuncios().size(); i++) {
            System.out.println("\t" + (((CampanhaDoPrototipo) campanha).getAnuncios().get(i) == ((CampanhaDoPrototipo) campanhaClonada).getAnuncios().get(i)));
        }
    }
}
