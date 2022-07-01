import java.util.ArrayList;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public boolean novoCliente(String nome, double transacaoInicial){
        Cliente c = new Cliente(nome, transacaoInicial);
        if (buscarCliente(nome) != null) {
            return false;
        }
        this.clientes.add(c);
        return true;
    }

    public boolean adicionarTransacaoCliente(String nome, double transacao){
        if (buscarCliente(nome) == null) {
            return false;
        }
        Cliente c = new Cliente(nome, transacao);
        int posicao = this.clientes.indexOf(c);
        c = this.clientes.get(posicao);
        c.adicionarTransacoes(transacao);
        return true;
    }

    public Cliente buscarCliente(String nome){
        Cliente c = new Cliente(nome, 0);
        int posicao = clientes.indexOf(c);
        if (posicao == -1) return null;
        return clientes.get(posicao);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof Agencia)) return false;

        Agencia agencia = (Agencia) obj;

        return this.nome.equals(agencia.getNome());
    }
}
