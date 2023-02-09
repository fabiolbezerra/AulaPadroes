/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.abstractfactory;

import padrao.criacao.abstractfactory.fabrica.Cielo;
import padrao.criacao.abstractfactory.fabrica.FabricaAbstrata;
import padrao.criacao.abstractfactory.fabrica.Rede;

/**
 *
 * @author Fabio
 */
public class Principal {

    public static void main(String[] args) {
        //Loja com máquina da REDE
        FabricaAbstrata maquina1 = new Rede();
        //Cliente pagando com visa
        maquina1.criarVisa().executar(30);
        //Cliente pagando com master
        maquina1.criarMasterCard().executar(150);
        //Cliente pagando com elo
        maquina1.criarElo().executar(50);

        //Loja com máquina da CIELO
        FabricaAbstrata maquina2 = new Cielo();
        //Cliente pagando com visa
        maquina2.criarVisa().executar(35);
        //Cliente pagando com master
        maquina2.criarMasterCard().executar(155);
        //Cliente pagando com elo
        maquina2.criarElo().executar(55);

    }
}
