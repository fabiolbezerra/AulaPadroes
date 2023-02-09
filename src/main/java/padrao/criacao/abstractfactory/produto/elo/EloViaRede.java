/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.abstractfactory.produto.elo;

import padrao.criacao.abstractfactory.produto.Elo;

/**
 *
 * @author Fabio
 */
public class EloViaRede implements Elo {

    @Override
    public boolean executar(double valor) {
        System.out.println("Passando transação da bandeira ELO na rede REDE - " + valor);
        return true;
    }

}
