/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.comportamental.observer.sujeito;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import padrao.comportamental.observer.observador.Corretora;

/**
 *
 * @author Fabio
 */
public abstract class Acao {

    private String codigo;
    private double valor;

    private Set<Corretora> corretoras = new HashSet<>();

    public Acao(String codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        for (Corretora c : corretoras) {
            c.notificar(this);
        }
    }

    public void registraInteressado(Corretora corretora) {
        corretoras.add(corretora);
    }

    public void desregistraInteressado(Corretora corretora) {
        corretoras.remove(corretora);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Acao other = (Acao) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

}
