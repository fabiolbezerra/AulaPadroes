package padrao.estrutural.proxy;

public interface Conta {

    public void depositar(double valor);

    public void sacar(double valor);
    
    public double getSaldo();
}
