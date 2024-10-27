package padrao.comportamental.command.comandos;

import padrao.comportamental.command.Brinquedo;

public class MoverParaFrente implements Comando{
    private int distancia = 10;
    private Brinquedo brinquedo;

    public MoverParaFrente(Brinquedo brinquedo) {
        this.brinquedo = brinquedo;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public void executar() {
        brinquedo.paraFrente(distancia);
    }
}
