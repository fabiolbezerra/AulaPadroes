/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.comportamental.observer.observador;

import padrao.comportamental.observer.sujeito.Acao;

/**
 *
 * @author Fabio
 */
public class CorretoraBB implements Corretora {

    @Override
    public void notificar(Acao acao) {
        System.out.println("Corretora BB");
        System.out.printf("%s = R$ %.2f\n", acao.getCodigo(), acao.getValor());
    }

}
