/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.estrutural.adapter;

import padrao.estrutural.adapter.atual.ControleDePonto;
import padrao.estrutural.adapter.atual.Funcionario;
import padrao.estrutural.adapter.novo.BibliotecaNova;

/**
 *
 * @author Fabio
 */
public class PrincipalComAdapter {

    public static void main(String[] args) {
        ControleDePonto controleDePonto = new ControleDePontoAdapter(new BibliotecaNova());
        Funcionario funcionario = new Funcionario();
        funcionario.setId(1);
        funcionario.setNome("Fábio");
        controleDePonto.registraEntrada(funcionario);
        System.out.println("\n-.-.-.-\n");
        controleDePonto.registraSaida(funcionario);
    }
}
