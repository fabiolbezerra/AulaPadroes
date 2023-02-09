/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.abstractfactory.produto.visa;

import padrao.criacao.abstractfactory.produto.Visa;

/**
 *
 * @author Fabio
 */
public class VisaViaCielo implements Visa {

    @Override
    public boolean executar(double valor) {
        System.out.println("Passando transação da bandeira VISA na rede CIELO - " + valor);
        return true;
    }

}
