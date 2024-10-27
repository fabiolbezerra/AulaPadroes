package padrao.comportamental.command.comandos;

import padrao.comportamental.command.Brinquedo;
import padrao.comportamental.command.Comando;

public class GirarEsquerda implements Comando {
    private double graus = 90.0;
    private Brinquedo brinquedo;

    public GirarEsquerda(Brinquedo brinquedo) {
        this.brinquedo = brinquedo;
    }

    public void setGraus(double graus) {
        this.graus = graus;
    }

    @Override
    public void executar() {
        brinquedo.girarEsquerda(graus);
    }
}
