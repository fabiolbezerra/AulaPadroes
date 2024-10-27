package padrao.comportamental.command;

public class Brinquedo {
    public void paraFrente(int distancia) {
        System.out.printf("Movendo %d unidades para frente\n", distancia);
    }

    public void paraTras(int distancia) {
        System.out.printf("Movendo %d unidades para trás\n", distancia);
    }

    public void girarEsquerda(double graus) {
        System.out.printf("Girando %.2f para esquerda\n", graus);
    }

    public void girarDireita(double graus) {
        System.out.printf("Girando %.2f para esquerda\n", graus);
    }

}
