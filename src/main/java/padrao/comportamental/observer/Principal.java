/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.comportamental.observer;

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
        Acao valeon = new AcaoON("VALE3", 30);
        Acao valepn = new AcaoON("VALE5", 50);
        Acao petrobrason = new AcaoPN("PETR3", 3);
        Acao petrobraspn = new AcaoPN("PETR4", 5);
        
        //Corretoras
        CorretoraBB corretoraBB = new CorretoraBB();
        CorretoraXPTO corretoraXPTO = new CorretoraXPTO();
        
        //Interesses das corretoras
        valeon.registraInteressado(corretoraBB);
        valeon.registraInteressado(corretoraXPTO);
        valepn.registraInteressado(corretoraBB); //apenas a corretora BB está interessada na valepn
        petrobrason.registraInteressado(corretoraXPTO); //apenas a corretora XPTO está interessada na petrobrason
        petrobraspn.registraInteressado(corretoraBB);
        petrobraspn.registraInteressado(corretoraXPTO);
        
        //Alterando o valor das ações
        valeon.setValor(31.1);
        valepn.setValor(49);
        petrobrason.setValor(3.5);
        petrobraspn.setValor(5.9);
    }
}
