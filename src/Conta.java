public abstract class Conta implements iConta {

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente titular;

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente titular) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0d;
        this.titular = titular;
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

    public Cliente getTitular() {
        return titular;
    }

    protected void infosConta() {
        System.out.println("Conta: " + this.getNumero() + "\n"
                + "Agência: " + this.getAgencia() + "\n" 
                + "Titular: " + this.getTitular().getNome());
        System.out.printf("Saldo: R$%.2f", this.getSaldo());
    }

    @Override
    public void sacar(double valor) {
            if(valor > 0 && this.saldo >= valor){
                this.saldo -= valor; 
            } 
    }

    @Override
    public void depositar(double valor) {
        if(valor > 0){
            if (this.titular.getEmprestimo()) {
                this.titular.removerDivida(valor);
            } else {
                this.saldo += valor;
            }
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(valor > 0 && contaDestino != null){
            if(this.saldo >= valor){
                this.sacar(valor);
                contaDestino.depositar(valor);
            }
        }
    }

    @Override
    public void pegarEmprestimo(double valor) {
        if(!(this.getTitular().getScore() < 0)) {
            if(valor >= 10000) {
                this.titular.addDivida(valor);
                this.saldo += valor;
            }
        }
    }

}