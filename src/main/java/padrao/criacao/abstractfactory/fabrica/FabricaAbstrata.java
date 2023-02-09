/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.abstractfactory.fabrica;

import padrao.criacao.abstractfactory.produto.Elo;
import padrao.criacao.abstractfactory.produto.MasterCard;
import padrao.criacao.abstractfactory.produto.Visa;

/**
 *
 * @author Fabio
 */
public abstract class FabricaAbstrata {
    public abstract Visa criarVisa();
    public abstract MasterCard criarMasterCard();
    public abstract Elo criarElo();
    
}
