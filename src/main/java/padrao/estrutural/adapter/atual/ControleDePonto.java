/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.estrutural.adapter.atual;

/**
 *
 * @author Fabio
 */
public class ControleDePonto {

    public void registraEntrada(Funcionario funcionario) {
        System.out.println("Registrando Entrada do Funcionário " + funcionario.getNome());
    }

    public void registraSaida(Funcionario funcionario) {
        System.out.println("Registrando Saída do Funcionário " + funcionario.getNome());
    }
}
