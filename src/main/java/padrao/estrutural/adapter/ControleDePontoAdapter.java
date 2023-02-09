/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.estrutural.adapter;

import padrao.estrutural.adapter.atual.ControleDePonto;
import padrao.estrutural.adapter.atual.Funcionario;
import padrao.estrutural.adapter.novo.ControleDePontoNovo;

/**
 *
 * @author Fabio
 */
public class ControleDePontoAdapter extends ControleDePonto {

    private ControleDePontoNovo controle;

    public ControleDePontoAdapter(ControleDePontoNovo controle) {
        this.controle = controle;
    }

    @Override
    public void registraSaida(Funcionario funcionario) {
        controle.registra(funcionario.getId(), true);
    }

    @Override
    public void registraEntrada(Funcionario funcionario) {
        controle.registra(funcionario.getId(), false);
    }

}
