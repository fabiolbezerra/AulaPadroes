package padrao.comportamental.command.comandos;

import padrao.comportamental.command.Brinquedo;

public class GirarDireita implements Comando{
    private double graus = 90.0;
    private Brinquedo brinquedo;

    public GirarDireita(Brinquedo brinquedo) {
        this.brinquedo = brinquedo;
    }

    public void setGraus(double graus) {
        this.graus = graus;
    }

    @Override
    public void executar() {
        brinquedo.girarDireita(graus);
    }
}
