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
public class EmissorCreator {

    public static final int SMS = 0;
    public static final int EMAIL = 1;
    public static final int JMS = 2;

    public Emissor criar(int tipoDeEmissor) {
        if (tipoDeEmissor == EmissorCreator.SMS) {
            return new EmissorSMS();
        } else if (tipoDeEmissor == EmissorCreator.EMAIL) {
            return new EmissorEmail();
        } else if (tipoDeEmissor == EmissorCreator.JMS) {
            return new EmissorJMS();
        } else {
            throw new IllegalArgumentException(" Tipo de emissor não suportado ");
        }
    }
}
