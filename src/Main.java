import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando um banco
        // Criando uma lista com as opções de conta do banco
        List<String> tiposDeContas = new ArrayList<String>();
        tiposDeContas.add("Conta Corrente"); 
        tiposDeContas.add("Conta Poupança");
        Banco bancoDaPraca = new Banco("Banco da Praça", tiposDeContas);
        // System.out.println(bancoDaPraca.getNome());
        // for (String conta : bancoDaPraca.getTiposDeContas()) {
        //     System.out.println(conta);
        // }

        // Criando os clientes
        Cliente sarah = new Cliente("Sarah", "Huston", 111111);
        Cliente michael = new Cliente("Michael", "Muller", 666666);
        // System.out.println(sarah.getNome());
        // System.out.println(sarah.getSobrenome());
        // System.out.println(sarah.getCpf());
        // System.out.println(sarah.getScore());
        // System.out.println(sarah.getDivida());
        // System.out.println(sarah.getEmprestimo());

        // Adicionando os clientes ao banco
        bancoDaPraca.addCliente(sarah);
        bancoDaPraca.addCliente(michael);
        // for (Cliente cliente : bancoDaPraca.getClientes()) {
        //     System.out.println(cliente.getNome());
        // }

        // Criando contas para os clientes
        Conta contaSarah = new ContaPoupanca(sarah);
        contaSarah.depositar(500);
        Conta contaMichael = new ContaCorrente(michael);
        // System.out.println(contaSarah.getTitular().getNome());
        // System.out.println(contaSarah.getSaldo());
        // System.out.println(contaSarah.getAgencia());
        // System.out.println(contaSarah.getNumero());
        // System.out.println(contaMichael.getSaldo());
        contaMichael.pegarEmprestimo(10000);
        // contaMichael.infosConta();
        // System.out.println();
        // System.out.println(michael.getDivida());
        // System.out.println(michael.getScore());
        contaSarah.depositar(5000);
        contaSarah.transferir(5000, contaMichael);
        contaSarah.infosConta();
        System.out.println();
        contaMichael.infosConta();
        System.out.println();
        System.out.println(michael.getDivida());
        System.out.println(michael.getScore());
        contaMichael.sacar(2300);
        contaMichael.infosConta();
    }
}
