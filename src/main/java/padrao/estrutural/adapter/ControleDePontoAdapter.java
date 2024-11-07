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
public class ControleDePontoAdapter implements ControleDePonto {

    private BibliotecaNova controle;

    public ControleDePontoAdapter(BibliotecaNova controle) {
        this.controle = controle;
    }

    @Override
    public void registraSaida(Funcionario funcionario) {
        controle.registra(funcionario.getId(), false);
    }

    @Override
    public void registraEntrada(Funcionario funcionario) {
        controle.registra(funcionario.getId(), true);
    }

}
