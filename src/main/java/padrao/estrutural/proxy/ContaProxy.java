package padrao.estrutural.proxy;

public class ContaProxy implements Conta {

    private Conta conta;

    public ContaProxy(Conta conta) {
        this.conta = conta;
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Logando depósito de " + valor);
        conta.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        System.out.println("Logando saque de " + valor);
        conta.sacar(valor);
    }

    @Override
    public double getSaldo() {
        return conta.getSaldo();
    }

}
