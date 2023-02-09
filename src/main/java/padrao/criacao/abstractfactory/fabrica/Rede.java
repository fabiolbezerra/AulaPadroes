/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.abstractfactory.fabrica;

import padrao.criacao.abstractfactory.produto.Elo;
import padrao.criacao.abstractfactory.produto.MasterCard;
import padrao.criacao.abstractfactory.produto.Visa;
import padrao.criacao.abstractfactory.produto.elo.EloViaRede;
import padrao.criacao.abstractfactory.produto.master.MasterViaRede;
import padrao.criacao.abstractfactory.produto.visa.VisaViaRede;

/**
 *
 * @author Fabio
 */
public class Rede extends FabricaAbstrata {

    @Override
    public Visa criarVisa() {
        return new VisaViaRede();
    }

    @Override
    public MasterCard criarMasterCard() {
        return new MasterViaRede();
    }

    @Override
    public Elo criarElo() {
        return new EloViaRede();
    }

}
