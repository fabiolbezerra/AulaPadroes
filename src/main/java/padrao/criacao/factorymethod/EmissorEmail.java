/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.factorymethod;

/**
 *
 * @author Fabio
 */
public class EmissorEmail implements Emissor {

    @Override
    public void envia(String mensagem) {
        System.out.print("Enviando por Email a mensagem: ");
        System.out.println(mensagem);
    }

}
