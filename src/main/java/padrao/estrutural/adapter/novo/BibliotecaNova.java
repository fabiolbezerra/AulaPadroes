/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.estrutural.adapter.novo;

/**
 * @author Fabio
 */
public class BibliotecaNova {

    public void registra(int idDoFuncionario, boolean entrada) {
        if (entrada) {
            System.out.println("BibliotecaNova: Registrando entrada do funcionário " + idDoFuncionario);
        } else {
            System.out.println("BibliotecaNova: Registrando saída do funcionário " + idDoFuncionario);
        }
    }
}
