/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.builder.construtor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import padrao.criacao.builder.produto.Boleto;
import padrao.criacao.builder.produto.BoletoBB;

/**
 *
 * @author Fabio
 */
public class BoletoBuilderBB implements BoletoBuilder {

    private Boleto boleto = new BoletoBB();
    private List<String> sacado = new ArrayList<>();
    private List<String> cedente = new ArrayList<>();
    private String linhaDigitavel;
    private double valor;
    private Date vencimento;

    @Override
    public BoletoBuilder adicionarSacado(String... informacoesSacado) {
        if (informacoesSacado != null) {
            for (int i = 0; i < informacoesSacado.length; i++) {
                sacado.add(informacoesSacado[i]);
            }
        }
        return this;
    }

    @Override
    public BoletoBuilder adicionarCedente(String... informacoesCedente) {
        if (informacoesCedente != null) {
            for (int i = 0; i < informacoesCedente.length; i++) {
                sacado.add(informacoesCedente[i]);
            }
        }
        return this;
    }

    @Override
    public BoletoBuilder adicionarLinhaDigitavel(String informacoesLinhaDigitavel) {
        linhaDigitavel = informacoesLinhaDigitavel;
        return this;
    }

    @Override
    public BoletoBuilder adicionarValor(double valor) {
        this.valor = valor;
        return this;
    }

    @Override
    public BoletoBuilder adicionarVencimento(Date vencimento) {
        this.vencimento = vencimento;
        return this;
    }

    @Override
    public Boleto construir() {
        //A ordem muda de acordo com o banco
        if (this.boleto.getConteudo() == null) {
            this.boleto.setConteudo(new ArrayList<>());
        } else {
            this.boleto.getConteudo().clear();
        }
        
        this.boleto.getConteudo().add("Boleto do Banco do Brasil");
        this.boleto.getConteudo().add("Valor : " + this.valor);
        this.boleto.getConteudo().add("Vencimento : " + this.vencimento);
        this.boleto.getConteudo().add("Sacado:");
        this.boleto.getConteudo().addAll(this.sacado);
        this.boleto.getConteudo().add("Cedente:");
        this.boleto.getConteudo().addAll(this.cedente);
        this.boleto.getConteudo().add("### " + this.linhaDigitavel);
        return this.boleto;
    }

}
