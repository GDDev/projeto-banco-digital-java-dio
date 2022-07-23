public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca();
        cc.transferir(cc.getSaldo(), poupanca);

        poupanca.sacar(25);

        cc.imprimirExtrato();
        System.out.println("\n\n");
        poupanca.imprimirExtrato();
    }
}
