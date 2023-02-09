/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Fabio
 */
public class ConfiguracaoSemSingleton {

    private Map<String, String> propriedades = new HashMap<String, String>();

    public ConfiguracaoSemSingleton() {

    }

    public String getPropriedade(String nomeDaPropriedade) {
        return this.propriedades.get(nomeDaPropriedade);
    }
}
