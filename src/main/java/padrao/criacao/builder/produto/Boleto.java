/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.builder.produto;

import java.util.List;

/**
 *
 * @author Fabio
 */
public abstract class Boleto {

    private List<String> conteudo;

    public Boleto() {
    }

    public List<String> getConteudo() {
        return conteudo;
    }

    public void setConteudo(List<String> conteudo) {
        this.conteudo = conteudo;
    }

    public void imprimir() {
        for (String c : conteudo) {
            System.out.println(c);
        }
    }
}
