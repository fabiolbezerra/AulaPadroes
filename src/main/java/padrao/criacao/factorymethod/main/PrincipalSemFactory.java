/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.factorymethod.main;

import padrao.criacao.factorymethod.Emissor;
import padrao.criacao.factorymethod.EmissorEmail;
import padrao.criacao.factorymethod.EmissorJMS;
import padrao.criacao.factorymethod.EmissorSMS;

/**
 *
 * @author Fabio
 */
public class PrincipalSemFactory {

    public static void main(String[] args) {
        Emissor e1 = new EmissorSMS();
        e1.envia("Você acabou de realizar compra de R$100,00");

        Emissor e2 = new EmissorEmail();
        e2.envia("Você acabou de realizar compra de R$100,00");

        Emissor e3 = new EmissorJMS();
        e3.envia("Você acabou de realizar compra de R$100,00");
    }
}
