package padrao.estrutural.composite;

public class TrechoComposto implements TrechoAereo {

    private TrechoAereo primeiro;
    private TrechoAereo segundo;
    private double taxaconexao;

    public TrechoComposto(TrechoAereo primeiro, TrechoAereo segundo,
            double taxaconexao) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.taxaconexao = taxaconexao;
        if (!primeiro.getDestino().equals(segundo.getOrigem())) {
            throw new RuntimeException("O destino do primeiro não é igual a origem do segundo");
        }
        System.out.println("\tTaxa de conexão (" + this.segundo.getOrigem() + "): " + this.taxaconexao);
    }

    @Override
    public String getOrigem() {
        return primeiro.getOrigem();
    }

    @Override
    public String getDestino() {
        return segundo.getDestino();
    }

    @Override
    public double getPreco() {
        return primeiro.getPreco() + segundo.getPreco() + taxaconexao;
    }

}
