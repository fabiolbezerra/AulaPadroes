package padrao.criacao.factorymethod.main;

import padrao.criacao.factorymethod.Emissor;
import padrao.criacao.factorymethod.EmissorCreator;

/**
 *
 * @author Fabio
 */
public class Principal {

    public static void main(String[] args) {
        EmissorCreator fabricaDeEmissor = new EmissorCreator();
        
        Emissor e1 = fabricaDeEmissor.criar(EmissorCreator.SMS);
        e1.envia("Você acabou de realizar compra de R$100,00");

        Emissor e2 = fabricaDeEmissor.criar(EmissorCreator.EMAIL);
        e2.envia("Você acabou de realizar compra de R$100,00");

        Emissor e3 = fabricaDeEmissor.criar(EmissorCreator.JMS);
        e3.envia("Você acabou de realizar compra de R$100,00");
    }
}
