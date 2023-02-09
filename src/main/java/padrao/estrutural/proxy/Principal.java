package padrao.estrutural.proxy;

public class Principal {

    public static void main(String[] args) {
        Conta conta = new ContaProxy(new ContaPadrao());
        System.out.println("Saldo inicial: " + conta.getSaldo());
        conta.depositar(100);
        conta.depositar(10);
        conta.depositar(30);
        conta.sacar(125);
        System.out.println("Saldo final: " + conta.getSaldo());
        System.out.println("********************************");
        Conta padrao = new ContaPadrao();
        System.out.println("Saldo inicial: " + padrao.getSaldo());
        padrao.depositar(100);
        padrao.depositar(10);
        padrao.depositar(30);
        padrao.sacar(125);
        System.out.println("Saldo final: " + padrao.getSaldo());
    }

}
