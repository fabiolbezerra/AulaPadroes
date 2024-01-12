/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.criacao.prototype.simples;

/**
 *
 * @author Fabio
 */
public class Principal {

    public static void main(String[] args) throws CloneNotSupportedException {
        Animal animal1 = new Animal();
        animal1.setNome("Don");
        animal1.setIdade(10);
        System.out.println(animal1);

        Animal animal2 = (Animal) animal1.clone();
        System.out.println(animal2);
        
        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.getNome() == animal2.getNome());
    }
}
