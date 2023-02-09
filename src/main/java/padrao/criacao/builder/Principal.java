/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.builder;

import java.util.Date;
import padrao.criacao.builder.construtor.BoletoBuilder;
import padrao.criacao.builder.construtor.BoletoBuilderBB;
import padrao.criacao.builder.construtor.BoletoBuilderItau;
import padrao.criacao.builder.produto.Boleto;

/**
 *
 * @author Fabio
 */
public class Principal {

    public static void main(String[] args) {
        BoletoBuilder builder1 = new BoletoBuilderBB();
        builder1
                .adicionarCedente("Fábio Bezerra", "BPMLAB-ICIBE-UFRA")
                .adicionarLinhaDigitavel("123.456.789.000")
                .adicionarSacado("Fulano de Tal", "Rua Tal, 1", "66.000-060")
                .adicionarValor(155.00)
                .adicionarVencimento(new Date());
        Boleto boletoBB = builder1.construir();
        boletoBB.imprimir();

        System.out.println("\n\n\n");
        
        BoletoBuilder builder2 = new BoletoBuilderItau();
        builder2
                .adicionarCedente("Fábio Bezerra", "BPMLAB-ICIBE-UFRA")
                .adicionarLinhaDigitavel("000.111.222.333.444")
                .adicionarSacado("Beltrano da Silva", "Rua Tal, 1", "66.000-060")
                .adicionarValor(55.10)
                .adicionarVencimento(new Date());
        Boleto boletoItau = builder2.construir();
        boletoItau.imprimir();
    }

}
