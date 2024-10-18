package padrao.estrutural.decorator;

import padrao.estrutural.decorator.bebida.decorada.Caramelo;
import padrao.estrutural.decorator.bebida.decorada.Creme;
import padrao.estrutural.decorator.bebida.Bebida;
import padrao.estrutural.decorator.bebida.Expresso;

public class PrincipalCafeteria {

    public static void main(String[] args) {
        //Um café expresso
        Bebida cafe1 = new Expresso();
        System.out.println(cafe1.getDescricao());
        System.out.println(cafe1.getPreco());

        System.out.println("\n* * *\n");

        //Café expresso com creme (primeiro decorador) e caramelo (segundo decorador)
        Bebida cafe2 = new Caramelo(new Creme(new Expresso()));
        System.out.println(cafe2.getDescricao());
        System.out.println(cafe2.getPreco());
    }

}
