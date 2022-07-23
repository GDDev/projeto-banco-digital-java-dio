import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private List<String> tiposDeContas = new ArrayList<String>();

    public Banco(String nome, List<String> tiposDeContas) {
        this.nome = nome;
        this.tiposDeContas = tiposDeContas;
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<String> getTiposDeContas() {
        return tiposDeContas;
    }

    public void addCliente(Cliente cliente){
        if(cliente != null) this.clientes.add(cliente);
    }

}