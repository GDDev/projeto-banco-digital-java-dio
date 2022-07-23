public abstract class Conta implements iConta{

    private int agencia;
    private int numero;
    private double saldo;

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0d;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void infosConta(){
        System.out.println("Conta: " + this.getNumero() + "\n"
        + "Agência: " + this.getAgencia());
        System.out.printf("Saldo: R$%.2f", this.getSaldo());  
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;        
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

}