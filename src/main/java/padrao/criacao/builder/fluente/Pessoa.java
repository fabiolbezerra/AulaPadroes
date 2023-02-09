/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.builder.fluente;

import java.util.Date;

/**
 *
 * @author Fabio
 */
public class Pessoa {

    private String nome;
    private String cargo;
    private Date dataNascimento;

    public Pessoa() {
        System.out.println("Builder com Interface Fluente");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Pessoa chamada(String nome) {
        this.nome = nome;
        return this;
    }

    public Pessoa nascidaEm(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public Pessoa comCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome                : ").append(nome);
        sb.append('\n');
        sb.append("Data de Nascimento: ").append(dataNascimento);
        sb.append('\n');
        sb.append("Cargo             : ").append(cargo);
        return sb.toString();
    }
    
    
}
