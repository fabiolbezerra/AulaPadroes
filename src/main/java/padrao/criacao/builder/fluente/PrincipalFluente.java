/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.builder.fluente;

import java.util.Date;

/**
 *
 * @author Fabio
 */
public class PrincipalFluente {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Fábio");
        p1.setDataNascimento(new Date(78, 8, 5));
        p1.setCargo("Docente");
        System.out.println(p1);

        System.out.println("\n\n\n");
        
        Pessoa p2 = new Pessoa()
                .chamada("Fábio")
                .nascidaEm(new Date(78, 8, 5))
                .comCargo("Docente");
        System.out.println(p2);
    }
}
