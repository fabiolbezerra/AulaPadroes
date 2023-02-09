/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.abstractfactory.produto.master;

import padrao.criacao.abstractfactory.produto.MasterCard;

/**
 *
 * @author Fabio
 */
public class MasterViaRede implements MasterCard {

    @Override
    public boolean executar(double valor) {
        System.out.println("Passando transação da bandeira MASTERCARD na rede REDE - " + valor);
        return true;
    }

}
