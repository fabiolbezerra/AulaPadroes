/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.estrutural.adapter;

import padrao.estrutural.adapter.atual.BibliotecaAntiga;
import padrao.estrutural.adapter.atual.ControleDePonto;
import padrao.estrutural.adapter.atual.Funcionario;
import padrao.estrutural.adapter.novo.BibliotecaNova;

/**
 *
 * @author Fabio
 */
public class SistemaDeRH {

    public static void main(String[] args) {
        //Dados do funcionário
        Funcionario funcionario = new Funcionario();
        funcionario.setId(1);
        funcionario.setNome("Fábio");

        //Interface do controle de ponto
        ControleDePonto controleDePonto = null;

        //Integração com a biblioteca antiga
        //controleDePonto = new BibliotecaAntiga();

        //Integração com a biblioteca nova (adaptada para a mesma interface)
        controleDePonto = new ControleDePontoAdapter(new BibliotecaNova());

        //Usando o controle de ponto
        //Independe da biblioteca de controle de ponto adotada
        controleDePonto.registraEntrada(funcionario);
        System.out.println("\n-.-.-.-\n");
        controleDePonto.registraSaida(funcionario);
    }
}
