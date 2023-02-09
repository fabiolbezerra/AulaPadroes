package padrao.estrutural.decorator;

public class PrincipalCafeteria {

    public static void main(String[] args) {
        Bebida cafe1 = new Expresso();
        System.out.println(cafe1.getDescricao());
        System.out.println(cafe1.getPreco());

        System.out.println("***");

        Bebida cafe2 = new Caramelo(new Creme(new Expresso()));
        System.out.println(cafe2.getDescricao());
        System.out.println(cafe2.getPreco());
    }

}
