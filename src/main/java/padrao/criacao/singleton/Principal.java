/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.singleton;

/**
 *
 * @author Fabio
 */
public class Principal {

    public static void main(String[] args) {
        ConfiguracaoSemSingleton c1 = new ConfiguracaoSemSingleton();
        ConfiguracaoSemSingleton c2 = new ConfiguracaoSemSingleton();
        System.out.println("Objetos iguais? " + c1.equals(c2));
//        Configuracao configuracao = new Configuracao();
        Configuracao cfg1 = Configuracao.getInstancia();
        Configuracao cfg2 = Configuracao.getInstancia();
        System.out.println("Objetos iguais? " + cfg1.equals(cfg2));
    }
}
