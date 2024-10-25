package padrao.comportamental.state;

public class Cliente {
    public static void main(String[] args) {
        MaquinaDeBebidas maquinaDeRefrigerantes = new MaquinaDeBebidas();

        //Fluxo normal
        maquinaDeRefrigerantes.selecionarItem();
        maquinaDeRefrigerantes.pagarItem();
        maquinaDeRefrigerantes.retirarItem();

        //Fluxos incorretos
        //Iniciando tentando pagar um item
        maquinaDeRefrigerantes.pagarItem();
        //Iniciando tentando retirar um item
        maquinaDeRefrigerantes.retirarItem();
    }
}
