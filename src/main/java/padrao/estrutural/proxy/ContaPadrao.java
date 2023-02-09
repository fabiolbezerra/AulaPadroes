package padrao.estrutural.proxy;

public class ContaPadrao implements Conta {

    private double saldo;

    @Override
    public void depositar(double valor) {
        System.out.println("Depositando ...");
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        System.out.println("Sacando ...");
        saldo -= valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

}
