package padrao.estrutural.composite;

public class Principal {

    public static void main(String[] args) {
        TrechoAereo simples1 = new TrechoSimples("São Paulo", "Brasília", 500);
        TrechoAereo simples2 = new TrechoSimples("Brasília", "Recife", 300);
        TrechoAereo simples3 = new TrechoSimples("Recife", "Natal", 350);

        TrechoAereo composto1 = new TrechoComposto(simples1, simples2, 30);

        TrechoComposto viagem = new TrechoComposto(composto1, simples3, 50);
        System.out.println("Preço da Viagem: " + viagem.getPreco());
    }

}
