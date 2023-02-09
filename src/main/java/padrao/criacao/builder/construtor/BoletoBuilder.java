/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.builder.construtor;

import java.util.Date;
import padrao.criacao.builder.produto.Boleto;

/**
 *
 * @author Fabio
 */
public interface BoletoBuilder {

    public BoletoBuilder adicionarSacado(String... informacoesSacado);

    public BoletoBuilder adicionarCedente(String... informacoesCedente);

    public BoletoBuilder adicionarLinhaDigitavel(String informacoesLinhaDigitavel);

    public BoletoBuilder adicionarValor(double valor);

    public BoletoBuilder adicionarVencimento(Date vecimento);
    
    public Boleto construir();
}
