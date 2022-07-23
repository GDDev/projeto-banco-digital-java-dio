public class Cliente {

    private String nome;
    private String sobrenome;
    private long cpf;
    private double score;
    private boolean emprestimo;
    private double divida;

    public Cliente(String nome, String sobrenome, long cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.emprestimo = false;
        this.score = 0d;
        this.divida = 0d;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public long getCpf() {
        return cpf;
    }

    public double getScore() {
        return score;
    }

    public double getDivida() {
        return divida;
    }

    public boolean getEmprestimo() {
        return emprestimo;
    }

    protected void addDivida(double valor) {
        this.emprestimo = true;
        this.divida += valor;
        this.score -= valor * 0.1;
    }

    protected void removerDivida(double valor) {
        this.divida -= valor;
        this.score += valor * 0.05;
    }
    
}
