/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.prototype;

/**
 *
 * @author Fabio
 */
public class PrincipalSimples {

    public static void main(String[] args) throws CloneNotSupportedException {
        Animal animal01 = new Animal();
        animal01.setNome("Don");
        animal01.setIdade(10);
        System.out.println(animal01);

        System.out.println("Clonando um animal - Implements Clonable");
        Animal animal02 = (Animal) animal01.clone();
        System.out.println(animal02);
        
        System.out.println("Testando a clonagem do animal");
        System.out.println(animal01 == animal02);
        System.out.println(animal01.equals(animal02));
        System.out.println(animal01.getNome() == animal02.getNome());
        
        Pessoa pessoa01 = new Pessoa("Fulano", 25);
        System.out.println(pessoa01);
        
        System.out.println("Clonando uma pessoa");
        Pessoa pessoa02 = new Pessoa();
        pessoa02.setNome(pessoa01.getNome());
        pessoa02.setIdade(pessoa01.getIdade());
        
        System.out.println("Testando a clonagem da pessoa");
        System.out.println(pessoa01 == pessoa02);
        System.out.println(pessoa01.equals(pessoa02));
        System.out.println(pessoa01.getNome() == pessoa02.getNome());
    }
}
