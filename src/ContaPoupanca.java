public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente titular) {
        super(titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Poupança");
        super.infosConta();   
    }

}
