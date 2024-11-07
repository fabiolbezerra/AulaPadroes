package padrao.comportamental.state;

public class Cliente {
    public static void main(String[] args) {
        //Instalando a máquina no local
        MaquinaDeBebidas maquinaDeRefrigerantes = new MaquinaDeBebidas();
        //Recarrego a máquina
        maquinaDeRefrigerantes.recarregarEstoque();

        System.out.println("******");

        //Fluxo normal
        maquinaDeRefrigerantes.selecionarItem();
        maquinaDeRefrigerantes.pagarItem();
        maquinaDeRefrigerantes.retirarItem();

        System.out.println("******");

        //Fluxos incorretos
        //Iniciando tentando retirar um item
        maquinaDeRefrigerantes.retirarItem();
        //Iniciando tentando pagar um item
        maquinaDeRefrigerantes.pagarItem();
    }
}
