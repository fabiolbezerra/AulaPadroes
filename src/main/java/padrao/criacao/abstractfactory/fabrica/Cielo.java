/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.abstractfactory.fabrica;

import padrao.criacao.abstractfactory.produto.Elo;
import padrao.criacao.abstractfactory.produto.MasterCard;
import padrao.criacao.abstractfactory.produto.Visa;
import padrao.criacao.abstractfactory.produto.elo.EloViaCielo;
import padrao.criacao.abstractfactory.produto.master.MasterViaCielo;
import padrao.criacao.abstractfactory.produto.visa.VisaViaCielo;

/**
 *
 * @author Fabio
 */
public class Cielo extends FabricaAbstrata {

    @Override
    public Visa criarVisa() {
        return new VisaViaCielo();
    }

    @Override
    public MasterCard criarMasterCard() {
        return new MasterViaCielo();
    }

    @Override
    public Elo criarElo() {
        return new EloViaCielo();
    }

}
