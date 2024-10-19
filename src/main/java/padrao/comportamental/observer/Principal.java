/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.comportamental.observer;

import padrao.comportamental.observer.observador.Corretora;
import padrao.comportamental.observer.observador.CorretoraBB;
import padrao.comportamental.observer.observador.CorretoraXPTO;
import padrao.comportamental.observer.sujeito.Acao;
import padrao.comportamental.observer.sujeito.AcaoON;
import padrao.comportamental.observer.sujeito.AcaoPN;

/**
 *
 * @author Fabio
 */
public class Principal {

    public static void main(String[] args) {
        //Ações
        Acao valeON = new AcaoON("VALE3", 30);
        Acao valePN = new AcaoON("VALE5", 50);
        Acao petrobrasON = new AcaoPN("PETR3", 3);
        Acao petrobrasPN = new AcaoPN("PETR4", 5);
        
        //Corretoras
        Corretora corretoraBB = new CorretoraBB();
        Corretora corretoraXPTO = new CorretoraXPTO();
        
        //Ações que a corretoraBB tem interesse
        valeON.registraInteressado(corretoraBB);
        petrobrasPN.registraInteressado(corretoraBB);
        valePN.registraInteressado(corretoraBB); //apenas a corretora BB está interessada na valePN

        //Ações que a corretoraXPTO tem interesse
        valeON.registraInteressado(corretoraXPTO);
        petrobrasON.registraInteressado(corretoraXPTO); //apenas a corretora XPTO está interessada na petrobrasON
        petrobrasPN.registraInteressado(corretoraXPTO);
        
        //Alterando o valor das ações (durante operação no mercado)
        valeON.setValor(31.1);
        valePN.setValor(49);
        petrobrasON.setValor(3.5);
        petrobrasPN.setValor(5.9);
    }
}
