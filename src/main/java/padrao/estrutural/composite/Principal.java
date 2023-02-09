package padrao.estrutural.composite;

public class Principal {

    public static void main(String[] args) {
        TrechoSimples ts1 = new TrechoSimples("São Paulo", "Brasília", 500);
        TrechoSimples ts2 = new TrechoSimples("Brasília", "Recife", 300);
        TrechoSimples ts3 = new TrechoSimples("Recife", "Natal", 350);
        TrechoComposto tc1 = new TrechoComposto(ts1, ts2, 30);

        TrechoComposto viagem = new TrechoComposto(tc1, ts3, 50);
        System.out.println("Preço da Viagem: " + viagem.getPreco());
    }

}
