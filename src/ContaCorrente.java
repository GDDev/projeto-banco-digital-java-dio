public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente titular) {
        super(titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Corrente");
        super.infosConta();   
    }

}
